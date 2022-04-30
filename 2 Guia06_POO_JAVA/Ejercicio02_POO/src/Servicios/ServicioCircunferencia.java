/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class ServicioCircunferencia {
    
    
    Circunferencia CrearCircunferencia () {
        
        //Instanciar objeto tipo
        Circunferencia c1 = new Circunferencia();
        
        //Llenar los atributos
        System.out.println("Ingrese la medida del Radio en metros.");
        Scanner leer = new Scanner(System.in);
        
        c1.setRadio(leer.nextDouble());
        
        c1.setArea(c1.getRadio()*c1.getRadio()*PI);
        
        return c1;
    }
    
    
    
}
