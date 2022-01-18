package com.utn.patrones.chain.main;

import com.utn.patrones.chain.impl.Banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.solicitudPrestamo(5600);
    }
}
