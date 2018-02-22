package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Christian on 22/02/2018.
 */

public class Programa10 {

    int num;
    int total;

    Scanner lector = new Scanner (System.in);


    public void Factorial(){

        System.out.println("Ingrese un Numero: ");
        num = lector.nextInt();

        int total = 1;
        for (int i = num; i > 0; i--){
            total = total * i;

        }
        System.out.println("El resultado es:"+ total);


    }

}
