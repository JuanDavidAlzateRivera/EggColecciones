/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Alumno {

    private String Nombre;
    private double Nota1;
    private double Nota2;
    private double Nota3;

//Constructores
    public Alumno() {
    }

    public Alumno(String Nombre, double Nota1, double Nota2, double Nota3) {
        this.Nombre = Nombre;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }

    //Getter && Stter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Nota1=" + Nota1 + ", Nota2=" + Nota2 + ", Nota3=" + Nota3 + '}';
    }

}
