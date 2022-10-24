/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.extra2.entidades;

/**
 *
 * @author GustM_000
 */
public final class EdificioDeOficinas extends Edificio {
    
     private int oficinas;
    private int personasporoficina;
    private int pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int oficinas, int personasporoficina, int pisos, int ancho, int largo, int alto) {
        super(ancho, largo, alto);
        this.oficinas = oficinas;
        this.personasporoficina = personasporoficina;
        this.pisos = pisos;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonasporoficina() {
        return personasporoficina;
    }

    public void setPersonasporoficina(int personasporoficina) {
        this.personasporoficina = personasporoficina;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    @Override
    public int calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public int calcularVolumen() {
        return ancho*largo*alto;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "oficinas=" + oficinas + ", personasporoficina=" + personasporoficina + ", pisos=" + pisos + '}';
    }
    
    
    
    
}
