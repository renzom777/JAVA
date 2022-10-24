

package Entidades;

/**
 *
 * 
 */
public class BarcoMotor extends Barco {
    protected int potencia;

    public BarcoMotor(int potencia, int matricula, int eslora, int añofab) {
        super(matricula, eslora, añofab);
        this.potencia = potencia;
    }

    public BarcoMotor() {
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int modulo() {
        return super.modulo()+potencia; 
    }

    @Override
    public void crearBarco() {
        super.crearBarco(); 
        System.out.print("Ingrese la potencia de su barco en CV: ");
        potencia=leer.nextInt();
    }
    
    
    
}
