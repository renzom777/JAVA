/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio2;

import entidades.Circunferencia;

/**
 *
 * @author GustM_000
 */
public class POOEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circunferencia1= new Circunferencia(0);
        circunferencia1.crearCircunferencia(circunferencia1);
        System.out.println("El area de la circunferencia es de "+ circunferencia1.Area(circunferencia1));
        System.out.println("El perimetro de la circunferencia es de "+circunferencia1.Perimetro(circunferencia1));
    }
    
}
