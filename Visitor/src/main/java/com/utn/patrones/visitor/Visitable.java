package com.utn.patrones.visitor;

public interface Visitable {
    public double accept(Visitor visitor);
}
