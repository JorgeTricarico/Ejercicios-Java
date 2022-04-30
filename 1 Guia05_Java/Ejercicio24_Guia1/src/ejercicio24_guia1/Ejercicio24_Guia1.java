/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio24_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese la dimension de la matriz cuadrada.");
        Scanner L = new Scanner(System.in);
        int n = L.nextInt();
        System.out.println("Ingrese una matriz. El programa comprobara si es anticinetica o no.");
        
        
        System.out.println("Por ejemplo, el formato para escribir la matriz es {{(1,2,3),(4,5,6),(7,8,9)}}. ");
        System.out.println("Vamos, que es facil! Aca como lo escribirias en papel. ");
        System.out.println("(1 2 3)");
        System.out.println("(4 5 6)");
        System.out.println("(7 8 9)");
          System.out.println("");
          
          //Rellenar Matriz
          int[][] matriz = new int [n][n];
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < n; j++) {
                  System.out.println("Ingresa la fila "+(i+1)+". Columna "+(j+1)+". De la matriz " +n+"x"+n );
                  
                  matriz[i][j] = L.nextInt();
                  
                  
              }
        }//Imprimir Matriz
          int c=0; 
          System.out.println("");
          for (int i = 0; i < n; i++) {
              System.out.println("");
              for (int j = 0; j < n; j++) {
                  System.out.print(matriz[i][j]+" ");
                  if (matriz[i][j]==-matriz[j][i]) {
                 c++;
                 
               
                          }
              }
              
            
        }
          
        System.out.println("");        
        System.out.println("");
          
         if (c==n*n) {
                  System.out.println("La Matriz ES anticinetica!");
              } else {
                  System.out.println("La matriz NO ES anticinetica!");
              }
          
    }
    
}
