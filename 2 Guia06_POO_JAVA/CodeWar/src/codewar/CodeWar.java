/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewar;

/**
 *
 * @author Notebook
 */
public class CodeWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
     public static int squareDigits(int n) {
    String numeroCadena2="";    
    String numeroCadena= n+"";
    
         for (int i = 0; i < numeroCadena.length(); i++) {
                
        String subString = numeroCadena.substring(i, (i+1));
        
        int numeroElevadoInt = Integer.parseInt(subString);
        numeroElevadoInt = numeroElevadoInt*numeroElevadoInt;
         
        String numeroElevadoCadena = numeroElevadoInt+"";
        
        numeroCadena2 = numeroCadena2.concat(numeroElevadoCadena);
            
         }
       
        
     int numEntero = Integer.parseInt(numeroCadena2);
         
    return Integer.parseInt(numeroCadena2);
  }

      
    
    
  

}


  