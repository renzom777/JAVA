

package Entidades;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * 
 */
public class Electrodomesticos {
protected int precio,peso;
    protected String color, consumo;

    public Electrodomesticos() {
    }

    public Electrodomesticos(int precio, int peso, String color, String consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);

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
    
    private String comprobarConsumoEnergetico(String letra){
        return letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") ?  letra.toUpperCase(): "F";
    }
    
    private String comprobarColor(String color){
      return color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris") ?  color: "Blanco";  
    }
    public void crearElectrodomestico(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el color de su electrodoméstico: ");
        color= comprobarColor(leer.next());
        System.out.print("Ingrese el consumo energético de su electrodoméstico(A,B,C,D,E o F): ");
        consumo= comprobarConsumoEnergetico(leer.next());
        System.out.print("Ingrese el peso: ");
        peso=leer.nextInt();
        precio=1000;
        
    }
    
    public void precioFinal(){
        //SEGÚN CONSUMO
        HashMap<String,Integer> PreciosConsum= new HashMap();
        PreciosConsum.put("A", 1000);
        PreciosConsum.put("B", 800);
        PreciosConsum.put("C",600);
        PreciosConsum.put("D",500);
        PreciosConsum.put("E",300);
        PreciosConsum.put("F",100);
        setPrecio(PreciosConsum.get(consumo));
    // System.out.println("Precio final: "+e.getPrecio());
      
      //SEGÚN PESO
        if (peso>0 && peso<20) {setPrecio(100);}
        
        if (peso>19 && peso<50) {setPrecio(500);}
        
        if (peso>49 && peso<80) {setPrecio(800); }
        
        if (peso>80 ) {setPrecio(1000);}
        
      
    }
}
