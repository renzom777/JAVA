

package ej_2_u9.sin.serv;


import Entidades.Lavadora;
import Entidades.Televisor;


public class Ej_2_U9SinServ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Lavadora e1=new Lavadora();
      e1.crearLavadora();
      e1.precioFinal();
        System.out.println("--------------------");
      Televisor t1=new Televisor();
      t1.crearTelevisor();
      t1.precioFinal();
      
      
    }

}
