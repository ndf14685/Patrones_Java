package com.utn.patrones.abstractfactory;

import com.utn.patrones.abstractfactory.elements.Color;
import com.utn.patrones.abstractfactory.elements.TV;

public class EnsamblajeTV {
    public EnsamblajeTV(AbstractFactory factory) {
        Color color = factory.createColor();
        TV tv = factory.createTV();
        color.colorea(tv);
    }
}
