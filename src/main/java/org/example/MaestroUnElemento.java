package org.example;

public abstract class MaestroUnElemento extends Personaje {

    private int nivelDeDominio;
    //metodo para atacar
    public abstract void atacar(Personaje enemigo)
    throws EnergiaInsuficienteException;

    public MaestroUnElemento(){
        super();
        nivelDeDominio=1;
    }

    public MaestroUnElemento(String nombre, String nacion, String genero, int edad,boolean estaVivo,int vida, int nivelEnergia,int nivelDeDominio){
        super(nombre,nacion,genero,edad,estaVivo,vida,nivelEnergia);
        this.nivelDeDominio=nivelDeDominio;
    }
    public void incrementaNivelDominio(){
        if(nivelDeDominio<10){
            nivelDeDominio++;
        }
    }

    public int getNivelDeDominio(){
        return nivelDeDominio;
    }
}
