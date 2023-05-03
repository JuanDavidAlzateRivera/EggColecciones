/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Paises implements Comparable<Paises>{

    private String Nombre;

    //Constructores
    public Paises() {
    }

    public Paises(String Nombre) {
        this.Nombre = Nombre;
    }

    //Getter && Setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.Nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pais:" + Nombre;
    }

    @Override
    public int compareTo(Paises t) {
        return this.getNombre().compareTo(t.getNombre());
        
    }

}
