package com.utn.patrones.builder.main;

import com.utn.patrones.builder.FordBuilder;
import com.utn.patrones.builder.concretos.Auto;
import com.utn.patrones.builder.constructor.Concesionaria;

public class Main {
    public static void main(String[] args) {
        Concesionaria concesionaria = new Concesionaria();
        concesionaria.setAutoBuilder(new FordBuilder());
        concesionaria.construirAuto();
        Auto auto = concesionaria.getAuto();
        System.out.println(auto.getMarca());
    }
}
