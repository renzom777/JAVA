/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.Scanner;
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia (Circunferencia c){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar radio de la circunferencia");
        c.setRadio(leer.nextDouble());
    }
    
    public double Area(Circunferencia c){
        double area=Math.pow(c.getRadio()*Math.PI, 2);
        return area;
    }
    
    public double Perimetro (Circunferencia c){
        double perim=2*Math.PI*radio;
        return perim;
    }
}
