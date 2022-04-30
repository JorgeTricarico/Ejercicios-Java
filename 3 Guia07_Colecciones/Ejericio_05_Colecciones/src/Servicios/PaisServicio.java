/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument;
import jdk.nashorn.internal.runtime.ListAdapter;

/**
 *
 * @author Notebook
 */
public class PaisServicio {

    private HashSet<Pais> listaPaises; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    
    public PaisServicio() {
        this.listaPaises = new HashSet<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    public void crearPais(){
    
        System.out.println("Enter the name of country.");
        String nombre = leer.next();
        
        listaPaises.add(new Pais(nombre));
        
        preguntar();
    
    }
    
    public void preguntar(){
    
        System.out.println("Do you want add another country? Y/N.");
        String answer = leer.next().toLowerCase();
        
        switch (answer) {
            case "y":
                crearPais();
                break;
            case "n":
                mostrarPaises();
                break;
            default:
                System.out.println("Enter a correct answer.");
                preguntar();
                break;
        }
    }
    
    public void mostrarPaises(){
        
        System.out.println("");
        for (Pais pais : listaPaises) {
            System.out.println("> "+pais.getNombre());
        }
    }
    
    public void ordenarAlfabeticamenteAscendente(){
        
        ArrayList<Pais> ArrayListPaises = new ArrayList(listaPaises);
    
        Collections.sort(ArrayListPaises, Comparadores.ordenarAlfabeticamenteAscendente);
        
        mostrarPaises();
        System.out.println("");
        for (Pais pais : ArrayListPaises) {
            System.out.println("> "+pais.getNombre());
        }
    }
    
    public void eliminarPaisDeLista(){
        
        Iterator<Pais> it = listaPaises.iterator();
        
        String pais = inputPaisEliminar();
        int contador=0;
        while (it.hasNext()) {
            
            if (it.next().getNombre().equals(pais)){
                it.remove();
                System.out.println("Se eleimino el pais "+pais+".");
                contador++;
            } 
        }
        if (contador==0) {
            System.out.println("El pais "+ pais+ " no esta en la lista.");
        }
        
        mostrarPaises();
    }
    
    public String inputPaisEliminar(){
    
        System.out.println("Ingrese el nombre del pais que quiere eliminar");
        String pais = leer.next();
        
        return pais;
    }
    
    
}
