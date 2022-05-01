/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio4_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        
        Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
        grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        */
        
        System.out.println("Ingrese la cantidad de grandos Centigrados");
        Scanner leer = new Scanner(System.in);
        int Grados = leer.nextInt();
        int F = 32+(9*Grados/5);
        System.out.println("En Farengeint son " + F + "°.");
                
    }
    
}
