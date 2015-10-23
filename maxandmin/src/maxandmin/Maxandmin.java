/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxandmin;

/**
 *
 * @author olalkeith
 */
public class Maxandmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[]values = {81,52,33,95,18,4,7};
        double largest = values[0];
        for (int i = 0; i < values.length; i++){
            if (values[i] > largest){
                largest = values[i];
            }
        }
        System.out.print(largest);
    
    }
}
