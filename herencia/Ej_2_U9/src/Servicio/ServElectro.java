

package Servicio;

import Entidades.Electrodomestico;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServElectro {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    Electrodomestico e= new Electrodomestico();
    
    private String comprobarConsumoEnergetico(String letra){
       /* if (!letra.equalsIgnoreCase("A") || !letra.equalsIgnoreCase("B") || !letra.equalsIgnoreCase("C") || !letra.equalsIgnoreCase("D") || !letra.equalsIgnoreCase("E")) {
            letra="F";
        }
        
        return letra;*/
        
       return letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") ?  letra: "F";

    }
    
    private String comprobarColor(String color){
      return color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris") ?  color: "blanco";  
    }
    
    public Electrodomestico crearElectrodomestico(){
        
        
        System.out.print("Ingrese el color de su electrodoméstico: ");
        String color= leer.next();
        e.setColor(comprobarColor(color));
        System.out.print("Ingrese el consumo energético de su electrodoméstico(A,B,C,D,E o F): ");
        String consum=leer.next().toUpperCase();
        e.setConsumo(comprobarConsumoEnergetico(consum));
        System.out.print("Ingrese el peso: ");
        e.setPeso(leer.nextInt());
        e.setPrecio(1000);
        return e;
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
        
        e.setPrecio(PreciosConsum.get(e.getConsumo()));
    // System.out.println("Precio final: "+e.getPrecio());
      
      //SEGÚN PESO
        if (e.getPeso()>0 && e.getPeso()<20) {e.setPrecio(100);}
        
        if (e.getPeso()>19 && e.getPeso()<50) {e.setPrecio(500);}
        
        if (e.getPeso()>49 && e.getPeso()<80) {e.setPrecio(800); }
        
        if (e.getPeso()>80 ) {e.setPrecio(1000);}
        
      
    }
}
