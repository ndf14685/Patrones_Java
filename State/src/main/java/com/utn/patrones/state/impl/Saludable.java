package com.utn.patrones.state.impl;

import com.utn.patrones.state.SaludState;

public class Saludable implements SaludState {
    @Override
    public String comoTeSentis() {
        return "Pipi Cucu!!";
    }
}
