

package Entidades;

/**
 *
 * 
 */
public class Televisor extends Electrodomestico {
    
    private int resol;
    private boolean tdt;//sintonizador

    public Televisor() {
    }

    public Televisor(int resol, boolean tdt, int precio, int peso, String color, String consumo) {
        super(precio, peso, color, consumo);
        this.resol = resol;
        this.tdt = tdt;
    }

    public int getResol() {
        return resol;
    }

    public void setResol(int resol) {
        this.resol = resol;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

   
    
    
    
}
