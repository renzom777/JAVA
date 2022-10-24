/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio4;

import colecciones.ejercicio4.servicios.PeliculaServicio;

/**
 *
 * @author GustM_000
 */
public class ColeccionesEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PeliculaServicio pelserv= new PeliculaServicio();
        
        pelserv.crearPelicula();
        System.out.println("Las peliculas ingresadas son:");
        pelserv.mostrarPeliculas();
        System.out.println("Las peliculas ingresadas con duracion mayor a 1 hora son");
        pelserv.mostrarMayores1Hora();
        System.out.println("Las peliculas mas largas son");
        pelserv.ordenDuracionDesc();
        System.out.println("Las peliculas mas cortas son");
        pelserv.ordenDuracionAsc();
        System.out.println("Orden alfabetico por director");
        pelserv.ordenDirector();
        System.out.println("Orden alfabetico por titulo");
        pelserv.ordenTitulo();
    }
    
}
