package com.utn.patrones.observer.estandard.notificador;

import java.util.ArrayList;
import java.util.List;

import com.utn.patrones.observer.estandard.ILibroMalEstado;
import com.utn.patrones.observer.estandard.Subject;

public class AlarmaLibro implements Subject {
    private List<ILibroMalEstado> observadores = new ArrayList<ILibroMalEstado>();

    @Override
    public void attach(ILibroMalEstado observador) {
        observadores.add(observador);
    }

    @Override
    public void dettach(ILibroMalEstado observador) {
        observadores.remove(observador);
    }

    @Override
    public void notifyObservers() {
        for (ILibroMalEstado observador : observadores) {
            observador.update();
        }
    }
}
