/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class OperacionServicio {
    
    Operacion crearOperacion() {
        
        Operacion o1 = new Operacion();
        //Llenar los atributos
        System.out.println("Ingrese el valor del numero 1");
        Scanner leer = new Scanner(System.in);
        o1.setNumero1(leer.nextInt());
        
        System.out.println("Ingrese el valor del numero 2");
        o1.setNumero2(leer.nextInt());
        
        return o1;
    
    }
    
}
