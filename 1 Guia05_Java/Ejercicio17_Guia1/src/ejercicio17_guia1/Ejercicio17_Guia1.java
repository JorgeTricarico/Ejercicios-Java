/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio17_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de lados de su cuadrado de astericos.");
        Scanner leer = new Scanner(System.in);
        int lados = leer.nextInt();
        for (int i=0;i<=lados-1; i++) {
         System.out.print("* ");
            
        }
         System.out.println();
        for (int j=0;j<=lados-2; j++) {
         System.out.print("*");
            for (int k=0;k<=((lados*2)-4); k++) {
         System.out.print(" ");   
        }
         System.out.println("*");    
        }
    for (int i=0;i<=lados-1; i++) {
         System.out.print("* ");
            
        }
    }
    
}
