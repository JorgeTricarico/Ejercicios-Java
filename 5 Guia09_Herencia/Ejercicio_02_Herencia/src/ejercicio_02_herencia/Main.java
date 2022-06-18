/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02_herencia;

import Servicios.ElectrodomesticoServicio;
import Servicios.LavarropaServicio;

/**
 *
 * @author Notebook
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ElectrodomesticoServicio se1 = new ElectrodomesticoServicio();
        LavarropaServicio LS1 = new LavarropaServicio();
        
        
        LS1.crearLavarropa(se1);
        
//        LS1.asd(se1);
//        System.out.println(se1.getListaElectrodomesticos());
            System.out.println(se1.toString());

    }

}
