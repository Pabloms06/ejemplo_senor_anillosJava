package com.ejemplo;

public abstract class Personaje {

    String nombre;
    String nombreRaza;
    int altura;
    int posicion;

    public Personaje(String nombre, String nombreraza, int altrua) {
        this.nombre = nombre;
        this.nombreRaza = nombreraza;
        this.altura = altrua;
    }

    void mostrarDetallesPorPantalla(){
        System.out.println("****" + nombre + "****");
        System.out.println("Soy " + nombreRaza);
        System.out.println("Mido " + altura);
        mostrarPosicion();
    }

    void darPaso() {
        posicion = posicion + getTamanoPaso();
    }

    void mostrarPosicion() {
        System.out.println("Estoy en la posicion " + posicion);
    }

    abstract protected int getTamanoPaso();

}
