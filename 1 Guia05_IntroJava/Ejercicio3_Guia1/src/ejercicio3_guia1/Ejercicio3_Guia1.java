/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Notebook
 */
public class Ejercicio3_Guia1 {

    //<*****************************************>
    //     Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
    //    después toda en minúsculas. Nota: investigar la función toUpperCase() y 
    //    toLowerCase() en Java. 

    //<*****************************************>
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        String mayus;
        String minus;
        mayus = toUpperCase(frase);
        minus = toLowerCase(frase);
        System.out.println(mayus);
        System.out.println(minus);  
        
        
        
    }
    
}
