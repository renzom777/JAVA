

package Entidades;

import java.util.Scanner;

/**
 *
 * 
 */
public class Barco {
    //su matrícula, su eslora en metros y año de fabricación. 
    protected int matricula, eslora, añofab;
     protected Scanner leer= new Scanner (System.in).useDelimiter("\n");

    public Barco() {
    }

    public Barco(int matricula, int eslora, int añofab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añofab = añofab;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñofab() {
        return añofab;
    }

    public void setAñofab(int añofab) {
        this.añofab = añofab;
    }
    
    
    public int modulo(){
        return eslora*10;
    }
    
    public void crearBarco(){
       
        System.out.println("\n----------CREAR BARCO----------"); 
        System.out.print("Ingrese la matrícula de su barco: ");
        matricula=leer.nextInt();
        System.out.print("Ingrese el tamaño de la eslora en metros: ");
        eslora=leer.nextInt();
        System.out.print("Ingrese el año de fabricación de su barco: ");
        añofab=leer.nextInt();
    }
}
