package com.utn.patrones.actores;

public abstract class Persona {

    private String nombre;
    private String dni;
    
    /*
     * Define el esqueleto del algoritmo y luego las subclases deben 
     * implementar los metodos: getIdentificacion() y getTipoId()
     */
    public String identificate() {
        String frase = "Me identifico con: ";
        frase = frase + getTipoId();
        frase = frase + ". El numero es: ";
        frase = frase + getIdentificacion();
        return frase;
    }

    protected abstract String getIdentificacion();

    protected abstract String getTipoId();

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}