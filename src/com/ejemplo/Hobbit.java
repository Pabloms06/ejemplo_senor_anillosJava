package com.ejemplo;

public class Hobbit extends Personaje{

    Hobbit(String nombre, int altrua) throws Exception {
        super(nombre, Hobbit.class.getSimpleName(), altrua);
        if (altrua > 160) {
            throw new Exception("Eso es no es un Hobbit...");
        }
    }

    @Override
    protected int getTamanoPaso() {
        return 25;
    }

}
