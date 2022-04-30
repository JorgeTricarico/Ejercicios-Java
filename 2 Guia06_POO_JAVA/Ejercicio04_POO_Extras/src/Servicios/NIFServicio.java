/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in);
    @SuppressWarnings("empty-statement")
    public NIF crearNif(){
        
        String Vector[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
       
        System.out.println("Ingrese el DNI.");
        long DNI = leer.nextLong();
        NIF n1 = new NIF();
        
        int resto = (int) (DNI%23);        
        n1.setDNI(DNI);
        n1.setLetra(Vector[resto]);
        return n1;
    }
}
