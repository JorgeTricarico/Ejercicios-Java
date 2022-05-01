/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03_guia1_extras2;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio03_Guia1_Extras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una letra, el programa determinara si es vocal o no.");
        Scanner leer = new Scanner(System.in);
        String letra = leer.next();
        letra = letra.toLowerCase(); 
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Ingresaste una vocal.");
        } else {
            System.out.println("No ingresaste una vocal.");
        }
    }
    
}
