

package Entidades;

/**
 *
 * 
 */
public class Electrodomestico {
//precio, color,consumo energético (letras entre A y F) y peso.
    protected int precio,peso;
    protected String color, consumo;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, int peso, String color, String consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
        //this.consumo = comprobarConsumoEnergetico(consumo);

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio += precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    //COMPROBAR CONSUMO SIN SERVICIO
    /*
    private String comprobarConsumoEnergetico(String letra){
      return letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") ?  letra: "F";

    }
    */
    
    
}
