/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio1_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase o palabra de 8 caracteres (incluyendo espacios)");
        Scanner leer = new Scanner(System.in);
        String Frase = leer.nextLine();
      
        if (Frase.length()== 8) {
        System.out.println("Correcto!");
        } else {
        System.out.println("Incorrecto!");
        }
    }}

   