/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio1y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author GustM_000
 */
public class ColeccionesEjercicio1Y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String opcion="n";
        ArrayList<String> razas=new ArrayList();
        do {            
            System.out.println("Ingresar una raza de perro");
            String raza=leer.next();
            razas.add(raza);
            System.out.println("¿Desea agregar alguna raza más?");
            opcion=leer.next();
        } while (opcion.equals("s"));
        for (String var : razas) {
            System.out.println(var);
        }
        System.out.println("Ingrese una raza de perro a buscar en la lista");
        String r=leer.next();
        Iterator it=razas.iterator();
        boolean bandera=false;
        while (it.hasNext()) {
            if (it.next().equals(r)) {
                it.remove();
                bandera=true;
            } 
        }
        if (bandera){
            System.out.println("La raza se encontraba en la lista y ha sido eliminada");
        } else {
            System.out.println("La raza no se ha encontrado en la lista");
        }
        razas.sort(Collections.reverseOrder());
        for (int i = 0; i < razas.size(); i++) {
            System.out.println(razas.get(i));
        }
    }
    
}
