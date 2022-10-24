/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio7;

import poo.ejercicio7.entidades.Persona;

public class POOEjercicio7 {

    public static void main(String[] args) {

        Persona[] vectorP = new Persona[4];
        double bajoPeso = 0;
        double altoPeso = 0;
        double ideal = 0;
        double mayores = 0;
        double menores = 0;
        for (int i = 0; i < 4; i++) {
            Persona p = new Persona();
            p.crearPersona();
            System.out.println("¿Está en su peso ideal? (-1: por debajo; 0: afirmativo; 1: por encima)");
            System.out.println(p.calcularIMC());
            if (p.calcularIMC() == -1) {
                bajoPeso += 1;
            } else if (p.calcularIMC() == 1) {
                altoPeso += 1;
            } else {
                ideal += 1;
            }
            System.out.println("¿Es mayor de edad?");
            System.out.println(p.esMayorDeEdad());
            if (p.esMayorDeEdad()) {
                mayores += 1;
            } else {
                menores += 1;
            }
            vectorP[i] = p;
        }
        System.out.println("El porcentaje de personas con sobrepeso es de " + altoPeso / 4 * 100 + " %");
        System.out.println("El porcentaje de personas con falta de peso es de " + bajoPeso / 4 * 100 + " %");
        System.out.println("El porcentaje de personas con peso ideal es de " + ideal / 4 * 100 + " %");
        System.out.println("El porcentaje de personas mayores de edad es de " + mayores / 4 * 100 + " %");
        System.out.println("El porcentaje de personas menores de edad es de " + menores / 4 * 100 + " %");
    }

}
