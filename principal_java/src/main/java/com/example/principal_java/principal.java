package com.example.principal_java;

import com.example.clases.Carro;
import com.example.clases.Motocicleta;
import com.tecmm.tala.repaso.Programa1;
import com.tecmm.tala.repaso.Programa10;
import com.tecmm.tala.repaso.Programa2;
import com.tecmm.tala.repaso.Programa3;
import com.tecmm.tala.repaso.Programa4;
import com.tecmm.tala.repaso.Programa5;
import com.tecmm.tala.repaso.Programa6;
import com.tecmm.tala.repaso.Programa7;
import com.tecmm.tala.repaso.Programa8;
import com.tecmm.tala.repaso.Programa9;

import java.util.Scanner;


public class principal {



    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        /*System.out.println("Hola Mundo");
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

        Motocicleta moto2 = new Motocicleta();*/



        System.out.println("Elige un programa.");

        System.out.println("1. Area.");
        System.out.println("2. Calculador de IVA.");
        System.out.println("3. Calculador de Grados.");
        System.out.println("4. Reloj.");
        System.out.println("5. Multiplicador");
        System.out.println("6. Pares e Impares.");
        System.out.println("7. Numeros Romanos.");
        System.out.println("8. Repetir el Nombre.");
        System.out.println("9. Contar hasta 500.");
        System.out.println("10. Factorial");

        System.out.println("Elige una opcion");
        int menu = lector.nextInt();
        switch (menu){
            case 1:  Programa1 area = new Programa1();
                area.calculaArea();
                break;

            case 2: Programa2 iva = new Programa2();
                iva.Calculaiva();
                break;

            case 3: Programa3 centigrados = new Programa3();
                centigrados.Calculagrados();
                break;

            case 4: Programa4 hora = new Programa4();
                hora.Horario();
                break;

            case 5: Programa5 sum = new Programa5();
                sum.Suma();
                break;

            case 6: Programa6 par = new Programa6();
                par.Pares();
                break;

            case 7: Programa7 roma = new Programa7();
                roma.Romanos();
                break;

            case 8: Programa8 nom = new Programa8();
                nom.Nombre();
                break;

            case 9: Programa9 cuen = new Programa9();
                cuen.Cuenta();
                break;

            case 10: Programa10 fac = new Programa10();
                fac.Factorial();
                break;

            case 11:
                break;
        }





    }


    }




    /*public static void  imprimeAutos(Carro ...c){
        System.out.println("Imprimiendo");
        for(Carro carro : c)
            carro.datosVehiculo();
            System.out.println();
    }*/


