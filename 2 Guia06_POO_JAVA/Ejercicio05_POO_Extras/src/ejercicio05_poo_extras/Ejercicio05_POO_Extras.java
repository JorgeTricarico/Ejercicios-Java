/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05_poo_extras;

import Entidades.Anio;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio05_POO_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anio n1 = new Anio();
        Scanner leer = new Scanner(System.in);

        String mesSecreto = "";
        
        System.out.println("Ingrese el mes secreto.");
        
        do {
            mesSecreto = leer.next();
            if (n1.getMesSecreto().equals(mesSecreto)) {
                System.out.println("Correcto. Adivinaste!");
            } else {
                System.out.println("Intentalo nuevamente. Intenta con otro mes.");
            }
        } while (!n1.getMesSecreto().equals(mesSecreto));

    }

}
