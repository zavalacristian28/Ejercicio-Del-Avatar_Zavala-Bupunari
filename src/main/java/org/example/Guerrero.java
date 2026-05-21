package org.example;

public class Guerrero extends Personaje{
    private String arma;
    public Guerrero(){
        super();
        arma="pistola";
    }

    public Guerrero(String nombre, String nacion, String genero, int edad,boolean estaVivo,int vida, int nivelEnergia,String arma){
        super(nombre,nacion,genero,edad,estaVivo,vida,nivelEnergia);
        this.arma=arma;    
    }
    public String getArma(){
        return arma;
    }
    public void setArma(String arma){
        this.arma=arma;
    }
    @Override
    public String guardar(){
        return "GUERRERO,"
        + super.guardar()
        +"," + arma;
    }

    @Override
    public void atacar(Personaje enemigo)
    throws EnergiaInsuficienteException{
    if(nivelEnergia<10){
        cargarEnergia();
        throw new EnergiaInsuficienteException();
    }
    enemigo.perderVida(35);
    nivelEnergia-=10;

    System.out.println(getNombre() + " golpea con "+ arma);
}

    public void cargarEnergia(){
        nivelEnergia+=20;
        System.out.println("El guerrero se sento a descansar");
    }
}
