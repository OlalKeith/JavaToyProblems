// Using java, have the function divide(num1,num2)
// take both parameters being passed and return the Greatest Common Factor.
// That is, return the greatest number that evenly goes into both numbers with no remainder.
// For example: 20 and 10 both are divisible by 1, 2, 5 and 10 so the output should be 10.
// The range for both parameters will be from 1 to 10^3./
package gcf;

import java.util.Scanner;

public class Gcf {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
       
       int gcd = 1; 
       int k = 2;
       
       while (k <= num1 && k <= num2){
           if (num1 % k == 0 && num2 % k == 0){
       }
           
    gcd = k;
    k++;
    
}
       System.out.println("The GCD for "+num1+ " and "+num2+ " is " + gcd);
       
    }
    
}
    
