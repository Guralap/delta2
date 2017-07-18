/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1691677
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d;
        Scanner input = new Scanner(System.in);
         System.out.print("Enter a:");
         a =input.nextInt();
          System.out.print("Enter b :");
         b=input.nextInt();
           System.out.print("Enter c:");
         c=input.nextInt();
        
        d = (b*b-4*a*c);
        System.out.println("d contains (b*b-4*a*c):"+d);
        double x1;
        double x2;
        JOptionPane.showMessageDialog(null,"Delta is:"+d);
        if (d>=0){
             x1=(-b-Math.sqrt(d))/(a*2);
             x2=(-b+Math.sqrt(d))/(a*2);
            JOptionPane.showMessageDialog(null,""+"x1 is "+x1
                    +"\n x2 is "+x2);
                    
        }
        else
            JOptionPane.showMessageDialog(null,"there is no real ");
    }
    
}
