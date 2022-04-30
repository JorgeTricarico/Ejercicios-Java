/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05_guia1_extras;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio05_Guia1_extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el tipo de plan que tiene A/B/C");
        Scanner leer = new Scanner(System.in);
        String plan = leer.next();
        plan = plan.toUpperCase();
        System.out.println("Ingresa el monto.");
        int costo = leer.nextInt();
        float  precio;
        switch (plan) {
            case "A":
                precio = costo/2;
                System.out.println("El costo de su tratamiento es de "+precio);
                break;
            case "B":
                precio = costo*35/100;
                System.out.println("El costo de su tratamiento es de "+precio);
                break;
            case "C":
                precio = costo;
                System.out.println("El costo de su tratamiento es de "+precio);
                break;    
            default:
                System.out.println("Ingreso un plan inexistente.");
        }
        
        
        
        
        
        
        
    }
    
}
