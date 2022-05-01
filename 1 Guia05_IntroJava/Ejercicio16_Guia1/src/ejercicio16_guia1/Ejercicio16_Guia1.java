/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio16_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /*
            Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
        tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
        con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
        carácter tiene que ser X y el último tiene que ser una O.  
        Las secuencias leídas que respeten el formato se consideran correctas, la 
        secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
        secuencia distinta de FDE, que no respete el formato se considera incorrecta.  
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
        correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
        se utilizan las siguientes funciones de Java Substring(), Length(), equals(). 
        */
        
        
       String codigo;
       int correctas=0;
       int incorrectas=0;
        do {
            System.out.println("Ingrese el codigo para que el RS232 lo pueda leer.");
            Scanner leer = new Scanner(System.in);
            codigo = leer.next();
            if ("X".equals(codigo.substring(0,1)) && "O".equals(codigo.substring(4,5)) && codigo.length()==5 ){
                correctas++;
            } else { 
                incorrectas++;
            }
           
         } while (!"&&&&&".equals(codigo));
        
        System.out.println("Correctas fueron " + correctas + " .Incorrectas fueron " + (incorrectas-1) + ".");
        
        
        
    }
    
    
}
