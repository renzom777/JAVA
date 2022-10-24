/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio12;

import java.util.Scanner;
import poo.ejercicio12.entidades.Persona;
import poo.ejercicio12.servicios.PersonaServicio;

/**
 *
 * @author GustM_000
 */
public class POOEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio perserv=new PersonaServicio();
        Persona pers1=perserv.crearPersona();
        System.out.println("La edad de "+pers1.getNombre()+" es de "+perserv.calcularEdad(pers1));
        System.out.println("Ingrese la edad de otra persona a comparar");
        int edad=leer.nextInt();
        System.out.println("¿"+pers1.getNombre()+" es menor que ésta última persona? "+perserv.menorQue(pers1, edad));
        perserv.motrarPersona(pers1);
    }
    
}
