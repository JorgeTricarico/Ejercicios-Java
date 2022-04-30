/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class PerroServicio {

    Scanner leer = new Scanner(System.in);

    public ArrayList crearListaDePerros() {

        ArrayList<String> listaPerros = new ArrayList();

        return listaPerros;

    }

    public ArrayList agregarPerro(ArrayList listaPerros) {
        String raza;
        String respuesta;

        do {
            System.out.println("Ingrese la raza del perro a agregar.");
                raza = leer.next();
            listaPerros.add(raza);
            
            System.out.println("Quiere guardar otro perro? s/n");
            respuesta = leer.next();
        } while (respuesta.equals("s"));

        return listaPerros;

    }
    
    public void mostrarListaPerros(ArrayList listaPerros){
    
        int i = 0;
        for (Object razas : listaPerros){
            
            System.out.println(i+" "+razas);
            i++;
    }
}
}    
