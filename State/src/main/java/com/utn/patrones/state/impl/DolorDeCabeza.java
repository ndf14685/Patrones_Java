package com.utn.patrones.state.impl;

import com.utn.patrones.state.SaludState;

public class DolorDeCabeza implements SaludState {
    @Override
    public String comoTeSentis() {
        return "Todo mal: me duele la cabeza";
    }
}
