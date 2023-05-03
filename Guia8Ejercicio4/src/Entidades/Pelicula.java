/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class Pelicula {

    String título;
    String director;
    Double duración;

    //Constructores
    public Pelicula() {
    }

    public Pelicula(String título, String director, Double duración) {
        this.título = título;
        this.director = director;
        this.duración = duración;
    }

    //Getter && Setter
    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuración() {
        return duración;
    }

    public void setDuración(Double duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Pelicula:" + "t\u00edtulo:" + título + ", director:" + director + ", duraci\u00f3n:" + duración + "\n";
    }

    public static Comparator<Pelicula> OrdenarDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuración().compareTo(t1.getDuración());
        }
    };

    public static Comparator<Pelicula> OrdenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

     public static Comparator<Pelicula> OrdenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTítulo().compareTo(t1.getTítulo());
        }
    };

}
