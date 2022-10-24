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
public class BarcoEspecial extends Barco {
    
    public int mastiles;
    public int potenciabarcosvapor;
    public int potenciayateslujo;

    public BarcoEspecial(String nombre, int dnicliente, Date fechaalquiler, Date fechadevolucion, int posicionamarre, Barco barco, int mastiles, int potenciabarcosvapor, int potenciayateslujo) {
        super(nombre, dnicliente, fechaalquiler, fechadevolucion, posicionamarre, barco);
        this.mastiles=mastiles;
        this.potenciabarcosvapor=potenciabarcosvapor;
        this.potenciayateslujo=potenciayateslujo;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    public int getPotenciabarcosvapor() {
        return potenciabarcosvapor;
    }

    public void setPotenciabarcosvapor(int potenciabarcosvapor) {
        this.potenciabarcosvapor = potenciabarcosvapor;
    }

    public int getPotenciayateslujo() {
        return potenciayateslujo;
    }

    public void setPotenciayateslujo(int potenciayateslujo) {
        this.potenciayateslujo = potenciayateslujo;
    }

    @Override
    public String toString() {
        return "BarcoEspecial{" + "mastiles=" + mastiles + ", potenciabarcosvapor=" + potenciabarcosvapor + ", potenciayateslujo=" + potenciayateslujo + '}';
    }

    
    
}
