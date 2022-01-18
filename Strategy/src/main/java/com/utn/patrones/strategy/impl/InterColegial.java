package com.utn.patrones.strategy.impl;

import java.util.List;

import com.utn.patrones.strategy.ListadoStrategy;

public class InterColegial implements ListadoStrategy {
    @Override
    public List getListado(List lista) {
        return lista.subList(0, 5);
    }
}
