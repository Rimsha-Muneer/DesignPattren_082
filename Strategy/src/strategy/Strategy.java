/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;
import java.util.ArrayList;
import java.util.Iterator;
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("Code complete",120);
		Item item2 = new Item("Design patterns in java: a practical tutorial",100);

		cart.addItem(item1);
		cart.addItem(item2);

		cart.setPaymentStrategy(new Paypal("myemail@example.com", "mypwd"));
		//pay by paypal
		cart.checkOut();

		//pay by credit card
		cart.setPaymentStrategy(new CreditCard("Syed Sajid Hussain", "1234567890123456", "1234", "12/20"));
		cart.checkOut();
    }
    
}


class Item {
	private String name;
	private int price;
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
}

interface PaymentStrategy {
	void pay(int amount);
}

class CreditCard implements PaymentStrategy{
	String name;
	String cardNr;
	String pin;
	String dateOfExpiry;
	
	public CreditCard(String name, String cardNr, String pin, String dateOfExpiry) {
		this.name = name;
		this.cardNr = cardNr;
		this.pin = pin;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+ "PKR has been paid from your credit card "+cardNr);
		
	}

}

class Paypal implements PaymentStrategy{
	private String emailAddress;
	private String pwd;
	public Paypal(String emailAddress, String pwd) {
		this.emailAddress = emailAddress;
		this.pwd = pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+ "PKR has been successfully payed from your Paypal account "+emailAddress);
		
	}

}

 class ShoppingCart {
	private ArrayList<Item> items = new ArrayList<Item>();
	private PaymentStrategy strategy;
	
	public void addItem(Item item){
		this.items.add(item);
	}
	public int calculateTotalAmount(){
		Iterator<Item> iterator = items.iterator();
		int total = 0;
		while(iterator.hasNext()){
			total+=iterator.next().getPrice();
		}
		return total;
		
	}
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void checkOut(){
		int total = calculateTotalAmount();
		strategy.pay(total);
	}
	
}
