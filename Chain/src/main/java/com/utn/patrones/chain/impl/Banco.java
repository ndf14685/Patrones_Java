package com.utn.patrones.chain.impl;

import com.utn.patrones.chain.IAprobador;

public class Banco implements IAprobador {

    private IAprobador next;

    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
        this.setNext(ejecutivo);

        LiderTeamEjecutivo lider = new LiderTeamEjecutivo();
        ejecutivo.setNext(lider);

        Gerente gerente = new Gerente();
        lider.setNext(gerente);

        Director director = new Director();
        gerente.setNext(director);

        next.solicitudPrestamo(monto);
    }

    @Override
    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }
}
