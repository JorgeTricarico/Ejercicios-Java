/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23_guia1;

/**
 *
 * @author Notebook
 */
public class Ejercicio23_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int [4][4];
        System.out.println("Matriz Original");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random()*10);
                System.out.print(matriz[i][j]+" ");
            }
            
        }   System.out.println("");
            System.out.println("");
            System.out.println("Matriz Traspuesta");
            for (int j = 0; j < 4; j++) {
                System.out.println("");                
            for (int i = 0; i < 4; i++) {
                System.out.print(matriz[i][j]+" ");
            }
        }
            System.out.println("");
      
                    
        
    }
    
}
