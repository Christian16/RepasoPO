package com.example.clases;

/**
 * Created by Christian on 19/02/2018.
 */

public class Carro {

    int m;
    public static String color;
    public String nombre;

    public Carro(String nombre){

        this.nombre = nombre;

    }

    public void datosVehiculo() {
        int y=90;
        System.out.println(m + " " + color + " " + nombre);
        System.out.println("Corre a: " + y + "km ");
    }

    public void setModelo(int modelo)
    {
        this.m = modelo;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

}
