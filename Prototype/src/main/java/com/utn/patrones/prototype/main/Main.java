package com.utn.patrones.prototype.main;

import com.utn.patrones.prototype.TV;
import com.utn.patrones.prototype.TvPrototype;

public class Main {
    public static void main(String[] args) throws Exception {
        TvPrototype tvp = new TvPrototype();
        TV tv = (TV) tvp.prototipo("Plasma");

        System.out.println(tv.getPrecio());
    }
}
