

package Entidades;

/**
 *
 * 
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
       
    }
    

    public Lavadora(int carga, int precio, int peso, String color, String consumo) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

   

    
    
    
    
    
}
