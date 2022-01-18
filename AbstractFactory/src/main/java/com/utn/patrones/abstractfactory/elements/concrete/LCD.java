package com.utn.patrones.abstractfactory.elements.concrete;

import com.utn.patrones.abstractfactory.elements.TV;

public class LCD extends TV {
    @Override
    public String getDescripcion() {
        return "LCD";
    }
}
