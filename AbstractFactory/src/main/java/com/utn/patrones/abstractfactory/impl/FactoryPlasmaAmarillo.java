package com.utn.patrones.abstractfactory.impl;

import com.utn.patrones.abstractfactory.AbstractFactory;
import com.utn.patrones.abstractfactory.elements.Color;
import com.utn.patrones.abstractfactory.elements.TV;
import com.utn.patrones.abstractfactory.elements.concrete.Amarillo;
import com.utn.patrones.abstractfactory.elements.concrete.Plasma;

public class FactoryPlasmaAmarillo extends AbstractFactory {
    @Override
    public Color createColor() {
        return new Amarillo();
    }

    @Override
    public TV createTV() {
        return new Plasma();
    }
}
