/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio8_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Ingrese la contraseña.");
         Scanner leer = new Scanner(System.in);
         String contra = leer.nextLine();
         if (contra.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
