/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio9_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /*
        9.  Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
        */
        System.out.println("Ingrese una frase o palabra de 8 caracteres (incluyendo espacios)");
        Scanner leer = new Scanner(System.in);
        String Frase = leer.nextLine();
      
        if (Frase.length()== 8) {
        System.out.println("Correcto!");
        } else {
        System.out.println("Incorrecto!");
        }
    }}

   