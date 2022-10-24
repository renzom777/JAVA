

package Servicio;

import Entidades.Televisor;

/**
 *
 * 
 */
public class ServTelevisor extends ServElectro{
    Televisor t= new Televisor();
    
    public void crearTelevisor(){
        System.out.println("CREAR TELEVISOR");
        super.crearElectrodomestico();
        t.setColor(e.getColor());
        t.setConsumo(e.getConsumo());
        t.setPeso(e.getPeso());
        t.setPrecio(e.getPrecio());
        System.out.print("Ingrese la resolución en pulgadas: ");
        t.setResol(leer.nextInt());
        System.out.println("Ingrese true si tiene sintonizador, sino false");
        t.setTdt(leer.nextBoolean());
    
    }
    
    @Override
    public void precioFinal() {
      
        super.precioFinal(); 
        t.setPrecio(e.getPrecio());
        if (t.getResol()>40) {
            t.setPrecio(t.getPrecio()+(int)(t.getPrecio()*0.3));
        }
        if (t.isTdt() == true) {
           t.setPrecio(t.getPrecio()+500);
        }
        System.out.println("PRECIO FINAL TELEVISOR: "+ t.getPrecio());
    }
}
