/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class FormasServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Circulo> listaCirculos= new ArrayList();
    public ArrayList<Rectangulo> listaRectangulos= new ArrayList();
 
    public void crearCirculo(){
        
        
        
        System.out.println("Ingrese el radio del circulo");
        double radio = leer.nextDouble();
        Circulo c1 = new Circulo(radio);
        listaCirculos.add(c1);
        listaCirculos
        
    }
    public void crearRectangulo(){
    }
    
    
}
