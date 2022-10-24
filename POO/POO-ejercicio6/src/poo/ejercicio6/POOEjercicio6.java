/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio6;

import java.util.Scanner;
import poo.ejercicio6.entidades.Cafetera;

public class POOEjercicio6 {

    public static void main(String[] args) {

        Cafetera c = new Cafetera();
        c.crearCafetera();

        Scanner leer = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("");
            System.out.println("NESPRESO");
            System.out.println("");
            System.out.println("¿Qué desea?");
            System.out.println("A. Llenar cafetera");
            System.out.println("B. Servir taza");
            System.out.println("C. Vaciar cafetera");
            System.out.println("D. Agregar cafe");
            System.out.println("E. Salir");
            opcion=leer.next();
            switch (opcion) {
                case "a":
                    c.llenarCafetera();
                    break;
                case "b":
                    System.out.println("Ingrese tamaño de la taza");
                    c.servirTaza(leer.nextDouble());
                    break;
                case "c":
                    c.vaciarCafetera();
                    break;
                case "d":
                    System.out.println("¿Cuanto café agregará?");
                    c.agregarCafe(leer.nextDouble());
                    break;
            }
        } while (!opcion.equals("f"));
    }

}
