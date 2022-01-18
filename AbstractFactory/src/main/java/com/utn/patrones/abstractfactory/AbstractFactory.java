package com.utn.patrones.abstractfactory;

import com.utn.patrones.abstractfactory.elements.Color;
import com.utn.patrones.abstractfactory.elements.TV;

public abstract class AbstractFactory {
    public abstract TV createTV();

    public abstract Color createColor();
}
