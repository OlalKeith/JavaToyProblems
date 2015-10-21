/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;


/**
 *
 * @author olalkeith
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    mammals mammalsObject = new mammals();
    
    System.out.println("Enter your name here: ");
    String name = input.nextLine();
    
    mammalsObject.simpleMessage(name);
    }
    
}
