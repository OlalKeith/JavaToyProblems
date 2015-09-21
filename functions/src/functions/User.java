/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author olalkeith
 */

import java.util.Scanner;
public class User {
	static int sum = 0;
	static int adds_n(int num) {
		if(num > 1000){
			System.out.println("unknown number");
		}else{
	       for(int i = 0; i <= num; i++){
	    	   sum = sum + i;
	       }
		}
	    return sum;

	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s = new Scanner(System.in);
		System.out.println("enter an integer betwn 1 - 1000");
	    //Function c = new Function();
	    System.out.print(adds_n(s.nextInt()));
	}

}