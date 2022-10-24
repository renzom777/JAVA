

package Servicio;

import Entidades.Electrodomestico;
import Entidades.Lavadora;


/**
 *
 * 
 */
public class ServLavadora extends ServElectro {
    Lavadora l= new Lavadora();
  
    public void crearLavadora(){
        System.out.println("CREAR LAVADORA");
        super.crearElectrodomestico();
        l.setColor(e.getColor());
        l.setConsumo(e.getConsumo());
        l.setPeso(e.getPeso());
        l.setPrecio(e.getPrecio());
        System.out.print("Ingrese la capacidad de carga en kg: ");
        l.setCarga(leer.nextInt());
       
    }

    @Override
    public void precioFinal() {
       // System.out.println("Precio: "+l.getPrecio());
        super.precioFinal(); 
        l.setPrecio(e.getPrecio());
       // System.out.println("Precio new: "+l.getPrecio());
        if (l.getCarga()>30) {
            l.setPrecio(l.getPrecio()+500);
        }
      System.out.println("PRECIO FINAL LAVADORA: "+ l.getPrecio());
    }

    
    
}
