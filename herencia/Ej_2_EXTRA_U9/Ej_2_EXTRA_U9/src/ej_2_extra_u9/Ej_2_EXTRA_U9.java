package ej_2_extra_u9;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.List;

public class Ej_2_EXTRA_U9 {

    /**
     * @param args the command line arguments 
     * Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. 
     * La clase edificio tendrá como métodos: 
     * • Método calcularSuperficie(): calcula la superficie del edificio. 
     * • Método calcularVolumen(): calcula el volumen del edifico. 
     * Estos métodos serán abstractos y los implementarán las
     * siguientes clases: 
     * • Clase Polideportivo con su nombre y tipo de
     * instalación que puede ser Techado o Abierto, esta clase implementará los
     * dos métodos abstractos y los atributos del padre. 
     * • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
     * personas por oficina y número de pisos. Esta clase implementará los dos
     * métodos abstractos y los atributos del padre. De esta clase nos interesa
     * saber cuántas personas pueden trabajar en todo el edificio, el usuario
     * dirá cuántas personas entran en cada oficina, cuantas oficinas y el
     * número de piso (suponiendo que en cada piso hay el mismo número de oficinas). Crear el
     * método cantPersonas(), que muestre cuantas personas entrarían en un piso
     * y cuantas en todo el edificio.
     * --------------------------------------------------------------------------
     * Por último, en el main vamos a crear un ArrayList de tipo Edificio. 
     * El ArrayList debe contener dos polideportivos y dos edificios de oficinas. 
     * Luego, recorrer este array y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio.
     * Se deberá mostrar la superficie y el volumen de cada edificio.
    
     * Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
     * techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
     * cantPersonas() y mostrar los resultados de cada edificio de oficinas.
     */
    public static void main(String[] args) {
        List<Edificio> edif= new ArrayList();
        Edificio e1= new Polideportivo("Barrio Rivadavia Norte", false, 8, 4, 4);//nom, techado(true, false), ancho, alto , largo
        Edificio e2= new EdificioDeOficinas(10, 5, 5, 12, 30, 6);//numOficinas, cantPersonas, numPisos, ancho, alto, largo
        Edificio e3= new Polideportivo("9 de Julio", false, 0, 0, 0);
         Edificio e4= new EdificioDeOficinas(10, 10, 5, 12, 30, 6);
        
        edif.add(e1);
        edif.add(e2);
        edif.add(e3);
        edif.add(e4);
        int c1=0, c2=0;
        for (Edificio aux : edif) {
             System.out.println("----------------------");
            if (aux instanceof Polideportivo) {
                Polideportivo po = (Polideportivo) aux;
                if (po.isTechado()) {
                    c1+=1;
                }
                else{ c2+=1;}
                po.calcularSuperficie();
                po.calcularVolumen();
            }
           
            if (aux instanceof EdificioDeOficinas) {
                EdificioDeOficinas eo = (EdificioDeOficinas) aux;
                eo.calcularSuperficie();
                eo.calcularVolumen();
                eo.cantPersonas();
            }
        }
        System.out.println("----------------------");
        System.out.println("Cantidad de polideportivos techados: "+c1+"\nCantidad de polideportivos abiertos: "+c2);
        
    }

}
