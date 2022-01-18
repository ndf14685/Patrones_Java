package com.educacionit.patrones.observer.api.notificador;

import java.util.Observable;

import com.utn.patrones.observer.api.entidades.Libro;

public class AlarmaLibro extends Observable {
    public void disparaAlarma(Libro libro) {
        setChanged();
        notifyObservers("Rompieron el libro: " + libro.getTiulo());
    }
}
