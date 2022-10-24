/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio6.entidades;

import java.util.Scanner;

/**
 *
 * @author GustM_000
 */
public class Cafetera {
    
    private double cafeActual;
    private double cafeMax;

    public Cafetera() {
    }

    public Cafetera(double cafeActual, double cafeMax) {
        this.cafeActual = cafeActual;
        this.cafeMax = cafeMax;
    }

    public double getCafeActual() {
        return cafeActual;
    }

    public void setCafeActual(double cafeActual) {
        this.cafeActual = cafeActual;
    }

    public double getCafeMax() {
        return cafeMax;
    }

    public void setCafeMax(double cafeMax) {
        this.cafeMax = cafeMax;
    }
    
    public void crearCafetera(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad actual en la cafetera");
        cafeActual=leer.nextDouble();
        System.out.println("Ingrese cantidad maxima de la cafetera");
        cafeMax=leer.nextDouble();
    }
    
    public void llenarCafetera(){
        cafeActual=cafeMax;
    }
    
    public void servirTaza(double taza){
        if (taza<=cafeActual) {
            cafeActual-=taza;
            System.out.println("La taza se ha llenado");
        } else {
            System.out.println("La taza no se ha llenado. Se ha servido la cantidad de "+ cafeActual);
            cafeActual=0;
        }
    }
    
    public void vaciarCafetera(){
        cafeActual=0;
    }
    
    public void agregarCafe(double cant){
        cafeActual+=cant;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cafeActual=" + cafeActual + ", cafeMax=" + cafeMax + '}';
    }
    
    
}
