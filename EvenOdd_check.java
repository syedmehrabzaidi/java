/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd_check;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EvenOdd_check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int num;
  
         
            System.out.println("Enter serial Number");
            int count=0;
            int count1=0;
        for (int i = 1; i <=10; i++) {
            num= s.nextInt();
            if(num % 2 == 0){
                count++;
                
               
            }
            
            else   if(num % 2 != 0){
                count1++;
               
            }
           
        }
        if (count == 0 ){
                    System.out.println("no even");
  }else if(count1 == 0){
                    System.out.println("no odd");
    }
           
        
          
                             
                
          System.out.println(" #"+count);
          System.out.println("odd #"+count1);
        
          
       
        
    
         
         
         
         
         
         
         
         
         
        
    }
    
}
