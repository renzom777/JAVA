

package Entidades;

import java.util.Scanner;

/**
 *
 * 
 */
public class Lavadora extends Electrodomesticos{
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
    
    public void crearLavadora(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.print("Ingrese la capacidad de carga en kg: ");
        carga=leer.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (carga>30) {
            precio+=500;
        }
     System.out.println("PRECIO FINAL LAVADORA: "+ precio);
    }
    
}
