package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Christian on 22/02/2018.
 */

public class Programa5 {

    int num;

    Scanner lector = new Scanner (System.in);

    public void Suma(){

        System.out.println("Ingresa un numero");
        num= lector.nextInt();

        if (num <= 50) {
            System.out.println("Es Igual a: " + (num * 2));
        }

        if (num >= 51){
            System.out.println("Es igual a: " + (num*3));
        }
    }

}
