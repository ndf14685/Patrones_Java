package com.utn.patrones.chain.impl;

import com.utn.patrones.chain.IAprobador;

public class Gerente implements IAprobador {

    private IAprobador next;

    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if (monto > 50000 && monto <= 100000) {
            System.out.println("Lo manejo yo, el gerente");
        } else {
            next.solicitudPrestamo(monto);
        }
    }

    @Override
    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }
}
