/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class vowelcharsay {
    
     Scanner input1 = new Scanner(System.in);
        System.out.println("enter vowels");
        
       char c =input1.next().charAt(0);
     
      if(c==("a")||c==("e")||c==("i")||c==("o")||c==("u")||c==("a")||c==("e")||c==("i")||c==("o")||c==("u")){
          System.out.println("vowel");
        
        
        
    }else{
          System.out.println("not vowel");
      }
    
}
}