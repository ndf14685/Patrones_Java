package com.utn.patrones.builder.constructor;

import com.utn.patrones.builder.AutoBuilder;
import com.utn.patrones.builder.concretos.Auto;

public class Concesionaria {

    private AutoBuilder autoBuilder;

    public void construirAuto() {
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildMotor();
        autoBuilder.buildPuertas();
    }

    public void setAutoBuilder(AutoBuilder ab) {
        autoBuilder = ab;
    }

    public Auto getAuto() {
        return autoBuilder.getAuto();
    }
}
