/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06_poo;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio06_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        Scanner leer = new Scanner(System.in);
        c1 = c1.crearCafetera();
            
        c1.llenarCafetera();
        System.out.println("La cafetera esta llena!");
        // System.out.println(c1.toString());
        System.out.println("Ingrese la cantidad de ml de la taza a llenar.");
        double tamanioTaza = leer.nextDouble();
        c1.servirTaza(tamanioTaza);
        //System.out.println(c1.toString());

        System.out.println("Ingrese la cantidad de cafe a agregar.");
        int cantidadCafe = leer.nextInt();
        c1.agregarCafe(cantidadCafe);
        //System.out.println(c1.toString());
        c1.vaciarCafetera();
        //System.out.println(c1.toString());

    }

}
