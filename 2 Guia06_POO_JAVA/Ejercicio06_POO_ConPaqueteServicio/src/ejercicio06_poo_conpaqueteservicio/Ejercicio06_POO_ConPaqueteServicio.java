/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06_poo_conpaqueteservicio;

import Entidades.Cafetera;
import java.util.Scanner;
import Servicios.CafeteraServicio;

/**
 *
 * @author Notebook
 */
public class Ejercicio06_POO_ConPaqueteServicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        CafeteraServicio cs = new CafeteraServicio();
        c1 =cs.crearCafetera();
        Scanner leer = new Scanner(System.in);
        
            
        cs.llenarCafetera(c1);
        System.out.println("La cafetera esta llena!");
        System.out.println(c1.toString());
        System.out.println("Ingrese la cantidad de ml de la taza a llenar.");
        double tamanioTaza = leer.nextDouble();
        cs.servirTaza(tamanioTaza,c1);
        System.out.println(c1.toString());

        System.out.println("Ingrese la cantidad de cafe a agregar.");
        int cantidadCafe = leer.nextInt();
        cs.agregarCafe(cantidadCafe,c1);
        System.out.println(c1.toString());
        cs.vaciarCafetera(c1);
        System.out.println(c1.toString());
    }
    
}
