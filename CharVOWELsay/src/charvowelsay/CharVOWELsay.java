/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charvowelsay;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class CharVOWELsay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input1 = new Scanner(System.in);
        System.out.println("enter vowels");
        
       char c =input1.next().charAt(0);
     
      if(c==('a')||c==('e')||c==('i')||c==('o')||c==('u')||c==('A')||c==('I')||c==('E')||c==('O')||c==('U')){
          System.out.println("vowel");
        
        
        
    }else{
          System.out.println("not vowel");
      }
    }
    
}
