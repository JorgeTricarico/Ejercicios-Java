/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

import java.util.Arrays;

public class FindOdd {
    
    
	public static int findIt(int[] a) {
            
            for (int i = 0; i < a.length; i++) {
                int count=0;
                
                for (int j = 0; j < a.length; j++) {
                    if (a[i]==a[j]) {
                        count++;
                    }
                    if (count%2 !=0) {
                        return a[i];
                    }
                }
            }

            
  	return 0;
  }
}
