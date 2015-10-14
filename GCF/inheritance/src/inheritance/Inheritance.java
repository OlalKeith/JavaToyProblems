/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author olalkeith
 */

import java.util.Scanner;
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        NewClass NewClassObject = new NewClass ();
        
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        
        NewClassObject.simpleMessage(name);
        
    }
    
}
