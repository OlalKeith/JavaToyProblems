/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodswithparameters;
import java.util.Scanner;
public class Methodswithparameters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      beansClass beansClassObject = new beansClass ();
      
      System.out.println("Enter your name here: ");
      String name = input.nextLine();
      
      beansClassObject.simpleMessage(name);
    }
    
}
