/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author 1691677
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          double gallons;
        double liters;
       
       
        for(gallons=1;gallons<= 100;gallons++)
        {
            liters=gallons*3.7854;
            
            System.out.println(gallons+" gallons "+liters+" liters");
            
           
        }
    }
    
}
