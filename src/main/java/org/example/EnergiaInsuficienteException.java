package org.example;

public class EnergiaInsuficienteException extends Exception {
    public EnergiaInsuficienteException(){
        super("Energia insuficiente, el maestro necesita descansar");
    }
}
