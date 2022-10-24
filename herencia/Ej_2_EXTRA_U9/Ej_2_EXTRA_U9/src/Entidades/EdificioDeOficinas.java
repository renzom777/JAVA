

package Entidades;

/**
 *
 * 
 */
public class EdificioDeOficinas extends Edificio {
    private int numofi, cantP, numpisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numofi, int cantP, int numpisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numofi = numofi;
        this.cantP = cantP;
        this.numpisos = numpisos;
    }

    public int getNumofi() {
        return numofi;
    }

    public void setNumofi(int numofi) {
        this.numofi = numofi;
    }

    public int getCantP() {
        return cantP;
    }

    public void setCantP(int cantP) {
        this.cantP = cantP;
    }

    public int getNumpisos() {
        return numpisos;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }
    
    
    
    @Override
    public void calcularSuperficie() {
        System.out.println("\nSUPERFICIE DEL EDIFICIO DE OFICINAS: "+(largo*ancho)+" m^2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("\nVOLUMEN DEL EDIFICIO DE OFICINAS: "+(largo*ancho*alto)+"m^3");
    }
    
    public void cantPersonas(){
        System.out.println("\nCANTIDAD DE PERSONAS POR PISO: "+(numofi*cantP));
        System.out.println("\nCANTIDAD DE PERSONAS EN EL EDIFICIO: "+(numofi*cantP)*numpisos);
    }

}
