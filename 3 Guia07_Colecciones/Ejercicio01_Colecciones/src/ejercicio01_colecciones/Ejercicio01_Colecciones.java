/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01_colecciones;

import Servicios.PerroServicio;
import java.util.ArrayList;

/**
 *
 * @author Notebook
 */
public class Ejercicio01_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerroServicio perroServ =  new PerroServicio();
        
        ArrayList listaPerros = perroServ.crearListaDePerros();
        listaPerros = perroServ.agregarPerro(listaPerros);
        
        perroServ.mostrarListaPerros(listaPerros);
        }
        
        
        
    }
    

