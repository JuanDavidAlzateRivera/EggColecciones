/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Pelicula;
import static Entidades.Pelicula.OrdenarDirector;
import static Entidades.Pelicula.OrdenarDuracion;
import static Entidades.Pelicula.OrdenarTitulo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> Peliculas = new ArrayList();
    String respuesta = "";

    private Pelicula CrearPelicula() {
        Pelicula p1 = new Pelicula();
        System.out.println("Digite titulo de la pelicula:");
        p1.setTítulo(leer.next());
        System.out.println("Digite el nombre del director:");
        p1.setDirector(leer.next());
        System.out.println("Digite la duracion de la pelicula:");
        p1.setDuración(leer.nextDouble());
        return p1;
    }

    public ArrayList<Pelicula> CrearLista() {

        do {
            Pelicula p1 = CrearPelicula();
            Peliculas.add(p1);
            do {
                System.out.println("Desea Ingresar una nueva pelicula?: s/n");
                respuesta = leer.next().toLowerCase();
            } while (si_no(respuesta));
        } while (respuesta.equalsIgnoreCase("S"));
        return Peliculas;
    }

    private boolean si_no(String respuesta) {
        boolean sino;
        if (!respuesta.matches("[SsNn]")) {
            System.out.println("respuesta incorrecta");
            sino = true;
        } else {
            sino = false;
        }
        return sino;
    }

    public void MostrarPeliculas(ArrayList<Pelicula> Pelicula) {
        for (Pelicula p1 : Pelicula) {
            System.out.println(p1.toString());
        }
        System.out.println("--------------------------------------------");
    }

    public void MostrarMayor(ArrayList<Pelicula> Pelicula) {
        for (Pelicula p1 : Pelicula) {
            if (p1.getDuración() > 1) {

                System.out.println(p1.toString());
            }
        }
        System.out.println("-----------------------------------------------");
    }

    public void OrdenarMayorMenor(ArrayList<Pelicula> Pelicula) {
        Pelicula.sort(OrdenarDuracion.reversed());
        System.out.println("El orden de las peliculas de Mayor a Menor seria asi:");
        System.out.println(Pelicula);
        System.out.println("-------------------------------------------------");
    }

    public void OrdenarMenorMayor(ArrayList<Pelicula> Pelicula) {
        Pelicula.sort(OrdenarDuracion);
        System.out.println("El orden de las peliculas de Menor a Mayor seria asi:");
        System.out.println(Pelicula);
        System.out.println("----------------------------------------------------");
    }

    public void OrdenarDirector(ArrayList<Pelicula> Pelicula) {
        Pelicula.sort(OrdenarDirector);
        System.out.println("El orden de las peliculas alfabeticamente por director seria asi:");
        System.out.println(Pelicula);
        System.out.println("----------------------------------------------------");
    }
     public void OrdenarTitulo(ArrayList<Pelicula> Pelicula) {
        Pelicula.sort(OrdenarTitulo);
        System.out.println("El orden de las peliculas alfabeticamente por titulo seria asi:");
        System.out.println(Pelicula);
        System.out.println("----------------------------------------------------");
    }
}
