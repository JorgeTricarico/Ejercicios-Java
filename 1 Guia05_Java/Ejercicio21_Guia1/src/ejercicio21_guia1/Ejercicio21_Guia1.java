/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio21_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la valor de la dimencion N");
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        int[] vector = new int[n];
        int random;
        for (int i = 0; i < n; i++) {
            
            vector[i] =  random = (int) (Math.random()*100);
        }
        
        System.out.println("Ingrese un numero que quiera buscar en el vector.");
        int N = l.nextInt();
        for (int i = 0; i < n; i++) {
            if (N==vector[i]) {
                System.out.println("El numero "+N+ " se encuentra en la columna "+i+" del vector.");
            }
        }
        
    }
    
}
