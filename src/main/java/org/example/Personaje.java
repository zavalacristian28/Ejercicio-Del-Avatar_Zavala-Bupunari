package org.example;


public abstract class Personaje {

    protected String nombre;
    protected String nacion;
    protected String genero;
    protected int edad;
    protected boolean estaVivo;
    protected int vida;
    protected int nivelEnergia;

    public Personaje(String nombre, String nacion, String genero, int edad, boolean estaVivo,int vida, int nivelEnergia){
        this.nombre=nombre;
        this.nacion=nacion;
        this.genero=genero;
        this.edad=edad;
        this.estaVivo=estaVivo;
        this.vida=vida;
        this.nivelEnergia=nivelEnergia;
    }

    public Personaje(){

    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNacion(){
        return nacion;
    }
    public void setNacion(String nacion){
        this.nacion=nacion;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public boolean isEstaVivo(){
        return estaVivo;
    }
    public void setEstaVivo(boolean estaVivo){
        this.estaVivo=estaVivo;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida=vida;
    }
    public int getNivelEnergia(){
        return nivelEnergia;
    }
    public void setNivelEnergia(int nivelEnergia){
        this.nivelEnergia=nivelEnergia;
    }

    
public String guardar() {
    return nombre + "," +
            nacion + "," +
            genero + "," +
            edad + "," +
            estaVivo + "," +
            vida + "," +
            nivelEnergia;
}

@Override
public String toString() {
    return nombre + "," +
            nacion + "," +
            genero + "," +
            edad + "," +
            estaVivo + "," +
            vida + "," +
            nivelEnergia;
}

    public void perderVida(int dolor){
    vida -= dolor;

    if(vida <= 0){
        vida = 0;
        estaVivo = false;
    }
}
    public abstract void atacar(Personaje enemigo)
        throws EnergiaInsuficienteException;
}