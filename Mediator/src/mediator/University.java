/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author TOSHIBA
 */
public class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
    }
    
}
