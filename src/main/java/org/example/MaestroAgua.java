package org.example;

public class MaestroAgua extends MaestroUnElemento implements IMaestroAgua {

    public MaestroAgua(String nombre, String nacion, String genero, int edad,boolean estaVivo,int vida, int nivelEnergia,int nivelDeDominio){
             super(nombre,nacion,genero,edad,estaVivo,vida,nivelEnergia,nivelDeDominio);
    }

    @Override
    public void controlAgua() {
        
                nivelEnergia+=25;
    }

    @Override
    public void lanzarBolaAgua() {
        System.out.println(getNombre() + " lanza una bola de agua");
                nivelEnergia-=35;
    }

    @Override
    public void atacar(Personaje enemigo) 
        throws EnergiaInsuficienteException{
        
        if(getNivelEnergia()<10){
            controlAgua();
            throw new EnergiaInsuficienteException();
            
        }else{

        if(getNivelEnergia()<35){
            controlAgua();
            throw new EnergiaInsuficienteException();
            //System.out.println("No hay suficiente energia para efectuar el ataque");
            
        }else{
        System.out.println(getNombre() + " realiza un ataque de agua");
        lanzarBolaAgua();
        int dano = 20 + (getNivelDeDominio() * 5);
        System.out.println("El ataque hizo " + dano + " de daño");
        enemigo.perderVida(dano);
    }
}
    
        }
    @Override
    public String guardar(){
         return "MAESTRO_AGUA," +
            super.guardar() +
            "," + getNivelDeDominio();
    }
}
