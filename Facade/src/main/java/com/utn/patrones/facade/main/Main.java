package com.utn.patrones.facade.main;

import com.utn.patrones.facade.Inmobiliaria;
import com.utn.patrones.facade.entidades.Cliente;
import com.utn.patrones.facade.entidades.Interesado;
import com.utn.patrones.facade.modulos.AdministracionAlquiler;
import com.utn.patrones.facade.modulos.CuentasAPagar;
import com.utn.patrones.facade.modulos.MuestraPropiedad;
import com.utn.patrones.facade.modulos.VentaInmueble;

public class Main {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        Interesado i = new Interesado();
        Inmobiliaria inmo = new Inmobiliaria();
        inmo.atencionCliente(c);
        inmo.atencionInteresado(i);

        MuestraPropiedad muestraPropiedad = new MuestraPropiedad();
        muestraPropiedad.mostraPropiedad(123);
        VentaInmueble venta = new VentaInmueble();
        venta.gestionaVenta();
        AdministracionAlquiler alquiler = new AdministracionAlquiler();
        alquiler.cobro(1200);
        CuentasAPagar cuentasAPagar = new CuentasAPagar();
        cuentasAPagar.pagoPropietario(1100);

        // Lo mismo pero despues del Facade
        Inmobiliaria inmo2 = new Inmobiliaria();
        inmo2.atencion(i);
        inmo2.atencion(c);
        inmo2.mostraPropiedad(123);
        inmo2.gestionaVenta();
        inmo2.cobraAlquiler(1200);
        inmo2.paga(1100);

    }
}
