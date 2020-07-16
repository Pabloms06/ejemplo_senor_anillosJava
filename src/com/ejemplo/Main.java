package com.ejemplo;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Personaje> comunidadAnillo = new ArrayList<>();

        comunidadAnillo.add(crearGandalf());
        comunidadAnillo.add(crearAragorn());
        comunidadAnillo.add(crearLegolas());

        try {
            comunidadAnillo.add(crearFrodo());
            comunidadAnillo.add(crearSam());
        } catch (Exception e) {
            System.out.println("Has hecho trampas creando los Hobbits.");
        }

        for (Personaje personaje : comunidadAnillo) {
            personaje.mostrarDetallesPorPantalla();
        }

        for (Personaje personaje : comunidadAnillo) {
            personaje.darPaso();
        }

        for (Personaje personaje : comunidadAnillo) {
            personaje.mostrarDetallesPorPantalla();
        }

    }

    private static Elfo crearLegolas() {
        return new Elfo("Legolas", 179);
    }

    private static Humano crearAragorn() {
        return new Humano("Aragorn, hijo de Arathorn, heredero de Isildur, señor de los Dunedain, heredero del trono de Gondor, apodado Trancos, Capitán de los Montaraces del norte", 185);
    }

    private static Hobbit crearFrodo() throws Exception {
        return new Hobbit("Frodo", 140);
    }

    private static Hobbit crearSam() throws Exception {
        return new Hobbit("Sam", 180);
    }

    static Mago crearGandalf(){
        return new Mago("Gandalf", 180);
    }

}
