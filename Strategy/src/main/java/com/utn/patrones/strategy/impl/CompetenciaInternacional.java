/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.patrones.strategy.impl;

import java.util.ArrayList;
import java.util.List;

import com.utn.patrones.strategy.ListadoStrategy;

public class CompetenciaInternacional implements ListadoStrategy {
    @Override
    public List getListado(List lista) {
        List resultado = new ArrayList();
        resultado.add(lista.get(0));
        return resultado;
    }
}
