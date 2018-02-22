package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Christian on 22/02/2018.
 */

public class Programa7 {

    int num;

    Scanner lector = new Scanner(System.in);

    public void Romanos(){
        System.out.println("Ingrese un Numero");

        num = lector.nextInt();

        if (num == 1){
            System.out.println("El numero romano es: I");
        }

        if (num == 2){
            System.out.println("El numero romano es: II");
        }

        if (num == 3){
            System.out.println("El numero romano es: III");
        }

        if (num == 4){
            System.out.println("El numero romano es: IV");
        }

        if (num == 5){
            System.out.println("El numero romano es: V");
        }

        if (num == 6){
            System.out.println("El numero romano es: VI");
        }

        if (num == 7){
            System.out.println("El numero romano es: VII");
        }

        if (num >= 8){
            System.out.println("Error en la solicitud...");
        }

    }

}
