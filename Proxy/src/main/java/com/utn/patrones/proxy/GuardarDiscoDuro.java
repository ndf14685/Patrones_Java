package com.utn.patrones.proxy;

import java.util.List;

public class GuardarDiscoDuro implements IGuardar {
    @Override
    public void save(List datosAGuardar) {
        System.out.println("Guardando datos en el HD...");
    }
}
