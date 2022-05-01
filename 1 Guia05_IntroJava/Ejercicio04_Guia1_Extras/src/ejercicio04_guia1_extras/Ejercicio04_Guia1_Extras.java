/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04_guia1_extras;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio04_Guia1_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero del 1 al 10");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        
        switch (num) {
            case 1 : 
                System.out.println("El equivalente en numeros romanos es I");
                break;
            case 2 : 
                System.out.println("El equivalente en numeros romanos es II");
                break;
            case 3 : 
                System.out.println("El equivalente en numeros romanos es III");
                break;
            case 4 : 
                System.out.println("El equivalente en numeros romanos es IV");
                break;
            case 5 : 
                System.out.println("El equivalente en numeros romanos es V");
                break;
            case 6 : 
                System.out.println("El equivalente en numeros romanos es VI");
                break;
            case 7 : 
                System.out.println("El equivalente en numeros romanos es VII");
                break;
            case 8 : 
                System.out.println("El equivalente en numeros romanos es VIII");
                break;
            case 9 : 
                System.out.println("El equivalente en numeros romanos es IX");
                break;
            case 10 : 
                System.out.println("El equivalente en numeros romanos es X");
                break;    
            default:
                System.out.println("No ingreso un numero del 1 al 10.");
        }
    }
    
}
