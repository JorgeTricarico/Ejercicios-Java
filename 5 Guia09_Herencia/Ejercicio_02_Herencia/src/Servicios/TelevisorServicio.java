/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;


import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Notebook
 */
public class TelevisorServicio extends ElectrodomesticoServicio{
    
    protected ArrayList<Televisor> listaTelevisor = new ArrayList();
    
    
    public Televisor crearLavarropa(ElectrodomesticoServicio s1){
        
        Electrodomestico e1 = super.crearElectrodomestico();
        
        System.out.println("Ingrese las pulgadas del televisor");
        Integer pulgadas = leer.nextInt();
        
        System.out.println("El televisor tiene sintonizador TDT? Responda SI o NO...");
        String isSintonizador= leer.next().toLowerCase();
        boolean sintonizadorTDT=false;
        if (isSintonizador.equals("si")) {
            sintonizadorTDT = true;
        }
        
        Televisor t1 = new Televisor(pulgadas, sintonizadorTDT, e1.getPrecio(),e1.getColor(), e1.getConsumoElectrico(), e1.getPeso());
        
        precioFinal(e1, t1);
        
        listaTelevisor.add(t1);
        listaElectrodomesticos.add(listaTelevisor);
        s1.setListaElectrodomesticos(listaElectrodomesticos);
        
        return t1;
    
    
}
    
public void precioFinal(Electrodomestico e1, Televisor t1) {
        super.precioFinal(e1);
        if (t1.getPulgadas()>40) {
            t1.setPrecio(e1.getPrecio()*(1.3));
        }else {
            t1.setPrecio(e1.getPrecio());
        }
        
        if (t1.isSintonizadorTDT()) {
            t1.setPrecio(e1.getPrecio()+500);
    }
    }
}
