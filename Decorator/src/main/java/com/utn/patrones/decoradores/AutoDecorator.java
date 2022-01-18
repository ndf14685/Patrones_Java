package com.utn.patrones.decoradores;

import com.utn.patrones.interfaces.Vendible;

public abstract class AutoDecorator implements Vendible {

    private Vendible vendible;

    public AutoDecorator(Vendible vendible) {
        this.vendible = vendible;
    }

    public Vendible getVendible() {
        return vendible;
    }

    public void setVendible(Vendible vendible) {
        this.vendible = vendible;
    }
}
