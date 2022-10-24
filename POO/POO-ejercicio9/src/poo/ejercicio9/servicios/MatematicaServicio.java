/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio9.servicios;

import static java.lang.Math.abs;
import poo.ejercicio9.entidades.Matematica;

/**
 *
 * @author GustM_000
 */
public class MatematicaServicio {
    
    Matematica mat=new Matematica();
    
    public double devolverMayor(Matematica mat){
        return Math.max(mat.getNum1(), mat.getNum2());
    }
    
    public double calcularPotencia(Matematica mat){
        return Math.pow(Math.round(Math.max(mat.getNum1(), mat.getNum2())), Math.round(Math.min(mat.getNum1(), mat.getNum2())));
    }
    
    public double calcularRaiz(Matematica mat){
        return Math.sqrt(abs(Math.min(mat.getNum1(), mat.getNum2())));
    }
}
