package com.utn.patrones.chain.impl;

import com.utn.patrones.chain.IAprobador;

public class Director implements IAprobador {

    private IAprobador next;

    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if (monto >= 100000) {
            System.out.println("Lo manejo yo, el director");
        }
    }

    @Override
    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }
}
