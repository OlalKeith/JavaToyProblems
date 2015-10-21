/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical.operators;

/**
 *
 * @author olalkeith
 */
public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int boy, girl;
        boy = 18;
        girl = 50;
        
        if (boy > 20 || girl > 80){
        System.out.println("you can enter");
    }else{
          System.out.println("you cannot enter");  
            }
    }
    
}
