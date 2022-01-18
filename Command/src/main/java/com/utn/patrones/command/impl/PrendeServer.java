package com.utn.patrones.command.impl;

import com.educacionit.patrones.server.IServer;
import com.utn.patrones.command.Command;

public class PrendeServer implements Command {

    private IServer servidor;

    public PrendeServer(IServer servidor) {
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.prendete();
        servidor.guardaLog();
        servidor.cerraConexion();
    }
}
