package org.example;

public class MaestroAire extends MaestroUnElemento implements IMaestroAire {

     public MaestroAire(String nombre, String nacion, String genero, int edad,boolean estaVivo,int vida, int nivelEnergia,int nivelDeDominio){
             super(nombre,nacion,genero,edad,estaVivo,vida,nivelEnergia,nivelDeDominio);
    }

    @Override
    public void controlAire() {
        
                nivelEnergia+=25;
    }

    @Override
    public void rafagaAire() {
        System.out.println(getNombre() + " lanza una rafaga de aire");
                nivelEnergia-=35;
    }

    @Override
    public void atacar(Personaje enemigo) 
        throws EnergiaInsuficienteException{
        
        if(getNivelEnergia()<10){
            controlAire();
            throw new EnergiaInsuficienteException();
            
        }else{

        if(getNivelEnergia()<35){
            //System.out.println("No hay suficiente energia para efectuar el ataque");
            controlAire();
            throw new EnergiaInsuficienteException();
        }else{
        System.out.println(getNombre() +" realiza un ataque de aire");
        rafagaAire();
        int dano = 20 + (getNivelDeDominio() * 5);
        System.out.println("El ataque hizo " + dano + " de daño");
        enemigo.perderVida(dano);
    }
}
    
        }
    @Override
    public String guardar(){
         return "MAESTRO_AIRE," +
            super.guardar() +
            "," + getNivelDeDominio();
    }
}
