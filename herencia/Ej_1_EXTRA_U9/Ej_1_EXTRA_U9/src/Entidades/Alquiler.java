

package Entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * 
 */
public class Alquiler {
/* 
    el nombre,
     * documento del cliente, la fecha de alquiler, fecha de devolución, la
     * posición del amarre y el barco que lo ocupará.
    */
    
    private String nom;
    private int dni, posAmarre;
    private LocalDate alquiler, devolucion;
    private Barco bar;
   

    public Alquiler() {
    }

    public Alquiler(String nom, int dni, int posAmarre, LocalDate alquiler, LocalDate devolucion, Barco bar) {
        this.nom = nom;
        this.dni = dni;
        this.posAmarre = posAmarre;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.bar = bar;
    }

    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public LocalDate getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(LocalDate alquiler) {
        this.alquiler = alquiler;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }


    public Barco getBar() {
        return bar;
    }

    public void setBar(Barco bar) {
        this.bar = bar;
    }
    
    
    public void crearAlquiler(){
        Scanner leer= new Scanner (System.in);
        System.out.print("Ingrese su nombre: ");
        nom=leer.next();
        System.out.print("Ingrese su DNI: ");
        dni=leer.nextInt();
        System.out.println("Ingrese la fecha de inicio de alquiler: (separando por espacios)");
        
        int dia=leer.nextInt();
        int mes=leer.nextInt();
        int anio=leer.nextInt();
        alquiler=LocalDate.of(anio, mes, dia);
        
        System.out.print("Ingrese la fecha de devolución de su alquiler (separando por espacios)");
        int d=leer.nextInt();
        int m=leer.nextInt();
        int a=leer.nextInt();
        devolucion=LocalDate.of(a, m, d);
        
        System.out.print("Ingrese la posición de amarre: ");
        posAmarre= leer.nextInt();
        System.out.println("\nOpciones de barcos: ");
        System.out.println("1.Barco normal");
        System.out.println("2.Velero");
        System.out.println("3.Barco con motor");
        System.out.println("4.Yate");
        
        System.out.print("Ingrese un número de acuerdo a su barco: ");
        int op=leer.nextInt();
        switch (op) {
            case 1:
                bar= new Barco();
                
                break;
            case 2:
                bar= new Velero();
               
                break;
            case 3:
                bar= new BarcoMotor();
                
                break;
            case 4:
                bar= new Yate();
                break;
            default:
                System.out.println("Número de opción mal ingresado ");
        }
        bar.crearBarco();
        
    }
    
    public void precioAlquiler(){
        Period diasContratados=Period.between(alquiler, devolucion);
        int f=diasContratados.getDays();
       
        System.out.println("\nPRECIO ALQUILER: $"+(f*bar.modulo()));
    }
    
    public void mostrar(){
        System.out.println("\nMUESTRA de DATOS");
        System.out.println("Nombre: "+nom);
        System.out.println("DNI: "+dni);
        System.out.println("Fecha Alquiler: "+alquiler);
        System.out.println("Fecha Devolución: "+devolucion);
        System.out.println("Posición Amarre: "+posAmarre);
        System.out.println("Barco: "+bar);
    }
}
