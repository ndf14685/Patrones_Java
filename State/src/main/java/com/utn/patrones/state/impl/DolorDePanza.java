package com.utn.patrones.state.impl;

import com.utn.patrones.state.SaludState;

public class DolorDePanza implements SaludState {
    @Override
    public String comoTeSentis() {
        return "Todo mal: me duele la panza";
    }
}
