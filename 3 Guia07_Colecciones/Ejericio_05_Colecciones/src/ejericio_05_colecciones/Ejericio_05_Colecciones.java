/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericio_05_colecciones;

import Servicios.PaisServicio;

/**
 *
 * @author Notebook
 */
public class Ejericio_05_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        
        ps.crearPais();
        ps.ordenarAlfabeticamenteAscendente();
        ps.eliminarPaisDeLista();
    }
    
}
