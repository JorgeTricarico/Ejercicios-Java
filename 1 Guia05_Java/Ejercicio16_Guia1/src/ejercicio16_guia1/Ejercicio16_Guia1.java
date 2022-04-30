/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio16_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String codigo;
       int correctas=0;
       int incorrectas=0;
        do {
            System.out.println("Ingrese el codigo para que el RS232 lo pueda leer.");
            Scanner leer = new Scanner(System.in);
            codigo = leer.next();
            if ("X".equals(codigo.substring(0,1)) && "O".equals(codigo.substring(4,5)) && codigo.length()==5 ){
                correctas++;
            } else { 
                incorrectas++;
            }
           
         } while (!"&&&&&".equals(codigo));
        
        System.out.println("Correctas fueron " + correctas + " .Incorrectas fueron " + (incorrectas-1) + ".");
        
        
        
    }
    
    
}
