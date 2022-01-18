package com.utn.patrones.abstractfactory.elements.concrete;

import com.utn.patrones.abstractfactory.elements.Color;
import com.utn.patrones.abstractfactory.elements.TV;

public class Azul extends Color {
    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de azul en el televisor " + tv.getDescripcion());
    }
}
