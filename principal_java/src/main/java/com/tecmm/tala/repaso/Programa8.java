package com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Christian on 22/02/2018.
 */

public class Programa8 {

    String nom;
    int cantidad;

    Scanner lector = new Scanner(System.in);

    public void Nombre(){

        System.out.println("Dame un Nombre:");
        nom = lector.next();

        System.out.println("Cuantas veces lo imprimiras");
        cantidad = lector.nextInt();

        for(int i = 1; i <= cantidad; i++){
            System.out.println(nom);
        }





    }



}
