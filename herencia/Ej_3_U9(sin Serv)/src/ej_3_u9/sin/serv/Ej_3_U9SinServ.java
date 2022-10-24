

package ej_3_u9.sin.serv;


import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;


public class Ej_3_U9SinServ {

    /**
     * @param args the command line arguments
     * EJERCICIO 3
      Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
    para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
    Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
    deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
    televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
    precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
    2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
    electrodomésticos, 2000 para lavadora y 5000 para televisor.
     */
    public static void main(String[] args) {
   
      List<Electrodomesticos> elec = new ArrayList();
      
        Electrodomesticos e1= new Lavadora (35, 1000, 10, "blanco", "F");
        Electrodomesticos e2= new Televisor(35, true, 1000, 50, "negro", "A");
        Electrodomesticos e3= new Televisor(20, false, 1000, 10, "azul", "C");
        Electrodomesticos e4= new Lavadora(25, 1000, 40, "azul", "A");
        elec.add(e1);
        elec.add(e2);
        elec.add(e3);
        elec.add(e4);
        for (Electrodomesticos aux : elec) {
            aux.precioFinal();
        }
      
      
    }

}
