/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio14_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        14. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
        salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa 
        deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
        número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break. 
        */
        
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese hasta 20 numeros positivo para sumarlos, y cero para terminar la suma y ver el resultado.");
        for (int i=1;i<=20;i++) {
            int n = leer.nextInt();
            if (n>0) {
             suma = suma + n;
            } else if (n==0){
                System.out.println("Se capturó el numero cero.");
                break;
            }
            
            
            
        }
        System.out.println("La suma es " + suma + ".");
    }
    
}
