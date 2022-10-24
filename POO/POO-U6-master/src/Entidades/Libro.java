/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Rochii
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int nroPag;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int nroPag) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
        
        if(ISBN<1000000 && ISBN>0){
            this.ISBN = ISBN;
        }
        
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nroPag=" + nroPag + '}';
    }
    
    
}
