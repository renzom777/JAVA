/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio4.entidades;

import java.util.Scanner;

/**
 *
 * @author GustM_000
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(Rectangulo rect){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base del rectangulo");
        rect.setBase(leer.nextInt());
        System.out.println("Ingrese altura del rectangulo");
        rect.setAltura(leer.nextInt());
    }
    
    public int perimetro(){
        return (base+altura)*2;
    }
    
    public int superficie(){
        return altura*base;
    }
    
    public void mostrarRectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1 || j==0 || j==base-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
