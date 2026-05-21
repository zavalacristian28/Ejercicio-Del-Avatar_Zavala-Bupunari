package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Combate {

    public static void pelear(
            ArrayList<Personaje> personajes){

        Scanner sc = new Scanner(System.in);

        if(personajes.isEmpty()){

            System.out.println(
                    "No hay personajes creados");

            return;
        }

        System.out.println("Selecciona personaje del 0 al "+(personajes.size()-1) +": ");
        int op=1;
        for(int i = 0; i < personajes.size(); i++){

            System.out.println(i + ". " + personajes.get(i).getNombre());
        }

         op = sc.nextInt();
        while(op<0 || op>personajes.size()){
            System.out.println("Elije un valor dentro del rango");
            op = sc.nextInt();
        }
        Personaje jugador = personajes.get(op);
        Guerrero enemigo =
                new Guerrero(
                        "Zuko Enemigo",
                        "Fuego",
                        "Hombre",
                        18,
                        true,
                        100,50,

                        "Espada"
                );
        int salida=0;
        while((jugador.getVida() > 0 &&
                enemigo.getVida() > 0)){

            System.out.println("----------------");

            System.out.println(jugador.getNombre() +" Vida: " + jugador.getVida());

            System.out.println("Energia: " + jugador.getNivelEnergia());

            System.out.println(enemigo.getNombre() + " Vida: " + enemigo.getVida());
            System.out.println("====================");
            System.out.println("Elije una opcion: ");
            System.out.println("1. Atacar");
            System.out.println("2. Recuperar energia");
            System.out.println("3.- Salir del combate");

            int opc = sc.nextInt();
            while(opc<1 || opc>3){
                System.out.println("Elije una opcion valida: ");
                opc=sc.nextInt();
            }
            try{
/* 
                if(accion == 1){
                    if(jugador instanceof MaestroUnElemento){
                        ((MaestroUnElemento) jugador)
                                .atacar(enemigo);
                    }
                }

                else if(accion == 2){

                    if(jugador instanceof MaestroFuego){

                        ((MaestroFuego) jugador)
                                .controlFuego();
                    }
                }
*/
            switch(opc){
                case 1: 
                    jugador.atacar(enemigo);
                
                break;
                case 2:
                    if(jugador instanceof MaestroAgua){
                        ((MaestroAgua)jugador).controlAgua();
                    }else if(jugador instanceof MaestroFuego){
                        ((MaestroFuego)jugador).controlFuego();

                    }else if(jugador instanceof MaestroAire){
                        ((MaestroAire)jugador).controlAire();

                    }else if(jugador instanceof MaestroTierra){
                        ((MaestroTierra)jugador).controlTierra();
                    }else if(jugador instanceof Guerrero){
                        ((Guerrero)jugador).cargarEnergia();
                    }
                break;
                case 3:
                    System.out.println("Saliendo del combate");
                    return;
            }
            }catch(EnergiaInsuficienteException e){

                System.out.println(
                        e.getMessage());
            }

            if(enemigo.getVida() > 0){

                System.out.println(
                        "El enemigo contraataca");
                        jugador.perderVida(20);;
            }
        }

        if(jugador.getVida() > 0 && enemigo.getVida()<=0){

            System.out.println(jugador.getNombre() + " ha ganado");
            return;
        }

        else if(jugador.getVida()==0 && enemigo.getVida()>=1){

            System.out.println(enemigo.getNombre() +" ha ganado");
            return;
        }
    }
}