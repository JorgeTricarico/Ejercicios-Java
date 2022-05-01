/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia1_java;

import java.util.Scanner;

//<*****************************************>
//Escribir un programa que pida dos números enteros por teclado y calcule la suma 
//de los dos. El programa deberá después mostrar el resultado de la suma.
//<*****************************************>
public class Ejercicio1_Guia1_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        int numero;
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int numero2;
        numero2 = leer.nextInt();
        int Suma = numero + numero2;
        System.out.println("La suma de los 2 enteros es " + Suma);
    }
}       
    


    
    
