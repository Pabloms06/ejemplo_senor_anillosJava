package com.ejemplo;

public class Humano extends Personaje {

    Humano(String nombre, int altrua){
        super(nombre, Humano.class.getSimpleName(), altrua);
    }


    @Override
    protected int getTamanoPaso() {
        return 50;
    }
}
