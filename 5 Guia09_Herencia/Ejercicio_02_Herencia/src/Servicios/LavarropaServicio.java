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
        
//         crearElectrodomestico();
    }
    

    public void precioFinal(Electrodomestico e1, Lavarropa L1) {
        super.precioFinal(e1);
        if (L1.getCarga()>30) {
            L1.setPrecio(e1.getPrecio()+500);
        }else {
            L1.setPrecio(e1.getPrecio());
        }
    }
    
    public Lavarropa crearLavarropa(ElectrodomesticoServicio s1){
        
        Electrodomestico e1 = super.crearElectrodomestico();
        
        System.out.println("Ingrese la carga");
        Integer carga = leer.nextInt();
        
        Lavarropa L1 = new Lavarropa(carga, 0, e1.getColor(), e1.getConsumoElectrico(), e1.getPeso());
        
        precioFinal(e1, L1);
        
        listaLavarropas.add(L1);
        listaElectrodomesticos.add(listaLavarropas);
        s1.setListaElectrodomesticos(listaElectrodomesticos);
       
        return L1;
    }
    
    

    @Override
    public String toString() {
        return "LavarropaServicio{" + "listaLavarropas=" + listaLavarropas + '}';
    }

    
   
    
   
    
}
