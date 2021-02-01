/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("enter y or n");
        
       
      String  a =input.nextLine();
      if(a.equals("y")){
          System.out.println("Enter Your Email");
          String mail = input.nextLine();
          
           System.out.println("Enter Your Name");
            String name = input.nextLine();
            
             System.out.println("Enter Your Password");
           String  pass = input.nextLine();
           
        System.out.println("LOGIN with Your name and Password");
        System.out.println("--------------LOGIN PAGE-------------------");
         System.out.println("Enter Your Name");
            String name1 = input.nextLine();
      System.out.println("Enter Your Password");
           String  pass1 = input.nextLine();
           
if (name.equals(name1) || pass.equals(pass1)){

    System.out.println("Enter Your MARKS");
    System.out.println("Enter Your  java MARKS");
    int i = input.nextInt();
    
     System.out.println("Enter Your  C++ MARKS");
    int i1 = input.nextInt();
    
     System.out.println("Enter Your  SQL MARKS");
    int i2 = input.nextInt();
    
    System.out.println("_________________________________-");
    int obtain = i+i1+i2;
    System.out.println("Your Total marks is:  300" );
    System.out.println("Your obtain marks is: " +obtain);
    double total = 300;
    double per = (obtain/total)*100;
    System.out.println("Your Percrntage is: " +per);
    
    char grade;
     if (per >= 90)
      {
         grade = 'A';
      }
      else if (per >= 80)
      {
         grade = 'B';
      }
      else if (per >= 70)
      {
         grade = 'C';
      }
      else if (per >= 50)
      {
         grade = 'D';
      }
      else
      {
         grade = 'F';
      }

      System.out.println("Your grade is " + grade);
   
    
    
    
    
    
}else{System.out.println("your name or password are is incorrect");}
      }
      else {
      System.out.println("OK bye");
      }
      
  

     
       
    }
    
}
