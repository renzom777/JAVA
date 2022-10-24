

package Entidades;

/**
 *
 * 
 */
public final class Yate extends BarcoMotor {
    private int cantCamarotes;

    public Yate() {
    }

    public Yate(int cantCamarotes, int potencia, int matricula, int eslora, int añofab) {
        super(potencia, matricula, eslora, añofab);
        this.cantCamarotes = cantCamarotes;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int modulo() {
        return super.modulo()+cantCamarotes; 
    }

    @Override
    public void crearBarco() {
        super.crearBarco(); 
        System.out.print("Ingrese la cantidad de camarotes: ");
        cantCamarotes=leer.nextInt();
    }

  
    
    
  
    
}
