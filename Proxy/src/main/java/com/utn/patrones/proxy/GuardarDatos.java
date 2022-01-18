package com.utn.patrones.proxy;

import java.util.List;

public class GuardarDatos implements IGuardar {
    @Override
    public void save(List datosAGuardar) {
        if (ConnectionManager.hayConexion()) {
            new ObjetoRemoto().save(datosAGuardar);
        } else {
            new GuardarDiscoDuro().save(datosAGuardar);
        }
    }
}
