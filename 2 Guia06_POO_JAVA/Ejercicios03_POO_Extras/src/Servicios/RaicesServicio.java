/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;

/**
 *
 * @author Notebook
 */
public class RaicesServicio {

    public double getDiscriminante(Raices r1) {

        int a = r1.getA();
        int b = r1.getB();
        int c = r1.getC();
        double discriminante = ((Math.pow(b, 2)) - 4 * a * c);

        return discriminante;
    }

    public boolean tieneRaices(Raices r1) {
        boolean tieneRaices = false;
        if (getDiscriminante(r1) >= 0) {
            tieneRaices = true;
        }
        return tieneRaices;
    }

    public boolean tieneRaiz(Raices r1) {
        boolean tieneRaiz = false;
        if (getDiscriminante(r1) == 0) {
            tieneRaiz = true;
        }
        return tieneRaiz;
    }

    public void obtenerRaices(Raices r1) {
        if (tieneRaices(r1)) {
            int a = r1.getA();
            int b = r1.getB();
            int c = r1.getC();
            System.out.println("Raiz numero 1:");
            System.out.println(((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
            System.out.println("Raiz numero 2:");
            System.out.println(((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        } else {
            System.out.println("No tiene 2 raices.");
        }
    }

    public void obtenerRaiz(Raices r1) { // Una solucion
        if (tieneRaices(r1)) {
            int a = r1.getA();
            int b = r1.getB();
            int c = r1.getC();
            System.out.println("Raiz numero 1:");
            System.out.println(((-b) - (4 * a * c)) / (2 * a));
        }
    }
}
