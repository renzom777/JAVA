

package Entidades;

/**
 *
 * 
 */
public class Polideportivo extends Edificio{

    private String nom;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nom, boolean techado, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nom = "Polideportivo"+nom;
        this.techado = techado;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("\nSUPERFICIE DEL POLIDEPORTIVO: "+(alto*ancho)+" m²");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("\nVOLUMEN DEL POLIDEPORTIVO: "+(alto*ancho*largo)+" m3");
    }
    
}
