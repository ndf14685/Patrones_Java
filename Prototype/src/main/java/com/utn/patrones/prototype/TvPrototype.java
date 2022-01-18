package com.utn.patrones.prototype;

import java.util.HashMap;
import java.util.Map;

public class TvPrototype {
    private Map<String, TV> prototipos = new HashMap<String, TV>();

    public TvPrototype() {
        Plasma plasma = new Plasma("Sony", 21, "Plateado", 399.99, 90, 0.05);
        LCD lcd = new LCD("Panasonic", 42, "Plateado", 599.99, 290);

        prototipos.put("Plasma", plasma);
        prototipos.put("LCD", lcd);
    }

    public Object prototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
}