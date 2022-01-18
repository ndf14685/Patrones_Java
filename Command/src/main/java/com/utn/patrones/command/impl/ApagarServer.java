package com.utn.patrones.command.impl;

import com.educacionit.patrones.server.IServer;
import com.utn.patrones.command.Command;

public class ApagarServer implements Command {

    private IServer servidor;

    public ApagarServer(IServer servidor) {
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.guardaLog();
        servidor.apagate();
        servidor.cerraConexion();
    }
}