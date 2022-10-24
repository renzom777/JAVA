/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio9;

import java.util.Scanner;
import poo.ejercicio9.entidades.Matematica;
import poo.ejercicio9.servicios.MatematicaServicio;

/**
 *
 * @author GustM_000
 */
public class POOEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        MatematicaServicio matserv= new MatematicaServicio();
        Matematica mat=new Matematica();
        System.out.println("Los atributos de la clase se han cargado aleatoriamente");
        mat.setNum1(Math.random()*10);
        mat.setNum2(Math.random()*10);
        
        System.out.println("El mayor de ambos números es "+ matserv.devolverMayor(mat));
        System.out.println("La potencia del mayor número elevado al menor numero es "+ matserv.calcularPotencia(mat));
        System.out.println("La raiz cuadrada del menor de los numeros es "+ matserv.calcularRaiz(mat));
        System.out.println(mat.getNum1()+" ; "+ mat.getNum2());
        
        Matematica mat1=new Matematica();
        System.out.println("");
        System.out.println("Ingrese primer numero");
        mat1.setNum1(leer.nextDouble());
        System.out.println("Ingrese segundo numero");
        mat1.setNum2(leer.nextDouble());
        
        System.out.println("");
        System.out.println("Al ser estaticos los atributos, si hago ahora una operacion con el primer objeto creado, se tomarán los atributos ingresados para el segundo");
        System.out.println("El mayor de ambos números es "+ matserv.devolverMayor(mat));
        System.out.println("La potencia del mayor número elevado al menor numero es "+ matserv.calcularPotencia(mat));
        System.out.println("La raiz cuadrada del menor de los numeros es "+ matserv.calcularRaiz(mat));
    }
    
}
