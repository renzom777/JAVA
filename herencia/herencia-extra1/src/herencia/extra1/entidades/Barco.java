/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.extra1.entidades;

import java.util.Date;

/**
 *
 * @author GustM_000
 */
public class Barco {
    
    protected String nombre;
    protected int dnicliente;
    protected Date fechaalquiler;
    protected Date fechadevolucion;
    protected int posicionamarre;
    protected Barco barco;

    public Barco() {
    }

    public Barco(String nombre, int dnicliente, Date fechaalquiler, Date fechadevolucion, int posicionamarre, Barco barco) {
        this.nombre = nombre;
        this.dnicliente = dnicliente;
        this.fechaalquiler = fechaalquiler;
        this.fechadevolucion = fechadevolucion;
        this.posicionamarre = posicionamarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDnicliente() {
        return dnicliente;
    }

    public void setDnicliente(int dnicliente) {
        this.dnicliente = dnicliente;
    }

    public Date getFechaalquiler() {
        return fechaalquiler;
    }

    public void setFechaalquiler(Date fechaalquiler) {
        this.fechaalquiler = fechaalquiler;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public int getPosicionamarre() {
        return posicionamarre;
    }

    public void setPosicionamarre(int posicionamarre) {
        this.posicionamarre = posicionamarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ", dnicliente=" + dnicliente + ", fechaalquiler=" + fechaalquiler + ", fechadevolucion=" + fechadevolucion + ", posicionamarre=" + posicionamarre + ", barco=" + barco + '}';
    }
    
    
}
