/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytha;
import java.util.*;
/**
 *
 * @author legok
 */
public class Pytha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a;
        double b;
        
        Scanner eScanner = new Scanner(System.in);
        Methods theo = new Methods();
        
        System.out.println("Please enter two numbers.");
        
        a = eScanner.nextDouble();
        theo.setSideA(a);
        
        b = eScanner.nextDouble();
        theo.setSideB(b);
        
        System.out.println("Side A is " + a + " and side B is " + b);
        
        System.out.println("The hypotenuse is ");
        theo.pyth(a,b);
    }
    
}
