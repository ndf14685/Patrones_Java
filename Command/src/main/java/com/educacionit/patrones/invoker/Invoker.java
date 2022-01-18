package com.educacionit.patrones.invoker;

import com.utn.patrones.command.Command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}