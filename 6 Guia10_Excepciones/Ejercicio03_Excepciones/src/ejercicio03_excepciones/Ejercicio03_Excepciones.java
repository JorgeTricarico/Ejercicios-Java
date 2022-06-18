/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03_excepciones;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio03_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            
        int num1 = parseInt(leer.next());
        int num2 = parseInt(leer.next());
        
        
        System.out.println(num1/num2);
        
        } catch (NumberFormatException e) {
            System.out.println("No ingreso un numero.");
        
        } catch (InputMismatchException e) {
            System.out.println("No ingreso ningun valor.");
        
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!");
        }
    }
    
}
