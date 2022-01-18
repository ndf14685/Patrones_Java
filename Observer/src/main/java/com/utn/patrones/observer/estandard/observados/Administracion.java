package com.utn.patrones.observer.estandard.observados;

import com.utn.patrones.observer.estandard.ILibroMalEstado;

public class Administracion implements ILibroMalEstado {
    @Override
    public void update() {
        System.out.println("Administracion: ");
        System.out.println("Envio una queja formal...");
    }
}
