package com.utn.patrones.visitor;

public interface Visitor {
    public double visit(ProductoNormal normal);

    public double visit(ProductoDescuento reducido);
}
