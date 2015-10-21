 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        jayClass jayClassObject = new jayClass();
        System.out.println("Enter name of first gf here: ");
        String temp = input.nextLine();
        jayClassObject.setName(temp);
        jayClassObject.saying();
        // TODO code application logic here
    }
    
}
