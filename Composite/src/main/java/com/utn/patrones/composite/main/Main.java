package com.utn.patrones.composite.main;

import com.utn.patrones.composite.Aula;
import com.utn.patrones.composite.Direccion;
import com.utn.patrones.composite.Escuela;
import com.utn.patrones.composite.entidades.Persona;

public class Main {
    public static void main(String[] args) {
        Persona alumno1 = new Persona("Juan Perez", 21);
        Persona alumno2 = new Persona("Vanesa Gonzalez", 23);
        Persona alumno3 = new Persona("Martin Palermo", 26);
        Persona alumno4 = new Persona("Sebastian Paz", 30);
        Persona alumno5 = new Persona("Pepe Pillo", 22);

        Persona profesor1 = new Persona("Jacinto Dalo", 54);
        Persona profesor2 = new Persona("Guillermo Tei", 43);

        Persona director = new Persona("Dr Cito  Maximo", 65);
        Persona portero = new Persona("Don Manolo", 55);

        Escuela escuela = new Escuela();
        escuela.agrega(portero);

        Direccion direccion = new Direccion();
        direccion.agrega(director);

        Aula aula1 = new Aula();
        aula1.agrega(profesor1);
        aula1.agrega(alumno1);
        aula1.agrega(alumno2);
        aula1.agrega(alumno3);

        Aula aula2 = new Aula();
        aula2.agrega(profesor2);
        aula2.agrega(alumno4);
        aula2.agrega(alumno5);

        escuela.agrega(direccion);
        escuela.agrega(aula1);
        escuela.agrega(aula2);

        escuela.getDatosPersonal();
    }
}
