/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09_poo;

import Entidades.Matematica;
import Servicios.MatematicaServicio;

/**
 *
 * @author Notebook
 */
public class Ejercicio09_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();
        
        m.setN1(Math.random()*10);
        m.setN2(Math.random()*10);
        
        System.out.println(m.getN1());
        System.out.println(m.getN2());
        
        System.out.println("El mayor es...");
        ms.devolverMayor(m);
        
        ms.calcularPotencia(m);
        
        
    }
    
}
