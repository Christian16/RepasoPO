package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Christian on 22/02/2018.
 */

public class Programa1 {

    double altura;
    double base;
    double area;
    Scanner lector = new Scanner(System.in);

    public void calculaArea() {
        System.out.println("Ingrese la base");
            base = lector.nextDouble();
        System.out.println("Ingrese la Altura");
            altura = lector.nextDouble();

            area = (base*altura)/2;
        System.out.println("El area es: " + area);
    }


}
