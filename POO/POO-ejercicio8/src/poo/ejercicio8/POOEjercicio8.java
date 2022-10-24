/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio8;

import java.util.Scanner;
import poo.ejercicio8.entidades.Cadena;
import poo.ejercicio8.servicios.CadenaServicio;

/**
 *
 * @author GustM_000
 */
public class POOEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio cadserv=new CadenaServicio();
        Cadena cad1=cadserv.crearCadena();
        cadserv.mostrarVocales(cad1);
        System.out.println("Ingrse caracter para buscar repeticion");
        String carac=leer.next();
        System.out.println("Se encuentra repetido "+cadserv.vecesRepetido(cad1, carac));
        System.out.println("La frase invertida es "+cadserv.invertirFrase(cad1));
        cadserv.compararLongitud(cad1);
        cadserv.unirFrases(cad1);
        cadserv.reemplazar(cad1);
        cadserv.contiene(cad1);
    }
    
}
