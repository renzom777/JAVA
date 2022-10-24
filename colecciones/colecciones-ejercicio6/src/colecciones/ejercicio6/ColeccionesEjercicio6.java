/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author GustM_000
 */
public class ColeccionesEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Integer> catalogo=new HashMap();
        int opcion;
        do {            
            System.out.println("");
            System.out.println("--------------MENU------------");
            System.out.println("1. Ingresar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar producto con su precio");
            System.out.println("5. Salir");
            System.out.println("¿Qué desea realizar? Ingrese numero de opcion");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar nombre del producto");
                    String nombre=leer.next();
                    System.out.println("Ingresar precio del producto");
                    Integer precio=leer.nextInt();
                    catalogo.put(nombre, precio);
                    break;
                case 2:
                    System.out.println("Ingrese nombre del producto");
                    String nombre1=leer.next();
                    System.out.println("Ingrese precio nuevo");
                    Integer precio1=leer.nextInt();
                    for (Map.Entry<String, Integer> entry : catalogo.entrySet()) {
                        if (entry.getKey().equals(nombre1)) {
                            entry.setValue(precio1);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese nombre del producto a eliminar");
                    String nombre2=leer.next();
                    Iterator <Map.Entry<String, Integer>> it=catalogo.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getKey().equals(nombre2)) {
                            it.remove();
                        }
                    }
                    break;
                case 4:
                    for (Map.Entry<String, Integer> entry : catalogo.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        System.out.println(key+": $"+value);
                    }
                    break;
            }
        } while (opcion!=5);
    }
    
}
