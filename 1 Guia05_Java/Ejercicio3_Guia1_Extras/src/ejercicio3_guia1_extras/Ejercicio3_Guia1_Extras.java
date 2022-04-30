/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia1_extras;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio3_Guia1_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese una letra, el programa determinara si es vocal o no.");
        Scanner leer = new Scanner(System.in);
        String letra = leer.next();
        
        switch (letra) {
            case "a" : 
                System.out.println("Ingresaste una vocal.");
                break;
            case "e" : 
                System.out.println("Ingresaste una vocal.");
                break;
            case "i" : 
                System.out.println("Ingresaste una vocal.");
                break;
            case "o" : 
                System.out.println("Ingresaste una vocal.");
                break;
            case "u" : 
                System.out.println("Ingresaste una vocal.");
                break;    
            default:
                System.out.println("No ingresaste una vocal.");
        }
        
    }
    
}
