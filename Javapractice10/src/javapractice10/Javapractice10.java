/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice10;

/**
 *
 * @author olalkeith
 */
//instead of javapractice10 you write capitalise
import java.util.Scanner;
public class Javapractice10 {

  public static String capital(String str){
    String[] newStr = str.split(" ");
    StringBuffer strbuff = new StringBuffer();

    for(int i = 0; i < newStr.length; i++){
      strbuff.append(Character.toUpperCase(newStr[i].charAt(0)))
      .append(newStr[i].substring(1)).append(" ");
    }

    return strbuff.toString().trim();
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    System.out.println("enter string: ");
    System.out.println(capital(s.nextLine()));
  }

}

    /**
     * @param args the command line arguments
     */

