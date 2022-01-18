package com.utn.patrones.observer.api.entidades;

/* 
 * Un libro seguramente tendrá más atributos 
 * como autor, editorial, etc pero para nuestro 
 * ejemplo no son necesarios 
 */
public class Libro {
    private String tiulo;
    private String estado;

    public Libro() {
    }
    
    public String getTiulo() {
        return tiulo;
    }

    public void setTiulo(String tiulo) {
        this.tiulo = tiulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
