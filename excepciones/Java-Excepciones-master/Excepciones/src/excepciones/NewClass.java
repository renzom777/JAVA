/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author GustM_000
 */
public class NewClass {

    public static void main(String[] args) {
        boolean bandera=false;
        do {
            try {
                ingresarNombre();
                bandera=true;
            } catch (NewException a) {
                System.out.println(a.getMessage());
            }
        } while (bandera=false);
        boolean bandera1=false;
        do {
            try {
                ingresarEdad();
                bandera1=true;
            } catch (NewException a) {
                System.out.println(a.getMessage());
            }
        } while (bandera1=true);
    }

    public static void ingresarNombre() throws NewException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar nombre");
        String nombre = leer.next();
        if (nombre.length() < 2) {
            NewException errorNombre = new NewException("Nombre mas largo");
            throw errorNombre;
        }
    }

    public static void ingresarEdad() throws NewException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar Edad");
        int edad = leer.nextInt();
        if (edad < 0) {
            NewException errorEdad = new NewException("Debe ser mayor a 0");
            throw errorEdad;
        }
    }
}
