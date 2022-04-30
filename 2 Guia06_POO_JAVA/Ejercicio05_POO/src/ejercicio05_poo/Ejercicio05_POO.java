/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05_poo;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio05_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta c1 = new Cuenta();

        c1.crearCuenta();

        System.out.println("Ingrese el monto a ingresar.");
        double ingreso = leer.nextDouble();
        c1.setSaldoActual(c1.ingresar(ingreso));
        
        System.out.println("Ingrese el monto a retirar.");
        double retiro = leer.nextDouble();
        c1.setSaldoActual(c1.retirar(retiro));
        
        System.out.println("Ingrese el saldo a retirar por extranccion rapida.");
        double retiroRapido = leer.nextDouble();
        c1.extraccionRapida(retiroRapido);
        
        c1.consultarSaldo();
        
        c1.consultarDatos();
        
        System.out.println(c1);
    }

}
