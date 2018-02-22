package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Christian on 22/02/2018.
 */

public class Programa4 {

    int h;

    Scanner lector = new Scanner(System.in);

    public void Horario(){

        System.out.println("Ingresa la Hora: ");
        h = lector.nextInt();

        if (h <= 12){
            System.out.println("Son las: " +h+ "AM.");

        }
        if (h >=13 && h <=24){
            System.out.println("Son las: " +(h-12));
        }
        if (h >24){
            System.out.println("Verifique su Horario.");
        }

    }

}
