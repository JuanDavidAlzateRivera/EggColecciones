/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in);

    //Instancia de Objeto Lista tipo Alumno
    public ArrayList<Alumno> CrearAlumno() {

        //Instancia de Objeto Lista tipo alumno
        ArrayList<Alumno> Estudiante1 = new ArrayList();
        int opcion;
        do {
            Alumno e1 = new Alumno();
            System.out.println("Digite el nombre del Alumno:");
            e1.setNombre(leer.next());
            System.out.println("Digite la nota 1 del Alumno:");
            e1.setNota1(leer.nextInt());
            System.out.println("Digite la nota 2 del Alumno");
            e1.setNota2(leer.nextInt());
            System.out.println("Digite la nota 3 del Alumno");
            e1.setNota3(leer.nextInt());
            System.out.println("------------------------------------------------");
            System.out.println("Desea Agregar mas Alumnos a la Lista? : \n"
                    + "1. Si \n"
                    + "2. No");
            opcion = leer.nextInt();
            Estudiante1.add(e1);
        } while (opcion == 1);
        return Estudiante1;
    }

    public void NotaFinal(ArrayList<Alumno> e1) {
        for (Alumno alumno : e1) {
            double promedio = (alumno.getNota1()+alumno.getNota2()+alumno.getNota3())/3;
            System.out.println("El alumno" + alumno.getNombre() + "tiene un promedio de:" + promedio);
        }
    }
}
