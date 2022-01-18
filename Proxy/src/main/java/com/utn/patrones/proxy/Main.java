package com.utn.patrones.proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> datos = new ArrayList<String>();
        datos.add("Datos a guardar!!");

        IGuardar g = new GuardarDatos();
        g.save(datos);

        ConnectionManager.conectate();
        g.save(datos);
    }
}
