package com.example.clases;

/**
 * Created by Christian on 20/02/2018.
 */

public class Motocicleta extends Carro {

    boolean casco;
    int cantidad;

    public Motocicleta () {
        super("Generica");
    }

    public Motocicleta (String nombre) {
        super(nombre);
    }

    @Override
    public void datosVehiculo() {
        super.datosVehiculo();
        System.out.println("Casco: " + " " + isCasco() + "Gas: " + " " + getCantidad());
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
