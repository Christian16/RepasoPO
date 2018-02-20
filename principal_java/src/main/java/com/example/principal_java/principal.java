package com.example.principal_java;

import com.example.clases.Carro;
import com.example.clases.Motocicleta;

public class principal {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Es un programa de prueba");
        Carro cnuevo = new Carro("Mazda");
        cnuevo.setColor("Blanco");
        cnuevo.setModelo(2000);
        cnuevo.datosVehiculo();

        System.out.println("---------------------------------------------------");

        Carro cUsado = new Carro("Nissan");
        cUsado.setModelo(1998);
        cUsado.setColor("Gris");
        cUsado.datosVehiculo();
        Carro.color = "tinto";

        System.out.println("----------------------------------------------------");

        cnuevo.datosVehiculo();

        System.out.println("-----------------------------------------------------");

        Motocicleta moto = new Motocicleta("Italika");
        moto.setModelo(3000);
        moto.setCasco(true);
        moto.setCantidad(30);
        moto.datosVehiculo();

        imprimeAutos(cnuevo, moto, cUsado);

        Motocicleta moto2 = new Motocicleta();


    }

    public static void  imprimeAutos(Carro ...c){
        System.out.println("Imprimiendo");
        for(Carro carro : c)
            carro.datosVehiculo();
            System.out.println();
    }

}