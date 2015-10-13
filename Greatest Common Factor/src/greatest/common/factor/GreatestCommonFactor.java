// Using java, have the function divide(num1,num2)
// take both parameters being passed and return the Greatest Common Factor.
// That is, return the greatest number that evenly goes into both numbers with no remainder.
// For example: 20 and 10 both are divisible by 1, 2, 5 and 10 so the output should be 10.
// The range for both parameters will be from 1 to 10^3./
package greatest.common.factor;

//import java class to take user input from console
import java.util.Scanner;

public class GreatestCommonFactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); //create a scanner object. it helps read
       //user input from the console.
//promote the user to input number in the console
       System.out.println("Enter first number: ");
       //create an integer variable num1
       int num1 = input.nextInt(); //using scanner class next int method take number entered by user and assign it to num1 variable
        System.out.println("Enter second number: ");
       int num2 = input.nextInt();
       //create 2 int variables
       int gcd = 1; // if numbers do not have any common diviser.1 is the gcd of those numbers. eg 4,5 and 7
       int k = 2; //testing of gcd begins at 2,3 and so on..
       
       while (k <= num1 && k <= num2){
           if (num1 % k == 0 && num2 % k == 0){
       }
           
    gcd = k;
    k++;
    
}
       System.out.println("The GCD for "+num1+ " and "+num2+ " is " + gcd);
       
    }
    
}