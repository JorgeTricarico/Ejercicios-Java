/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavarropa;
import java.util.ArrayList;

/**
 *
 * @author Notebook
 */
public class LavarropaServicio extends ElectrodomesticoServicio {
    
    protected ArrayList<Lavarropa> listaLavarropas = new ArrayList();

    public LavarropaServicio() {
        
         //crearElectrodomestico();
    }
    
//    @Override
//    public String toString() {
//        return super.toString(); 
//    }

    @Override
    public void comprobarColor(Electrodomestico e1) {
        super.comprobarColor(e1); 
    }

    @Override
    public void comprobarConsumoEnergetico(Electrodomestico e1) {
        super.comprobarConsumoEnergetico(e1); 
    }

    @Override
    public void calcularPrecioPorPeso(Electrodomestico e1) {
        super.calcularPrecioPorPeso(e1); 
    }

    @Override
    public void calcularPrecioPorLetra(Electrodomestico e1) {
        super.calcularPrecioPorLetra(e1); 
    }

    @Override
    public void precioFinal(Electrodomestico e1) {
        super.precioFinal(e1);
        if (e1.getPrecio()>30) {
            e1.setPrecio(e1.getPrecio()+500);
        }
    }

    
    
    
    public Lavarropa crearLavarropa(){
        Lavarropa L1 = new Lavarropa();
        listaLavarropas.add(L1);
        
        crearElectrodomestico();
        
        System.out.println("Ingrese la CARGA del Lavarropas");
        L1.setCarga(leer.nextInt());
        
        listaElectrodomesticos.add(L1);
        
        return L1;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   
    
}
