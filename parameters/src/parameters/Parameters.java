/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameters;

import java.util.Scanner;
public class Parameters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NewClass NewClassObject = new NewClass (); 
        
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        NewClassObject.simpleMessage(name);
       
         
         
       
    }
    
}
