/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class ElectrodomesticoServicio {

    public ElectrodomesticoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    protected ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();
    protected ArrayList colores = new ArrayList();
    protected ArrayList letrasConsumo = new ArrayList();
    protected Scanner leer;
    
    public void crearElectrodomestico() {
        
        Electrodomestico e1 = new Electrodomestico() {};
        
        // Letras segun consumo
        letrasConsumo.add('A');
        letrasConsumo.add('B');
        letrasConsumo.add('C');
        letrasConsumo.add('D');
        letrasConsumo.add('E');
        letrasConsumo.add('F');
        
        // Colores disponibles
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");
        
        System.out.println("Ingrese el tipo de electrodomestico. Ej. TV, DVD, Lavarropas, ect.");
        String tipo = leer.next().toUpperCase();
        e1.setTipo(tipo);
        System.out.println("Ingrese el COLOR del electrodomestico: \n -Blanco \n -Negro \n -Rojo \n -Azul \n -Gris \n");
        String color = leer.next().toLowerCase();
        
        e1.setColor(color);
        System.out.println("Ingrese el CONSUMO ELECTRICO del electrodomestico: \n De la 'A' hasta la 'F'. \n ");
        char consumoElectrico = leer.next().toUpperCase().charAt(0);
        e1.setConsumoElectrico(consumoElectrico);
        
        System.out.println("Ingrse el PESO del electrodomestico:");
        Integer peso = leer.nextInt();
        e1.setPeso(peso);
       
    
        
         
        comprobarColor(e1);
        comprobarConsumoEnergetico(e1);
        
        listaElectrodomesticos.add(e1);
        
        
    }
    
    public void precioFinal(Electrodomestico e1){
        
        
        calcularPrecioPorLetra(e1);
        calcularPrecioPorPeso(e1);
    
    }
        
    public void calcularPrecioPorLetra(Electrodomestico e1){
        
        switch(e1.getConsumoElectrico()){
   
    case 'A' :
        e1.setPrecio(e1.getPrecio()+1000);
        
      break; 
   
    case 'B' :
        e1.setPrecio(e1.getPrecio()+800);
      break;
   
    case 'C' :
        e1.setPrecio(e1.getPrecio()+600);
      break; 
        
    case 'D' :
        e1.setPrecio(e1.getPrecio()+500);
      break;
        
    case 'E' :
        e1.setPrecio(e1.getPrecio()+300);
      break; 
        
    case 'F' :
        e1.setPrecio(e1.getPrecio()+100);
      break;
   
   default : 
    }
        
    }
    
    public void calcularPrecioPorPeso(Electrodomestico e1){
    
        if (e1.getPrecio()>=1 && e1.getPrecio()<=19) {
            e1.setPrecio(e1.getPrecio()+100);
            
        }else     
        if (e1.getPrecio()>=20 && e1.getPrecio()<=49) {
            e1.setPrecio(e1.getPrecio()+500);
        }else
        
        if (e1.getPrecio()>=50 && e1.getPrecio()<=79) {
            e1.setPrecio(e1.getPrecio()+800);
        }else
        
        if (e1.getPrecio()>=80) {
            e1.setPrecio(e1.getPrecio()+1000);
        } 
        
    }
    
    public void comprobarConsumoEnergetico(Electrodomestico e1){
        
    
        if (!letrasConsumo.contains(e1.getConsumoElectrico())) {
            e1.setConsumoElectrico('F');
        }
    }
    
    public void comprobarColor(Electrodomestico e1){
        
        if (!colores.contains(e1.getColor())) {
            e1.setColor("blanco");
        }
        
    }

    
    @Override
    public String toString() {
        return "listaElectrodomesticos=" + listaElectrodomesticos ;
    } 
    
    
}
