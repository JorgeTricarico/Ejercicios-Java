/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio22_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese la valor de la dimencion N");
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        System.out.println("");
        int[] vector = new int[n];
        int random;
        String[] cifras = new String[n];
        
        
        for (int i = 0; i < n; i++) {
            
            vector[i] =  random = (int) (Math.random()*10000);
            cifras[i] = (String.valueOf(vector[i]));
            System.out.print("La posicion "+i+" tiene --> ");
            System.out.print(cifras[i].length());
            System.out.println(" cifras.");
        }
        
       
        
    }
    
}
