/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05_poo;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Cuenta {

    // Atributos
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;
    private double interes;

    //Constructores
    public Cuenta() {
    }

    public Cuenta(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta(int numeroCuenta, long DNI, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    //Getter and Setter
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    

    //Metodo Crear
    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        //Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el numero de cuenta nueva.");
        //c1.setNumeroCuenta(leer.nextInt());
        numeroCuenta = (leer.nextInt());
        System.out.println("Ingrese DNI del titular de la cuena.");
        //c1.setDNI(leer.nextLong());
        DNI = (leer.nextLong());

        return new Cuenta(numeroCuenta, DNI, 0, 0);

    }

    public double ingresar(double saldoActual) {
        this.saldoActual += saldoActual;

        return saldoActual;

    }

    public double retirar(double retiro) {

        this.saldoActual -= retiro;

        if (getSaldoActual() < retiro) {
            saldoActual = 0;
        }

        return saldoActual;
    }

    public double extraccionRapida(double retiroRapido) {
        if (retiroRapido > getSaldoActual() * 0.2) {
            System.out.println("Usted no puede retirar esa suma, ingrese una suma menor.");
            return saldoActual;
        }
        saldoActual -= retiroRapido;
        return saldoActual;
        
    }
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de $"+getSaldoActual()); 
    }

    public void consultarDatos() {
        System.out.println("numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual);
    }
    
    
    }
   


