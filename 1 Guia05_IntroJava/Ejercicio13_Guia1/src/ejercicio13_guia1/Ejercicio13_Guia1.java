/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio13_Guia1 {

    /*
     13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
    solicite números al usuario hasta que la suma de los números introducidos supere el 
    límite inicial.
     */
    public static void main(String[] args) {
     System.out.println("Ingrese el valor limite de la suma de numeros.");
     Scanner leer = new Scanner(System.in);
     int max = leer.nextInt();
     int n;
     int suma=0;
     do {
    System.out.println("Ingrese el numero a sumar");
    n = leer.nextInt();
    suma = suma + n;
    } while (suma <= max);
     
     if (suma >= max) {
         System.out.println("Ya se supero el valor limite: " + max);

     }
    
     
     
    
    }
    
}
