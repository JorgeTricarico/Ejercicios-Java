/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Notebook
 */
public class Libro {
    
    private int ISBN;
    
    public String Titulo;
    
    private  String Autor;
    
    private int NumeroDePaginas; 
    
    //Contructores por vacio.

    public Libro() {
        
    }
    
    //Constructor por parametros.

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }
    
    
    //getter
    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }
    
    //Setter

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumeroDePaginas(int NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDePaginas=" + NumeroDePaginas + '}';
    }
    
    
}
