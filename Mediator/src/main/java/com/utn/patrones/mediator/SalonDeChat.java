package com.utn.patrones.mediator;

import java.util.HashMap;
import java.util.Map;

public class SalonDeChat implements IChat {

    private Map<String, Usuario> participantes = new HashMap<String, Usuario>();

    @Override
    public void registra(Usuario user) {
        participantes.put(user.getNombre(), user);
    }

    @Override
    public void envia(String de, String a, String msg) {
        if (participantes.containsKey(de) && participantes.containsKey(a)) {
            Usuario u = participantes.get(a);
            u.recibe(de, msg);
        } else {
            System.out.println("Usuario inexistente");
        }
    }
}
