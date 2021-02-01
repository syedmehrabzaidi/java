/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsecalculator;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class IfELSEcalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("enter 1 for add" );
        System.out.println("enter 2 for sub" );
              System.out.println("enter 3 for mul" );
                       System.out.println("enter 4 for Divide" );
                                 System.out.println("----Select any method----" );
       
        int i = input.nextInt();
        if (i>0 && i <5){
        System.out.println("Enter 1st number");
        double a =input.nextInt();
         System.out.println("Enter 1st number");
        double b =input.nextInt();
        double result;
        if (i == 1){
            result= a+b;     
            System.out.println("Your answer is : " +result);
        }
        else if (i == 2 ){
            result= a-b;    
            System.out.println("Your answer is : " +result);
        }
        else if (i == 3 ){
            result= a*b;   
            System.out.println("Your answer is : " +result);
        }
        else if (i == 4){
            result= a/b;   
            System.out.println("Your answer is : " +String.format("%.2f", result));
        }
  
        }else{{System.out.println("inavlid");}
                       
    }
    
}
}