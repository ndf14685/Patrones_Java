package com.utn.patrones.adapter.main;

import java.util.Date;
import java.util.GregorianCalendar;

import com.utn.patrones.adapter.IPersonaNueva;
import com.utn.patrones.adapter.impl.PersonaVieja;
import com.utn.patrones.adapter.impl.ViejaToNuevaAdapter;

public class Main {
    public static void main(String[] args) {
        PersonaVieja pv = new PersonaVieja();
        pv.setApellido("Perez");
        pv.setNombre("Maxi");
        GregorianCalendar g = new GregorianCalendar();
        g.set(2000, 01, 01);
        // Seteamos que nacio en el anio 2000
        Date d = g.getTime();
        pv.setFechaDeNacimiento(d);

        IPersonaNueva adapter = new ViejaToNuevaAdapter(pv);

        System.out.println(adapter.getEdad());
        System.out.println(adapter.getNombre());

        adapter.setEdad(10);
        adapter.setNombre("Juan Perez");

        System.out.println(adapter.getEdad());
        System.out.println(adapter.getNombre());
    }
}
