/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04_poo;

import Entidades.Rectangulo;

/**
 *
 * @author Notebook
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo c1 = new Rectangulo();
        c1 = c1.crearRectangulo();
        int superficie = c1.Superficie();
        int perimetro = c1.Perimetro();
        System.out.println("La superficie es "+superficie);
        System.out.println("El perimetro es "+perimetro);
        System.out.println(c1);
    }
    
}
