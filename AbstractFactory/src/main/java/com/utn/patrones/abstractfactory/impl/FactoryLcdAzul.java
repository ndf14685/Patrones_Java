package com.utn.patrones.abstractfactory.impl;

import com.utn.patrones.abstractfactory.AbstractFactory;
import com.utn.patrones.abstractfactory.elements.Color;
import com.utn.patrones.abstractfactory.elements.TV;
import com.utn.patrones.abstractfactory.elements.concrete.Azul;
import com.utn.patrones.abstractfactory.elements.concrete.LCD;

public class FactoryLcdAzul extends AbstractFactory {
    @Override
    public Color createColor() {
        return new Azul();
    }

    @Override
    public TV createTV() {
        return new LCD();
    }
}
