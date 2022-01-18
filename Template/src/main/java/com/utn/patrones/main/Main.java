package com.utn.patrones.main;

import com.utn.patrones.actores.Cliente;
import com.utn.patrones.actores.Empleado;
import com.utn.patrones.actores.Socio;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(12121);
        System.out.println("El cliente dice: ");
        System.out.println(cliente.identificate());

        System.out.println("El empleado dice: ");
        Empleado empleado = new Empleado("AD 41252");
        System.out.println(empleado.identificate());

        System.out.println("El socio dice: ");
        Socio socio = new Socio(46232);
        System.out.println(socio.identificate());
    }
}
