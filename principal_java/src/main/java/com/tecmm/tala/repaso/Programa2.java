package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Christian on 22/02/2018.
 */

public class Programa2 {

    double iva;
    double cantidad;

    Scanner lector = new Scanner (System.in);

    public void Calculaiva(){

        System.out.println("Ingrese Cantidad");
        cantidad = lector.nextDouble();

        iva = (cantidad*.16)+cantidad;
        System.out.println("El precio con iva es: " + iva);

    }


}
