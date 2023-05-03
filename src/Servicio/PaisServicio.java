/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Paises;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashSet<Paises> LlenarHashSet() {

        HashSet<Paises> Pais = new HashSet();
        int opcion;
        do {
            Paises p1 = new Paises();
            System.out.println("Digite un Pais:");
            p1.setNombre(leer.next());
            Pais.add(p1);
            System.out.println("Desea digitar otro pais?: \n"
                    + "1. Si. \n"
                    + "2. No");
            opcion = leer.nextInt();
            if (opcion == 2) {
                System.out.println(Pais);
            }
        } while (opcion == 1);
        return Pais;
    }

    public void Ordenar(HashSet<Paises> p1) {
        TreeSet<Paises> pais = new TreeSet(p1);
        System.out.println(pais);
    }

    public void Eliminar(HashSet<Paises> p1) {
        Iterator<Paises> it = p1.iterator();
        boolean bandera = true;
        System.out.println("Digite un pais que desee borrar de la lista:");
        String nombre = leer.next();

        while (it.hasNext()) {
            if (it.next().getNombre().equals(nombre)) {
                it.remove();
                bandera = false;
            }
        }
        if (bandera == false) {
            System.out.println("El pais se elimino con exito");
        } else {
            System.out.println("El pais digitado no se encuentra en la lista");
        }
        System.out.println("-----------------------------------------\n"
                + "La nueva lista queda asi:");
        for (Paises pais : p1) {
            System.out.println(pais.getNombre());
        }
    }
}
