/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class PuntosServicio {
    Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos(){
        
        
        System.out.println("Ingrese el punto x1");
        int x1 = leer.nextInt();
        System.out.println("Ingrese el punto y1");
        int y1 = leer.nextInt();
        System.out.println("Ingrese el punto x2");
        int x2 = leer.nextInt();
        System.out.println("Ingrese el punto y2");
        int y2 = leer.nextInt();
        
        Puntos p1 = new Puntos(x1, y1, x2, y2);
        return p1;   
    }
    
    // Definir la función dis para calcular la distancia de suma y devolver los caracteres de print
    public void disdistanciaPuntos(Puntos p1) {
        int x1= p1.getX1();
        int x2= p1.getX2();
        int y1= p1.getY1();
        int y2= p1.getY2();
	double sum = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	System.out.println("Entraste ("+x1+","+y1+")("+x2+","+y2+") La distancia entre dos puntos es:"+sum);
    }
}   
