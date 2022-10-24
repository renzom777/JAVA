/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_1_u6poo;

import Entidades.Libro;
import ServicioLibro.ServicioLibro;

/**
 *
 * 
 */
public class EJ_1_U6POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
        Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
        constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
        luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
        numero de páginas.*/ 
        ServicioLibro sl=new ServicioLibro();
        Libro l1= sl.crearLibro();
        
        sl.mostrarLibro(l1);
        System.out.println("///////////////////////");
        System.out.println(l1);
        
    }
    
}
