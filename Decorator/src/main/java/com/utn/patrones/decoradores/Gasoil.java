package com.utn.patrones.decoradores;

import com.utn.patrones.interfaces.Vendible;

public class Gasoil extends AutoDecorator {

    public Gasoil(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + Gasoil";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 1200;
    }
}