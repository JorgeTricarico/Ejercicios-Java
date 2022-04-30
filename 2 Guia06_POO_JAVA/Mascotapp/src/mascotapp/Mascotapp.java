/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class Mascotapp {

    public static void main(String[] args) {
        
     ServicioMascota sm = new ServicioMascota();
     
     Mascota m1 = sm.crearMascota();
        
     
        System.out.println(m1.toString());
             
               
              
        
        

             
    }
    
}
