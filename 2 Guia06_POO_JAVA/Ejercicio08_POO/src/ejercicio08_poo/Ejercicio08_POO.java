/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08_poo;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio08_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cadena c1 = new Cadena();
        CadenaServicio cs = new CadenaServicio();
        System.out.println("Ingrese una frase.");
        String frase = leer.nextLine();
        int longitud = frase.length();
        c1.setFrase(frase);
        c1.setLongitud(longitud);
        cs.mostrarVocales(frase, c1);
       
        cs.invertirFrase(c1);
        
        System.out.println("Ingrese la letra que decia contar dentro de la frase:");
        char letra = leer.next().charAt(0); 
        cs.vecesRepetido(letra, c1);
        System.out.println("Ingrese una frase que se unira a la frase anterior:");
        leer.nextLine();
        String frase2 = leer.nextLine();
       
        cs.unirFrases(frase2, c1);
        
        System.out.println("Ingrese una letra que desea remplazar de la frase:");
        letra = leer.next().charAt(0);
        System.out.println("Ingrese por que caracter desea remplazar a '"+letra+"'.");
        String remplazo = leer.next();
        
        cs.remplazar(letra,remplazo, c1);
        
        System.out.println("Ingrese la letra a averiguar si esta en la frase");
        letra = leer.next().charAt(0);
        
        cs.contiene(letra, c1);
        
    }
    
}
