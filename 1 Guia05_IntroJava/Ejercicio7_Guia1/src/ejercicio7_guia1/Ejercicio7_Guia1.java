/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio7_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------¿Tu Número es par?-------");
        System.out.println("Ingresa un numero y determinaremos si es par o impar con la magia de Java.");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        if (numero%2 == 0) {
        System.out.println("El numero "+ numero + " es par.");
        }
        else {
        System.out.println("El numero "+ numero + " es impar.");
        }
    }
    
}
