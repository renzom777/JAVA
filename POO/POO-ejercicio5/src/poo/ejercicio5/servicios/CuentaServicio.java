/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio5.servicios;

import java.util.Scanner;
import poo.ejercicio5.entidades.Cuenta;

/**
 *
 * @author GustM_000
 */
public class CuentaServicio {
    
    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in);
        Cuenta c = new Cuenta();
        System.out.println("Ingresar número de cuenta");
        c.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingresar DNI");
        c.setDni(leer.nextInt());
        System.out.println("Ingresar saldo");
        c.setSaldo(leer.nextInt());
        return c;
    }
    
    public void ingresar(Cuenta c, double dinero){
        c.setSaldo(c.getSaldo()+dinero);
    }
    
    public void retirar(Cuenta c, double retiro){
        if (retiro>=c.getSaldo()) {
            c.setSaldo(0);
        } else {
            c.setSaldo(c.getSaldo()-retiro);
        }
    }
    
    public void extraccionRapida(Cuenta c){
        c.setSaldo(c.getSaldo()-0.2*c.getSaldo());
    }
    
    public void mostrarSaldo (Cuenta c){
        System.out.println("El sadldo actual es de $"+ c.getSaldo());
    }
    
    public void mostrarDatos (Cuenta c){
        System.out.println(c);
    }
}
