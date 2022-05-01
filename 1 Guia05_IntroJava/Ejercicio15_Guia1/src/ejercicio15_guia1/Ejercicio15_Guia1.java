/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio15_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        int i = 0;
        System.out.println("Ingrese el primer numero");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2 = leer.nextInt();
        do {
            i= i+ 1;
        System.out.println(" ____________________");
        System.out.println("|    MENU            |");
        System.out.println("|    1. Sumar        |");
        System.out.println("|    2. Restar       |");
        System.out.println("|    3. Multiplicar  |");
        System.out.println("|    4. Dividir      |");
        System.out.println("|    5. Salir        |");
        System.out.println("|    Elija opción:   |");
        System.out.println("|____________________|");
        opcion = leer.nextInt();
       
        if (opcion==1) {
        int suma = n1+n2;
        System.out.println();
        System.out.print("-------------------------------->   ");
        System.out.print( n1 + " + " + n2 + " = " + suma);
        System.out.println("    <--------------------------------");
        continue;
        }
        if (opcion==2) {
        int resta = n1-n2;
        System.out.println();
        System.out.print("-------------------------------->   ");
        System.out.print( n1 + " - " + n2 + " = " + resta);
        System.out.println("    <--------------------------------");
        continue;
        }
        if (opcion==3) {
        int producto = n1*n2;
        System.out.println();
        System.out.print("-------------------------------->   ");
        System.out.print( n1 + " * " + n2 + " = " + producto);
        System.out.println("    <--------------------------------");
        continue;
        }
        if (opcion==4) {
        int division = n1/n2;
        System.out.println();
        System.out.print("-------------------------------->   ");
        System.out.print( n1 + " / " + n2 + " = " + division);
        System.out.println("    <--------------------------------");
        continue;
        }
        if (opcion==5 && i==1) {
        
        System.out.println();
        System.out.print("->   ");
        System.out.print("¿Está seguro que desea salir del programa (S/N)?"); 
        System.out.println("    <-");  
        String opcion2 = leer.next();
            if (opcion2.equals("s")) {
                break;
            }
        }
        
        } while (opcion!=5 || i==1);
    }
    
}
