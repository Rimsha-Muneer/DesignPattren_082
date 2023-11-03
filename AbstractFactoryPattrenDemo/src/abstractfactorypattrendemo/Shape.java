/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattrendemo;

/**
 *
 * @author TOSHIBA
 */
public interface Shape {
     void draw();
    
}

class RoundedRectangle implements Shape{
  @Override
   public void draw() {
      System.out.println("Inside RoundedRectangle::draw() method.");
   }
}

class RoundedSquare implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside RoundedSquare::draw() method.");
   }
}

class Rectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}