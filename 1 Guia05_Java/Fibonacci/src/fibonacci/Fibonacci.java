/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1 
        //Fibonaccin = 1 para todo n<=1 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea calcular la sucecion.");
        int n = leer.nextInt();
        
        System.out.println("El resultado es "+sucesion(n));
    }
    
    public static long sucesion(long n){
        if (n==0) {
            return 0;
        }else if (n<=1) {
            return 1;
        }else {
            return sucesion(n-1)+sucesion(n-2);
        } 
    }
}

