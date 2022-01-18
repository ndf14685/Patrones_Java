package com.utn.patrones.observer.estandard.observados;

import com.utn.patrones.observer.estandard.ILibroMalEstado;

public class Stock implements ILibroMalEstado {
    @Override
    public void update() {
        System.out.println("Stock: ");
        System.out.println("Le doy de baja...");
    }
}
