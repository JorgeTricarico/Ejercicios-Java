/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio19_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que desea convertir a otra moneda.");
        double cuantas = leer.nextDouble();
        System.out.println("Ingrese la moneda a la cual desea convertir los euros. (dolar/libra/yen)");
        String cual = leer.next();
           convertir(cuantas,cual);
    }
    
    public  static void convertir(double cantidad, String moneda) {
        
       if ("dolar".equals(moneda)){
       double dolar = cantidad * 1.28611;
       System.out.println(cantidad + " euros son "+ dolar+ " dolares.");
       }
       if ("libra".equals(moneda)){
       double libra = cantidad * 0.86;
       System.out.println(cantidad + " euros son "+ libra+ " libras.");
       }
       if ("yen".equals(moneda)){
       double yen = cantidad * 129.852;
       System.out.println(cantidad + " euros son "+ yen+ " yenes.");
       }
    }
}
