

package Entidades;

import java.util.Scanner;

/**
 *
 * 
 */
public class Televisor extends Electrodomesticos{
    private int resol;
    private boolean tdt;//sintonizador

    public Televisor() {
    }

    public Televisor(int resol, boolean tdt, int precio, int peso, String color, String consumo) {
        super(precio, peso, color, consumo);
        this.resol = resol;
        this.tdt = tdt;
    }

    public int getResol() {
        return resol;
    }

    public void setResol(int resol) {
        this.resol = resol;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.print("Ingrese la resolución en pulgadas: ");
        resol=leer.nextInt();
        System.out.println("Ingrese true si tiene sintonizador, sino false");
        tdt=leer.nextBoolean();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resol>40) {
            precio=precio+(int)(precio*0.3);
        }
        if (tdt == true) {
           precio+=500;
        }
        System.out.println("PRECIO FINAL TELEVISOR: "+ precio);
    }
    
    
}
