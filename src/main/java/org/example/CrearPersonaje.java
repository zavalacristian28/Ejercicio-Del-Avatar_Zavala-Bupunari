package org.example;

import java.util.Scanner;

public class CrearPersonaje {

    public static Personaje crearPersonaje(){

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("CREACION DE PERSONAJE");
        System.out.println("================================");

        System.out.println("Ingresa el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingresa la nacion:");
        String nacion = sc.nextLine();

        System.out.println("Ingresa el genero:");
        String genero = sc.nextLine();

        System.out.println("Ingresa la edad:");
        int edad = sc.nextInt();

        System.out.println("\nSelecciona el tipo:");
        System.out.println("1. Guerrero");
        System.out.println("2. Maestro Agua");
        System.out.println("3. Maestro Fuego");
        System.out.println("4. Maestro Aire");
        System.out.println("5. Maestro Tierra");

        int op = sc.nextInt();

        switch(op){

            case 1:

                sc.nextLine();

                System.out.println("Ingresa el arma:");
                String arma = sc.nextLine();

                return new Guerrero(nombre,nacion,genero,edad,true,100,50,arma);

            case 2:

                return new MaestroAgua(nombre,nacion,genero,edad,true,100,50,1);

            case 3:

                return new MaestroFuego(nombre,nacion,genero,edad,true,100,50,1);

            case 4:

                return new MaestroAire(nombre,nacion,genero,edad,true,100,50,1);

            case 5:

                return new MaestroTierra(nombre,nacion,genero,edad,true,100,50,1);

            default:
                System.out.println("Opcion invalida");
                return null;
        }
    }
}