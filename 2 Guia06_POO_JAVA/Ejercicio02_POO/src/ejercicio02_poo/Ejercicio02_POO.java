/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02_poo;


import Services.ServicioCircunferencia;
import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio02_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioCircunferencia c1 = new ServicioCircunferencia();
            c1.crearCircunsferencia();
            
            

    }

}
