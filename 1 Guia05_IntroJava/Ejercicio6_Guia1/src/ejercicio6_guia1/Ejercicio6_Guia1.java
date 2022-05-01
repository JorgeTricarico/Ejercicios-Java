/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio6_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Ingrese un numero entero");
         Scanner leer = new Scanner(System.in);
         int numero1 = leer.nextInt();
         System.out.println("Ingrese otro numero entero distinto al anterior");
         int numero2 = leer.nextInt();
         int mayor;
         
         if (numero1>numero2) {
             mayor=numero1;
         }
         else {
             mayor=numero2;
         }
         
         System.out.println("El entero mayor es " + mayor);
         
    }
    
}
