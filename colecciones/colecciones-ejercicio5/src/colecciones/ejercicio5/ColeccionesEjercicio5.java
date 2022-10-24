/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio5;

import java.util.*;

public class ColeccionesEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> paises=new HashSet();
        Scanner leer = new Scanner(System.in);
        do {            
            System.out.println("Ingresar pais");
            String pais=leer.next();
            paises.add(pais);
            System.out.println("¿Desea ingresar otro pais?");
        } while ("s".equals(leer.next().toLowerCase()));
        // Se puede ordenar un conjunto de las dos siguientes formas:
        
//        ArrayList<String> paisesL=new ArrayList(paises);
//        Collections.sort(paisesL);

        TreeSet<String> paisesTree=new TreeSet(paises);
        
        for (String paise : paisesTree) {
            System.out.println(paise);
        }
        
        boolean bandera=false;
        Iterator<String> it=paisesTree.iterator();
        System.out.println("Ingrese un pais a eliminar");
        System.out.println("");
        String paisBuscado=leer.next();
        while (it.hasNext()) {
            if (it.next().equals(paisBuscado)) {
                it.remove();
                bandera=true;
                break;
            }
        }
        if (bandera) {
            System.out.println("El pais se encontró y se eliminó");
        } else {
            System.out.println("El país ingresado no se encontró");
        }
        for (String paise : paisesTree) {
            System.out.println(paise);
        }
    }
    
}
