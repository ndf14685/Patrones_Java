package com.utn.patrones.chain;

public interface IAprobador {
    public void setNext(IAprobador aprobador);
    public IAprobador getNext();
    
    public void solicitudPrestamo(int monto);
}
