package com.educacionit.patrones.observer.api.notificador;

import com.utn.patrones.observer.api.entidades.Libro;

public class Biblioteca {
    private AlarmaLibro alarma;

    public Biblioteca() {
    }

    public AlarmaLibro getAlarma() {
        return alarma;
    }

    public void setAlarma(AlarmaLibro alarma) {
        this.alarma = alarma;
    }

    public void devuelveLibro(Libro libro) {
        if (libro.getEstado().equals("MALO")) {
            if (alarma != null) {
                alarma.disparaAlarma(libro);
            }
        }
    }
}
