package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Christian on 22/02/2018.
 */

public class Programa6 {



    public void Pares(){
        Scanner lector = new Scanner(System.in);
        int num=0;
        System.out.println("Ingrese un Numero");
        num = lector.nextInt();

        if (num % 2 == 0){
            System.out.println("El Numero es Par");
        }

        if (num % 2 == 1){
            System.out.println("El numero es Impar");
        }

    }

}
