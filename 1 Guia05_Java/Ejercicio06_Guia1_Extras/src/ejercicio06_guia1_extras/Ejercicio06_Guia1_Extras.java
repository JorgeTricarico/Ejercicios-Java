/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06_guia1_extras;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio06_Guia1_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de personas a evaluar su estatura.");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        double[] alturaPersona = new double[n];
        //variables para personas bajas
        int auxBajos=0;
        double bajos=0;
        double promedioBajos;
        //Variables para personas altas
        int auxAltos=0;
        double altos=0;
        double promedioAltos;
       
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura de la persona numero "+(i+1));
            alturaPersona[i] = leer.nextDouble();
            if (alturaPersona[i]<(1.6)) {
                bajos+= alturaPersona[i];
                auxBajos++;  
            }else {
                altos+= alturaPersona[i];
                auxAltos++;
            }   
        }
        promedioBajos = bajos/auxBajos;
        promedioAltos = altos/auxAltos;
        
        System.out.println("La cantidad de personas bajas son "+auxBajos+" y en promedio miden "+promedioBajos);
        System.out.println("");
        System.out.println("La cantidad de personas altas son "+auxAltos+" y en promedio miden "+promedioAltos);
        
        
    }
    
}
