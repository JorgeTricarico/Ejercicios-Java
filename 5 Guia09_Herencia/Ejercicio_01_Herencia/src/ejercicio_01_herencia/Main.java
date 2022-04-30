/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01_herencia;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Notebook
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //--> Instanciar Perro
        Animal perro = new Perro("Stich","Carne",15,"Chihuahua");
        perro.alimentarce();
        
        //--> Instanciar Perro1
        Animal perro1 = new Perro("Teddy","Croquetas",10,"Doberman");
        perro1.alimentarce();
        
         //--> Instanciar Gato
        Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.alimentarce();
        
         //--> Instanciar Caballo
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.alimentarce();
        
    }
    
}
