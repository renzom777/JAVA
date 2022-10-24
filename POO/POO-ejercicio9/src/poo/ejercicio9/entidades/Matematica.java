/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio9.entidades;

/**
 *
 * @author GustM_000
 */
public class Matematica {
    
    private static double num1;
    private static double num2;

    public Matematica() {
    }

    public static double getNum1() {
        return num1;
    }

    public static void setNum1(double num1) {
        Matematica.num1 = num1;
    }

    public static double getNum2() {
        return num2;
    }

    public static void setNum2(double num2) {
        Matematica.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matematica{" + '}';
    }
    
    
}
