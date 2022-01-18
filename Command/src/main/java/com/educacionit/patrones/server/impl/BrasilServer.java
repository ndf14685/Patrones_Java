package com.educacionit.patrones.server.impl;

import com.educacionit.patrones.server.IServer;

public class BrasilServer implements IServer {

    public void apagate() {
        System.out.println("Apagando el servidor de Brasil");
    }

    @Override
    public void cerraConexion() {
        System.out.println("Cerrando conexion con el servidor de Brasil");
    }

    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de Brasil");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guardar Log de Brasil");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor de Brasil");
    }

    @Override
    public void verificaConexion() {
        System.out.println("Comprobando la conexion de Brasil");
    }
}
