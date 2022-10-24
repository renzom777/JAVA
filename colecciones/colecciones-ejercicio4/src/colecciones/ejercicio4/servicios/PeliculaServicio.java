/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio4.servicios;

import colecciones.ejercicio4.comparadores.Comparadores;
import colecciones.ejercicio4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author GustM_000
 */
public class PeliculaServicio {
    
    private ArrayList<Pelicula> peliculas;

    public PeliculaServicio() {
        this.peliculas=new ArrayList<>();
    }

    public void crearPelicula (){
        Scanner leer = new Scanner(System.in);
        do {            
            System.out.println("Ingresar titulo de la pelicula");
            String titulo=leer.next();
            System.out.println("Ingresar director");
            String director=leer.next();
            System.out.println("Ingresar duracion");
            double duracion=leer.nextDouble();
            Pelicula pelicula=new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula);
            System.out.println("¿Desea ingresar otra pelicula?");
        } while ("s".equals(leer.next().toLowerCase()));
    }
    
    public void mostrarPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
    public void mostrarMayores1Hora() {
        Iterator <Pelicula> it=peliculas.iterator();
        while (it.hasNext()) {
            Pelicula pelicula=it.next();
            if (pelicula.getDuracion()>1) {
                System.out.println(pelicula);
            }
        }
    }
    
    public void ordenDuracionAsc() {
        Collections.sort(peliculas, Comparadores.compararDuracionAsc);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
    public void ordenDuracionDesc() {
        Collections.sort(peliculas, Comparadores.compararDuracionDesc);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
    public void ordenTitulo() {
        Collections.sort(peliculas, Comparadores.compararTitulo);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
    public void ordenDirector() {
        Collections.sort(peliculas, Comparadores.compararDirector);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}
