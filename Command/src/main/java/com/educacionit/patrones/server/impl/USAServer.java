package com.educacionit.patrones.server.impl;

import com.educacionit.patrones.server.IServer;

public class USAServer implements IServer {

    @Override
    public void apagate() {
        System.out.println("Apagando el servidor de USA");
    }

    @Override
    public void cerraConexion() {
        System.out.println("Cerrando conexion con el servidor de USA");
    }

    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de USA");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guardar Log de USA");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor de USA");
    }

    @Override
    public void verificaConexion() {
        System.out.println("Comprobando la conexion de USA");
    }
}