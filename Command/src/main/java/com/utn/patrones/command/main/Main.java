package com.utn.patrones.command.main;

import com.educacionit.patrones.invoker.Invoker;
import com.educacionit.patrones.server.IServer;
import com.educacionit.patrones.server.impl.ArgentinaServer;
import com.utn.patrones.command.Command;
import com.utn.patrones.command.impl.PrendeServer;

public class Main {
    public static void main(String[] args) {
        IServer server = new ArgentinaServer();

        Command command = new PrendeServer(server);

        Invoker serverAdmin = new Invoker(command);
        serverAdmin.run();
    }
}
