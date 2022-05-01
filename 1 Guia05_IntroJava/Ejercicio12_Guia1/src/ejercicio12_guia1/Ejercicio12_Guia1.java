/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio12_Guia1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        /*
        12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
        la nota se pedirá de nuevo hasta que la nota sea correcta.
        */
        
        int n;
        Scanner leer = new Scanner(System.in);
        do {
        
        System.out.println("Ingrese la nota valuada entre 1 y 10");
        n = leer.nextInt();
    } while (n > 10 || n<1);
        
    } 
    
}
