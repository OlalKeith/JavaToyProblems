/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple.classes;

/**
 *
 * @author olalkeith
 */
public class MultipleClasses {

    public static void main(String[] args) {
        
        donut donutobject = new donut();
        donutobject.simplemessage();
    }

    private static class donut {

        public  donut() {
        }

        private void simplemessage() {
             System.out.println("interesting"); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
