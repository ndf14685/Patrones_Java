package com.educacionit.patrones.server.impl;

import com.educacionit.patrones.server.IServer;

public class ArgentinaServer implements IServer {

    @Override
    public void apagate() {
        System.out.println("Apagando el servidor de Argentina");
    }

    @Override
    public void cerraConexion() {
        System.out.println("Cerrando conexion con el servidor de Argentina");
    }

    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de Argentina");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guardar Log de Argentina");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor de Argentina");
    }

    @Override
    public void verificaConexion() {
        System.out.println("Comprobando la conexion de Argentina");
    }
}