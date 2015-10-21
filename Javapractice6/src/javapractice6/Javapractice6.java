/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice6;

/**
 *
 * @author olalkeith
 */
import java.util.Scanner;
public class Javapractice6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner james = new Scanner(System.in);
        
        int girls, boys, people;
        boys =11;
        girls =3;
        //the modulus operator is a way of finding  a remainder
        people = girls % boys;
        System.out.println(people);
        // TODO code application logic here
    }
    
}
