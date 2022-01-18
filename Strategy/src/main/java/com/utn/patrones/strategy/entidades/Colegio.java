package com.utn.patrones.strategy.entidades;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    private List<Alumno> alumnos;

    public Colegio() {
        alumnos = new ArrayList<Alumno>();
        Alumno a1 = new Alumno("Juan", 10);
        Alumno a2 = new Alumno("Sebastian", 9.5);
        Alumno a3 = new Alumno("Mario", 9);
        Alumno a4 = new Alumno("Pedro", 8.5);
        Alumno a5 = new Alumno("Matias", 8);
        Alumno a6 = new Alumno("Diego", 7.8);
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setPersonas(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}