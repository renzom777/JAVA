/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio7.entidades;

import java.util.Scanner;
public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre de la persona");
        nombre=leer.next();
        System.out.println("Ingrese sexo");
        sexo=leer.next();
        while (!sexo.equals("h")&&!sexo.equals("m")&&!sexo.equals("o")){
            System.out.println("Debe ingresar h (hombre), m (mujer) u o (otro)");
            sexo=leer.next();
        }
        System.out.println("Ingrese edad");
        edad=leer.nextInt();
        System.out.println("Ingrese altura, en metros");
        altura=leer.nextDouble();
        System.out.println("Ingrese peso, en kilos");
        peso=leer.nextDouble();
    }
    
    public int calcularIMC(){
        double imc;
        double k=Math.pow(altura, 2);
        imc=peso/k;
        if (imc<20){
            return -1;
        } else if (imc>25) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public boolean esMayorDeEdad(){
        boolean bandera=edad>18;
        return bandera;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
}
