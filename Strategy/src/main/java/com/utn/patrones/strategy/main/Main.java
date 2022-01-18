package com.utn.patrones.strategy.main;

import java.util.List;

import com.utn.patrones.strategy.ListadoStrategy;
import com.utn.patrones.strategy.entidades.Alumno;
import com.utn.patrones.strategy.entidades.Colegio;
import com.utn.patrones.strategy.impl.CompetenciaInternacional;
import com.utn.patrones.strategy.impl.CompetenciaNacional;
import com.utn.patrones.strategy.impl.InterColegial;

public class Main {
    public static void main(String[] args) {

        Colegio colegio = new Colegio();
        List<Alumno> alumnos = colegio.getAlumnos();

        ListadoStrategy st = new CompetenciaInternacional();
        // Se puede evitar que el cliente conozca los strategy concretos

        List rta = st.getListado(alumnos);

        // Veamos el resultado del patron
        System.out.println("Los participantes son:");
        for (int i = 0; i < rta.size(); i++) {
            Alumno alumno = (Alumno) rta.get(i);
            System.out.println(alumno.getNombre());
        }
    }
}
