/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia1_extras;

//<*****************************************>
//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
//cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
//valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
//Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una 
//variable auxiliar.
//<*****************************************>
public class Ejercicio2_Guia1_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int a,b,c,d,x;
        a= 1;   // A tomer valor de D --- 4
        b=2;    // B tomer valor de C -- 3
        c=3;    // C tomer valor de A --- 1
        d=4;    // D tomer valor de B --- 2
        
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
        
        System.out.println("");
        x = a;  // x=1
        a = d;  // a=4
        d = b;
        b = c;  // b
        c = x;
        x = b;
       
        
        
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
                
             
        
        
    }
    
}
