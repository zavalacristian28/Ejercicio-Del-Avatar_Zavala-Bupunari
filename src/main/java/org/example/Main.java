package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int op=0;
        Scanner sc= new Scanner(System.in);
        ArrayList<Personaje> personajes= new ArrayList<>();
        Personaje persona;
    do{
            System.out.println("================================");
            System.out.println("Avatar la leyenda de Aang");
            System.out.println("");
            System.out.println("Ingresa que opcion quieres elegir: ");
            System.out.println("1.- Crear personaje");
            System.out.println("2.- Pelear");
            System.out.println("3.- Guardar personajes creados");
            System.out.println("4.- Cargar datos");
            System.out.println("5.- Salir del programa");

            op=sc.nextInt();;
            while(op<1 || op>5){
                System.out.println("Ingresa una opcion valida: ");
                op= sc.nextInt();
            }
            switch(op){
                case 1:
                    persona=CrearPersonaje.crearPersonaje();
                    personajes.add(persona);
                break;
                case 2:
                    Combate.pelear(personajes);
                    break;
                case 3:
                    ArchivoPersonajes.guardarPersonajesEnArchivoTXT(personajes);
                    break;
                case 4:
                    personajes.clear();
                    ArchivoPersonajes.cargarArchivo(personajes);
                    break;
            }

        }while(op!=5);
    }
}