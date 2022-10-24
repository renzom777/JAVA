/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio3;

import colecciones.ejercicio3.servicios.AlumnoServicio;

/**
 *
 * @author GustM_000
 */
public class ColeccionesEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio servalum=new AlumnoServicio();
        servalum.crearAlumno();
        System.out.println("El promedio del alumno es "+servalum.notaFinal());
    }
}
