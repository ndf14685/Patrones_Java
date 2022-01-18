package com.utn.patrones.composite;

import java.util.ArrayList;
import java.util.List;

import com.utn.patrones.composite.entidades.IPersonal;

public class Composite implements IPersonal {
    private List<IPersonal> values = new ArrayList<IPersonal>();

    public void agrega(IPersonal personal) {
        values.add(personal);
    }

    @Override
    public void getDatosPersonal() {
        for (IPersonal personal : values) {
            personal.getDatosPersonal();
        }        
    }
}
