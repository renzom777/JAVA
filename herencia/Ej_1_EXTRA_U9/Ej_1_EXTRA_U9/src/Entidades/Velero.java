

package Entidades;

/**
 *
 * 
 */
public final class Velero extends Barco {
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, int matricula, int eslora, int añofab) {
        super(matricula, eslora, añofab);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public int modulo() {
        return super.modulo()+mastiles; 
    }

    @Override
    public void crearBarco() {
        super.crearBarco(); 
        System.out.print("Ingrese el número de mástiles: ");
        mastiles=leer.nextInt();
        
    }
    
    
}
