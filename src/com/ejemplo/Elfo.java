package com.ejemplo;

public class Elfo extends Personaje {

    Elfo(String nombre, int altrua){
        super(nombre, Elfo.class.getSimpleName(), altrua);
    }


    @Override
    protected int getTamanoPaso() {
        return 50;
    }

}
