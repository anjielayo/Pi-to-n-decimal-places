/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinthdigit;
import static java.lang.Math.PI;
import java.math.BigDecimal;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class Pinthdigit {
public static void nthdigit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of decimal places (between 0 and 10): ");
        int i = input.nextInt();
        
        if (i>10 || i<0){
            System.out.println("Excess Decimal Places!");
}
        else{
            BigDecimal round=new BigDecimal(PI).setScale​(i, BigDecimal.ROUND_DOWN);
            System.out.println("Your value of PI is "+ round + " to " + i + " decimal places.");
            
}
   
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pinthdigit Anjie=new Pinthdigit();
        Anjie.nthdigit();
       
    }
    
}
