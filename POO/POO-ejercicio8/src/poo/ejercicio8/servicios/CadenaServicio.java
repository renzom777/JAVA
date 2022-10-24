/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio8.servicios;
import java.util.Scanner;
import poo.ejercicio8.entidades.Cadena;

/**
 *
 * @author GustM_000
 */
public class CadenaServicio {
    
    Cadena cad=new Cadena();
    
    public Cadena crearCadena(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena cad1= new Cadena("",0);
        System.out.println("Ingrese frase");
        cad1.setFrase(leer.next());
        cad1.setLongitud(cad1.getFrase().length());
        return cad1;
    }
    
    public void mostrarVocales(Cadena cad){
        int i=0;
        for (int j = 0; j < cad.getLongitud(); j++) {
            if (cad.getFrase().substring(j,j+1).equals("a")||cad.getFrase().substring(j,j+1).equals("e")||cad.getFrase().substring(j,j+1).equals("i")||cad.getFrase().substring(j,j+1).equals("o")||cad.getFrase().substring(j,j+1).equals("u")){
                i++;
            }
        }
        System.out.println("En la frase hay "+i+" vocales");
    }
    
    public String invertirFrase(Cadena cad){
        String inv="";
        for (int i = cad.getLongitud()-1; i >= 0; i--) {
            inv=inv + cad.getFrase().charAt(i);
        }
        return inv;
    }
    
    public int vecesRepetido(Cadena cad, String caract){
        int i=0;
        for (int j = 0; j < cad.getLongitud(); j++) {
            if (cad.getFrase().substring(j, j+1).equals(caract)) {
                i++;
            }
        }
        return i;
    }
    
    public void compararLongitud(Cadena cad){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena cad1=crearCadena();
        if (cad.getLongitud()>cad1.getLongitud()) {
            System.out.println("La longitud es menor");
        } else if (cad.getLongitud()<cad1.getLongitud()) {
            System.out.println("La longitud es menor");
        } else {
            System.out.println("Las longitudes son iguales");
        }
    }
    
    public void unirFrases(Cadena cad){
        Cadena cad1=crearCadena();
        System.out.println("La frase resultante de la union es "+cad.getFrase().concat(" "+cad1.getFrase()));
    }
    
    public void reemplazar(Cadena cad){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter que reemplazará a la letra 'a'");
        String caracter=leer.next();
        System.out.println("La frase ahora queda asi:");
        System.out.println(cad.getFrase().replace("a", caracter));
    }
    
    public void contiene(Cadena cad){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese caracter a buscar");
        String caracter=leer.next();
        if (cad.getFrase().contains(caracter)) {
            System.out.println("El caracter ingresado se encuentra en la frase");
        } else {
            System.out.println("El caracter ingresado no se encuentra en la frase");
        }
    }
}
