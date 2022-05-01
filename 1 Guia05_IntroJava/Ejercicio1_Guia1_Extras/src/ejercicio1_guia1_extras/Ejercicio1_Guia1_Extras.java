/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia1_extras;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio1_Guia1_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de minutos y el programa calculara a cuantos dias y horas equivalen");
        Scanner leer = new Scanner(System.in);
        int min = leer.nextInt();
        System.out.println("");
        int anios = min/525600;
        int dias = (min/1440)-(anios*365);
        int horas = (min/60)-(24*dias)-(anios*365*24);
        int minutos = min-(24*dias*60)-(horas*60)-(anios*365*24*60);
        
        System.out.println(min+" minutos son: "+anios+" años, "+dias+" dias, "+horas+" horas, "+minutos+" minutos.");
        
                
           
                   
        
    }
    
}
