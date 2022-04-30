/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

import java.util.Arrays;

/**
 *
 * @author Notebook
 */
public class JavaApplication74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s = "You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"; // or the-stealth-warrior
        
        System.out.println(toCamelCase(s));
        
    }
    
  static String toCamelCase(String s){
    
        String s2 = s;
        
        System.out.println(s2.length());
//        for (int i = 0; i < s2.length(); i++) {
//            
//            if ("-".equals(s2.substring(i, i+1)) || ("_".equals(s2.substring(i, i+1)))) {
//                
//                s2=s2.replace(s.substring(i+1, i+2).charAt(0), s2.substring(i+1, i+2).toUpperCase().charAt(0));
//            }
//      }
      if (s2.contains("_")) {
          s2= s2.replace("_", "");
      }
      if (s2.contains("-")) {
          s2= s2.replace("-", "");
      }
      
       return s2;
      }
  }
