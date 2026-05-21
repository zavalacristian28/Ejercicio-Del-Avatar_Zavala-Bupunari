package org.example;

public class MaestroTierra extends MaestroUnElemento implements IMaestroTierra{
     public MaestroTierra(String nombre, String nacion, String genero, int edad,boolean estaVivo,int vida, int nivelEnergia,int nivelDeDominio){
             super(nombre,nacion,genero,edad,estaVivo,vida,nivelEnergia,nivelDeDominio);
    }

    @Override
    public void controlTierra() {
                nivelEnergia+=25;
    }

    @Override
    public void terremoto() {
        System.out.println(getNombre() +
                " creo un terremoto");
                nivelEnergia-=50;
    }

    @Override
    public void atacar(Personaje enemigo) 
        throws EnergiaInsuficienteException{
        
        if(getNivelEnergia()<10){
            controlTierra();
            throw new EnergiaInsuficienteException();
            
        }else{

        if(getNivelEnergia()<50){
            //System.out.println("No hay energia suficiente para efectuar el ataque");
            controlTierra();
            throw new EnergiaInsuficienteException();
        }else{
        terremoto();
        System.out.println(getNombre() + " realiza un ataque de tierra");
        int dano = 20 + (getNivelDeDominio() * 5);
        System.out.println("El ataque hizo " + dano + " de daño");
        enemigo.perderVida(dano);
        }
    }
    
        }
    @Override
    public String guardar(){
         return "MAESTRO_TIERRA," +
            super.guardar() +
            "," + getNivelDeDominio();
    }  
}
