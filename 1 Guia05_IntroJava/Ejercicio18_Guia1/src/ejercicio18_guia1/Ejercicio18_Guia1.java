/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio18_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese 4 numeros");
        Scanner leer = new Scanner(System.in);
        System.out.println();
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int n3 = leer.nextInt();
        int n4 = leer.nextInt();
        System.out.println();
        // Buble para n1
        System.out.print(n1);
        
        for (int i = 0; i<=n1-1 ;i++) {
            
            System.out.print("*");
        }
        System.out.println();
        
        //Bucle para n2
        System.out.print(n2);
        
        for (int i = 0; i<=n2-1 ;i++) {
            
            System.out.print("*");
        }
        System.out.println();
        
        //Bucle para n3
        System.out.print(n3);
         for (int i = 0; i<=n3-1 ;i++) {
            
            System.out.print("*");
        }
        System.out.println();
        
        //Bucle para n4
        System.out.print(n4);
         for (int i = 0; i<=n4-1 ;i++) {
            
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
    }
    
}
