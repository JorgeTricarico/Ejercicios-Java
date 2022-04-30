/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio11_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.err.println("Ingrese el tipo de motor (1,2,3 o 4)");
         Scanner leer = new Scanner(System.in);
         int TipoMotor = leer.nextInt();
         switch (TipoMotor) {
             case 1: 
                 System.out.println("La bomba es una bomba de agua.");
                     break; 
             case 2: 
                 System.out.println("La bomba es una bomba de gasolina.");
                     break;
             case 3: 
                 System.out.println("La bomba es una bomba de hormigon.");
                     break; 
             case 4: 
                 System.out.println("La bomba es una bomba de pasta alimenticia.");
                     break;
             default: 
                 System.out.println(" \"No existe un valor válido para tipo de bomba.");
                 
                
         }
    }
    
}
