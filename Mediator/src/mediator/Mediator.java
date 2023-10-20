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
public class Mediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
      
      University myUniversity = new University("MyUniversity");
myUniversity.sendMessage("Important announcement for all students.");
  
Teacher mrSmith = new Teacher("Teacher");
mrSmith.sendMessage("Announcess exams date");

    }
    
}
