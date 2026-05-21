package org.example;

public class MaestroFuego extends MaestroUnElemento
        implements IMaestroFuego {

    public MaestroFuego(String nombre, String nacion, String genero, int edad,boolean estaVivo,int vida, int nivelEnergia,int nivelDeDominio){
             super(nombre,nacion,genero,edad,estaVivo,vida,nivelEnergia,nivelDeDominio);
    }

    @Override
    public void controlFuego() {
        
                nivelEnergia+=25;
    }

    @Override
    public void lanzarBolaFuego() {
        System.out.println(getNombre() +
                " lanza una bola de fuego");
                nivelEnergia-=35;
    }

    @Override
    public void atacar(Personaje enemigo) 
        throws EnergiaInsuficienteException{
        
        if(getNivelEnergia()<10){
            controlFuego();
            throw new EnergiaInsuficienteException();
            
        }else{

        if(getNivelEnergia()<35){
            //System.out.println("No hay suficiente energia para efectuar el ataque");
            controlFuego();
            throw new EnergiaInsuficienteException();
        }else{
        System.out.println(getNombre() +" realiza un ataque de fuego");

        lanzarBolaFuego();
        int dano = 20 + (getNivelDeDominio() * 5);
        System.out.println("El ataque hizo "+ dano + " de daño");
        enemigo.perderVida(dano);
    }
}
    
        }

    @Override
    public String guardar(){
         return "MAESTRO_FUEGO," +
            super.guardar() +
            "," + getNivelDeDominio();
    }
}