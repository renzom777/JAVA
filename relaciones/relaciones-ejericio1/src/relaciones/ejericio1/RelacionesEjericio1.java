/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.ejericio1;

import java.util.Scanner;
import relaciones.ejericio1.entidades.Perro;
import relaciones.ejericio1.entidades.Persona;

/**
 *
 * @author Naksuke
 */
public class RelacionesEjericio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Perro pe1=new Perro ("Luna", "Border", 8, "Mediana");
//        Perro pe2=new Perro("Niebla", "Labrador", 4, "Mediana");
//        Persona p1=new Persona ("Sheik", "Janavel", 23, 41236989, pe1);
//        Persona p2=new Persona ("Renzo", "Mercado", 25, 39954289, pe2);
//        
//        System.out.println(p1);
//        System.out.println(p2);
        Scanner leer=new Scanner(System.in);
        Perro[] perros=new Perro[2];
        Persona[] personas=new Persona[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el nombre del perro "+(i+1));
            String nombrePerro=leer.next();
            System.out.println("Ingrese raza de "+nombrePerro);
            String raza=leer.next();
            System.out.println("Ingrese edad de "+nombrePerro);
            Integer edadPerro=leer.nextInt();
            System.out.println("Ingrese tamaño de "+nombrePerro);
            String tamaño=leer.next();
            perros[i]=new Perro(nombrePerro, raza, edadPerro, tamaño);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el nombre de la persona "+(i+1));
            String nombre=leer.next();
            System.out.println("Ingrese el apellido de "+nombre);
            String apellido=leer.next();
            System.out.println("Ingrese la edad de "+nombre);
            Integer edad=leer.nextInt();
            System.out.println("Ingrese dni de "+nombre);
            Integer dni=leer.nextInt();
            System.out.println("Ingrese nombre del perro de "+nombre);
            String perro=leer.next();
            for (int j = 0; j < 2; j++) {
                Perro perroVector=perros[j];
                if (perroVector.getNombre().equals(perro)) {
                    personas[i]=new Persona(nombre, apellido, edad, dni, perroVector);
                }
            }
        }
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
