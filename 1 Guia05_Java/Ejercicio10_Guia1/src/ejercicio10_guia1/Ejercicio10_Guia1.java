/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio10_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase que comience con 'A'.");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        String letra = frase.substring(0,1);
        
        if (letra.equals("a")) {
        System.out.println("Correcto!");
        } else {
        System.out.println("Incorrecto!");
        }
        
    }
    
}
