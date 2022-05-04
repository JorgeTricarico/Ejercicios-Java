/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class ElectrodomesticoServicio {

    public ElectrodomesticoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    protected List<List> listaElectrodomesticos = new ArrayList<>();

    public List<List> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(List<List> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }
    
    
    
    protected ArrayList colores = new ArrayList();
    protected ArrayList letrasConsumo = new ArrayList();
    protected Scanner leer;
    
    public Electrodomestico crearElectrodomestico() {
        
        Electrodomestico e1 = new Electrodomestico();
        
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
        
//        System.out.println("Ingrese el tipo de electrodomestico. Ej. TV, DVD, Lavarropas, ect.");
//        String tipo = leer.next().toLowerCase();
//        e1.setTipo(tipo);
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
        
        e1.setPrecio(0);
        
        return e1;
    }
    
    public void precioFinal(Electrodomestico e1){
       
        calcularPrecioPorLetra(e1);
        e1.setPrecio(calcularPrecioPorPeso(e1.getPeso()));
    
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
    
    public double calcularPrecioPorPeso(double peso){
    
        if (peso>=1 && peso<=19) {
            return (peso+100);
            
        }else if (peso>=20 && peso<=49) {
            return (peso+500);
        }else if (peso>=50 && peso<=79) {
            return (peso+800);
        }else if (peso>=80) {
            return (peso+1000);
        } 
        return 9999999;
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
