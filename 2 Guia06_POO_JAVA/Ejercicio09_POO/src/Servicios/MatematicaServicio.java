/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;
import static Entidades.Matematica.getN1;
import static Entidades.Matematica.getN2;

/**
 *
 * @author Notebook
 */
public class MatematicaServicio {
    
    
    public void devolverMayor(Matematica m){
    
        System.out.println(Double.max(Matematica.getN1(), Matematica.getN2()));
        
    }

    public void calcularPotencia(Matematica m){
    
    double max = Double.max(Matematica.getN1(), Matematica.getN2());
    double min = Double.min(Matematica.getN1(), Matematica.getN2());
        
        max = (Math.round(max*100.0)/100.0);
        min = Math.round(min*100.0)/100.0;
        double potencia = Math.pow(max, min);
        
        
        System.out.println("....");
       
        System.out.println((Math.round(potencia*100.0)/100.0));
    
    }
} 

