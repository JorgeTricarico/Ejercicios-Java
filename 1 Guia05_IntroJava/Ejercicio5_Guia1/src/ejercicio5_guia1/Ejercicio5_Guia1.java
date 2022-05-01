/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_guia1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio5_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         Escribir un programa que lea un número entero por teclado y muestre por pantalla 
        el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
        Math.sqrt(). 
        */
        
        
       System.out.println("Ingrese un numero entero!");
       Scanner leer = new Scanner(System.in);
       int numero = leer.nextInt();
       int doble = numero*2;
       System.out.println("El doble es " + doble);
       int triple = numero*3;
       System.out.println("El triple es " + triple); 
       double Raiz = sqrt(numero);
        System.out.println("La raiz cuadrada es " + Raiz);
        
       
       
       
       
       
    }
    
}
