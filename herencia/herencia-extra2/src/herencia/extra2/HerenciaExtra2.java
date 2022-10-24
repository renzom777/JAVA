/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.extra2;

import herencia.extra2.entidades.Edificio;
import herencia.extra2.entidades.EdificioDeOficinas;

/**
 *
 * @author GustM_000
 */
public class HerenciaExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Edificio ed=new EdificioDeOficinas(10, 1, 11, 5, 4, 3);
        System.out.println(ed.calcularSuperficie());
    }
    
    //EJERCICIO SIN TERMINAR
}
