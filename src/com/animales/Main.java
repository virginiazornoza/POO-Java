package com.animales;

/**
 * descripción
 * @author
 * @version
 */
public class Main {

    public static void main(String[] args){

        Perro lomito = new Perro("Mike","mestiza",4,"chico");
        /*lomito.nombre="Mike";
        lomito.raza="mestiza";
        lomito.edad=4;
        lomito.tamanio="chico";*/
        lomito.caracteristicas();
        lomito.comer();
        cambiarNombre("Toby");

        Perro lomito2 = new Perro("Quesadillo","Corgi",2,"Mediano");
        /*lomito2.nombre="Quesadillo";
        lomito2.raza="Corgi";
        lomito2.edad=2;
        lomito2.tamanio="mediano";*/
        lomito2.caracteristicas();
        lomito2.dormir();

        Perro lomito3 = new Perro("Milaneso","Husky",3,"Grande");
        lomito3.caracteristicas();;
        lomito3.jugar();

        Perro lomito4 = new Perro("Sr. Kawamura", "Alaska malamute",7,"Gigante");
        lomito3.caracteristicas();;
        lomito3.dormir();
    }

    private static void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

}
