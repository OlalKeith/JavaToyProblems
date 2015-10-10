/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.statement;

/**
 *
 * @author olalkeith
 */
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age;
        age = 3;
        //A switch statement allows a variable to be tested for equality against a list of values. 
        //Each value is called a case, and the variable being switched on is checked for each case.
        switch (age){
            case 1:// if value of age is = 1 what do u want to do.
          
                System.out.println("you can dance");
                
                
                break; //if the condition is true end the program
            case 2:
               
                System.out.println("you can sing");
               
                break;
                
            case 3:
               
                System.out.println("you can eat");
               
                break;  
                
            default:
                System.out.println("you are old");
                
        }
        
    }
    
}
