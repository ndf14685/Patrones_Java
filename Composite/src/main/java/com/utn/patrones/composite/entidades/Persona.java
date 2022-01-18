package com.utn.patrones.composite.entidades;

public class Persona implements IPersonal {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public void getDatosPersonal() {
        String msg = "Me llamo " + nombre;
        msg = msg + ", tengo " + edad + " anios";
        System.out.println(msg);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
