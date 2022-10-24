/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioLibro;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class ServicioLibro {
    Scanner leer=new Scanner (System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        Libro libro=new Libro();
        
        System.out.println("Ingrese ISBN del libro");
        int num=leer.nextInt();
        while(num>1000000 || num<0){
            System.out.println("Por favor ingrese un ISBN válido");
            num=leer.nextInt();
        }
        libro.setISBN(num);
        
        System.out.println("Ingrese el título del libro");
        libro.setTitulo(leer.next());
        
        
        System.out.println("Ingrese el autor del libro");
        libro.setAutor(leer.next());
        
        
        
        System.out.println("Ingrese la cantidad de páginas del libro");
        libro.setNroPag(leer.nextInt());
        
        
        return libro;
    }
    
    public void mostrarLibro(Libro l){
        System.out.println("Titulo del libro: "+l.getTitulo());
        System.out.println("Autor: "+ l.getAutor());
        System.out.println("ISBN: "+l.getISBN());
        System.out.println("Númro de páginas del libro: "+l.getNroPag());
    }
}
