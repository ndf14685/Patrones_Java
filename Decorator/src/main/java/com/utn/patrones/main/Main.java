package com.utn.patrones.main;

import com.utn.patrones.actores.FiatUno;
import com.utn.patrones.actores.FordFiesta;
import com.utn.patrones.decoradores.AireAcondicionado;
import com.utn.patrones.decoradores.CdPlayer;
import com.utn.patrones.decoradores.Gasoil;
import com.utn.patrones.decoradores.Mp3Player;
import com.utn.patrones.interfaces.Vendible;

public class Main {

    public static void main(String[] args) {
        Vendible auto = new FiatUno();
        CdPlayer cd = new CdPlayer(auto);
        Gasoil gasoil = new Gasoil(cd);

        System.out.println(gasoil.getDescripcion());
        System.out.println("Su precio es: " + gasoil.getPrecio());

        Vendible auto2 = new FordFiesta();
        auto2 = new Mp3Player(auto2);
        auto2 = new Gasoil(auto2);
        auto2 = new AireAcondicionado(auto2);

        System.out.println(auto2.getDescripcion());
        System.out.println("Su precio es: " + auto2.getPrecio());
    }
}
