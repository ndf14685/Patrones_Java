package com.utn.patrones.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> estados = new ArrayList<Memento>();

    public void addMemento(Memento m) {
        estados.add(m);
    }

    public Memento getMemento(int index) {
        return estados.get(index);
    }
}
