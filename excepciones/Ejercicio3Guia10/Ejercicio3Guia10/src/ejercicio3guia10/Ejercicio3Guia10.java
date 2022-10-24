
/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
*/
package ejercicio3guia10;

import java.util.Scanner;



public class Ejercicio3Guia10 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println(" Escribi  dos numeros");
        String numero=leer.next();
        String numero2=leer.next();
        
        try {
            int n=Integer.parseInt(numero);
            int n2=Integer.parseInt(numero2);
            int division=n/n2;
            System.out.println(""+division);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        
    }

}
