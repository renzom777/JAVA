/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio4;

import poo.ejercicio4.entidades.Rectangulo;

/**
 *
 * @author GustM_000
 */
public class POOEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo rect=new Rectangulo();
        rect.crearRectangulo(rect);
        System.out.println("El area del rectangulo es "+ rect.superficie());
        System.out.println("El perimetro del rectangulo es "+ rect.perimetro());
        System.out.println("El rectangulo en cuestion es el siguiente");
        System.out.println("");
        rect.mostrarRectangulo();
        
    }
    
}
