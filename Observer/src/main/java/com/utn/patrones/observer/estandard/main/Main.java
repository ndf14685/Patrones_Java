package com.utn.patrones.observer.estandard.main;

import com.utn.patrones.observer.estandard.entidades.Libro;
import com.utn.patrones.observer.estandard.notificador.AlarmaLibro;
import com.utn.patrones.observer.estandard.notificador.Biblioteca;
import com.utn.patrones.observer.estandard.observados.Administracion;
import com.utn.patrones.observer.estandard.observados.Compras;
import com.utn.patrones.observer.estandard.observados.Stock;

public class Main {
    public static void main(String[] args) {
        AlarmaLibro alarmas = new AlarmaLibro();
        alarmas.attach(new Compras());
        alarmas.attach(new Administracion());
        alarmas.attach(new Stock());

        Libro libro = new Libro();
        libro.setEstado("MALO");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setAlarma(alarmas);
        biblioteca.devuelveLibro(libro);
    }
}
