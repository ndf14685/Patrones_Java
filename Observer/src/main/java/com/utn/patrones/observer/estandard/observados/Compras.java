package com.utn.patrones.observer.estandard.observados;

import com.utn.patrones.observer.estandard.ILibroMalEstado;

public class Compras implements ILibroMalEstado {
    @Override
    public void update() {
        System.out.println("Compras: ");
        System.out.println("Solicito nueva cotizacion...");
    }
}
