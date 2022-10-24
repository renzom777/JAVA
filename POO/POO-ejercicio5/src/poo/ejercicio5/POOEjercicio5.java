/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio5;

import java.util.Scanner;
import poo.ejercicio5.entidades.Cuenta;
import poo.ejercicio5.servicios.CuentaServicio;
public class POOEjercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cserv= new CuentaServicio();
        Cuenta cuenta1=cserv.crearCuenta();
        String opcion;
        do {            
            System.out.println("CAJERO");
            System.out.println("");
            System.out.println("¿Qué desea realizar?");
            System.out.println("A. Ingresar dinero");
            System.out.println("B. Retirar dinero");
            System.out.println("C. Extraccion rapida");
            System.out.println("D. Mostrar saldo");
            System.out.println("E. Mostrar datos");
            System.out.println("F. Salir");
            opcion=leer.next();
            switch (opcion) {
                case "a":
                    System.out.println("Ingrese cantidad de dinero a ingresar");
                    cserv.ingresar(cuenta1, leer.nextDouble());
                    break;
                case "b":
                    System.out.println("Ingresar cantidad de dinero a retirar");
                    cserv.retirar(cuenta1, leer.nextDouble());
                    break;
                case "c":
                    System.out.println("Extraccion del 20% realizada");
                    cserv.extraccionRapida(cuenta1);
                    break;
                case "d":
                    cserv.mostrarSaldo(cuenta1);
                    break;
                case "e":
                    cserv.mostrarDatos(cuenta1);
                    break;
            }
        } while (!opcion.equals("f"));
    }
    
}
