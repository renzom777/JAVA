/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejercicio3.servicios;

import colecciones.ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GustM_000
 */
public class AlumnoServicio {
    
    private ArrayList<Alumno> alumnos;

    public AlumnoServicio() {
        this.alumnos = new ArrayList<>();
    }

    public void crearAlumno(){
        Scanner leer = new Scanner(System.in);
        do {            
            System.out.println("Ingresar nombre del alumno");
            String nombre=leer.next();
            System.out.println("Ingresar las tres notas");
            Integer[] notas=new Integer[3];
            for (int i = 0; i < notas.length; i++) {
                notas[i]=leer.nextInt();
            }
            ArrayList<Integer> lista=new ArrayList(Arrays.asList(notas));
            Alumno alum=new Alumno(nombre, lista);
            alumnos.add(alum);
            System.out.println("¿Desea ingresar otro alumno?");
//            lista.add(leer.nextInt(), leer.nextInt(), leer.nextInt());
        } while ("s".equals(leer.next().toLowerCase()));
    }
    
    public double notaFinal(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String nombre=leer.next();
        double promedio=0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alum=alumnos.get(i);
            if (nombre.equals(alum.getNombre())) {
                int suma=0;
                ArrayList<Integer> notas=alum.getNotas();
                for (int j = 0; j < notas.size(); j++) {
                    suma=suma+notas.get(j);
                }
                promedio=suma/notas.size();
            }
        }
        return promedio;
    }
}
