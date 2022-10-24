/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author GustM_000
 */
public class POOEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Date fechaCreada=new Date();
        Date fechaActual=new Date();
        System.out.println("Ingresar dia de la fecha a crear");
        fechaCreada.setDate(leer.nextInt());
        System.out.println("Ingresar mes de la fecha a crear");
        fechaCreada.setMonth(leer.nextInt()-1);
        System.out.println("Ingresar año de la fecha a crear");
        fechaCreada.setYear(leer.nextInt()-1900);
        System.out.println("La fecha creada entonces es "+fechaCreada);
        System.out.println("La diferencia de años entre la fecha creada y la actual es de "+ (fechaCreada.getYear()-fechaActual.getYear())+" años");
    }
    
}
