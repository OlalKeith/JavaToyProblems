/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threesort;

/**
 *
 * @author olalkeith
 */
import java.util.Arrays;
public class Threesort {
    int num1, num2, num3;

    /**
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int[] threesort(int num1, int num2,int num3){
    int max = Math.max(num1, num2);
    int maxfinal = Math.max(max,num3);
    int min = Math.min(num1, num2);
    int minfinal = Math.min(min,num3);
    int mid = (num1 + num2 + num3)-minfinal - maxfinal;
    int result []= {minfinal, mid, maxfinal};  return result;
       
}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int result []=threesort (15,14,13);
      System.out.println (Arrays.toString(result));
        // TODO code application logic here
    }
    
}
