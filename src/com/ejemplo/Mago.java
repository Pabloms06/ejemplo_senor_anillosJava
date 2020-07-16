package com.ejemplo;

public class Mago extends Personaje {

    Mago(String nombre, int altrua){
        super(nombre, Mago.class.getSimpleName(), altrua);
    }


    @Override
    protected int getTamanoPaso() {
        return 50;
    }
}
