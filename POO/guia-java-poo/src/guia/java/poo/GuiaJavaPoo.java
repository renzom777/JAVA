/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.java.poo;
import java.util.Scanner;
public class GuiaJavaPoo {
    /*
     * seguimiento de los ejemplos internos de la guia
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona primera= new Persona(leer.next(), leer.nextInt(), leer.next());
        Persona segunda= new Persona("Renzo", 25, "Argentina");
    }
    
}
