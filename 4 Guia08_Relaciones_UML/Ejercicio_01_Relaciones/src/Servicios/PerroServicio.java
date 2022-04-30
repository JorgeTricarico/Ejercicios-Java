/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import Enumeraciones.RazaPerro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class PerroServicio {
    
    private ArrayList<Perro> listaPerros;
    private Scanner leer;
    
    public PerroServicio() {
        this.listaPerros = new ArrayList<>(); //  ?
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
 
    
     public ArrayList crearPerro(){
        
       Perro perro1 = new Perro("pipi", "mediano", RazaPerro.CANICHE, 3);
       listaPerros.add(perro1);
        
        
        
       return listaPerros;
    }
}
