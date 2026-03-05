package com.animales;

public class Perro {

    //Propiedades y atributos de la clase
    private String nombre;
    String raza;
    int edad;
    String tamanio;

    //Esto es el constructor
    public Perro() {
    }


    /**
     * Descripción
     * @param nombre
     * @param raza
     * @param edad
     * @param tamanio
     *
     */
    public Perro (String nombre, String raza, int edad, String tamanio){
        this.setNombre(nombre);
        this.raza=raza;
        this.edad=edad;
        this.tamanio=tamanio;
    }

    //métodos de la clase

    public void caracteristicas(){
        System.out.println("Hola, mi nombre es: "+ this.getNombre() +
                ", soy de raza "+this.raza+" tengo "+this.edad+
                " años y soy de tamaño "+this.tamanio);
    }
    public void comer(){
        System.out.println(this.getNombre() +" está comiendo");
    }
    public void dormir(){
        System.out.println(this.getNombre() +" está durmiendo");
    }
    public void jugar(){
        System.out.println(this.getNombre() +" está jugando con la pelota");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
