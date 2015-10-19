/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instances;
import java.util.Scanner;
/**
 *
 * @author olalkeith
 */
public class Animals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mammals mammalsObject = new mammals();
        System.out.println("Enter name of first gf here: ");
        String temp = input.nextLine();
        mammalsObject.setName(temp);
        mammalsObject.saying();
       
    }
    
}
