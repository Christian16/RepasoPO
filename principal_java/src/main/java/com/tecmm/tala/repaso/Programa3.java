package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Christian on 22/02/2018.
 */

public class Programa3 {

    double f;
    double k;
    double c;
    double totalf;
    double totalk;

    Scanner lector = new Scanner(System.in);

    public void Calculagrados(){

        System.out.println("Ingresa Grados Centigrados");
        c = lector.nextDouble();

        totalk = (c+273);
        System.out.println("Equivale a: "+ totalk + "Grados Kelvin.");

        totalf = ((c*1.8)+32);
        System.out.println("Equivale a: "+ totalf+ "Grados Fahrenheit.");


    }
}
