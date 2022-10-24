/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author GustM_000
 */
public class ExcepcionesEjercicio5 {

    public static void main(String[] args) {
        
        int contador=0;
        int contadorFinal;
        int r = ThreadLocalRandom.current().nextInt(1, 500 + 1);
        System.out.println(r);
        try {
            adivinar(r, contador);
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un numero, no letras");
            adivinar(r, contador);
        }

    }
    
/*
    no funciona lo del contador, para eso el dowhile deberia ir fuera del metodo, antes del try
    */
    
    public static void adivinar(int r, int contador) {
        boolean bandera = false;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese numero a adivinar");
            int num = leer.nextInt();
            if (num == r) {
                contador = +1;
                System.out.println("Muy bien, adivinaste \nTus intentos fueron " + contador);
                bandera=true;
            } else if (num > r) {
                contador = +1;
                System.out.println("No es correcto, ingresaste un numero mayor");
            } else {
                contador = +1;
                System.out.println("No es correcto, ingresaste un numero menor");
            }
        } while (bandera == false);
    }

}
