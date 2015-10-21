/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice5;

/**
 *
 * @author olalkeith
 */
import java.util.Scanner;
public class Javapractice5 {

    /**
     * you must not use two scanners on the same input stream.Use just one and call its nextDouble method as many times as you need, 
     * it will each time retrieve the next double parsed from the input stream.
     */
    public static void main(String[] args) {
        Scanner james = new Scanner (System.in);
        Double fnum, snum, answer;
        System.out.println("Enter first num:");
        fnum = james.nextDouble();
        System.out.println("Enter second num:");
         snum = james.nextDouble();
         answer = fnum + snum;
          System.out.println(answer);
     
               
        
        // TODO code application logic here
    }
    
}
