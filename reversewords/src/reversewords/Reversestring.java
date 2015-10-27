/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversewords;

/**
 *
 * @author olalkeith
 */
public class Reversestring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string = "reverse words of a sentence";
        
        StringBuffer sb=new StringBuffer(string);
        
        sb.reverse();
        
        System.out.println(sb);
    }
    
}
