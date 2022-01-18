package com.utn.patrones.mediator;

public class Usuario implements Chateable {

    private String nombre;
    private SalonDeChat salon;

    public Usuario(SalonDeChat salonDeChat) {
        salon = salonDeChat;
    }

    public void recibe(String de, String msg) {
        String s = "el usuario " + de + " te dice: " + msg;
        System.out.println(nombre + ": " + s);
    }

    public void envia(String a, String msg) {
        salon.envia(nombre, a, msg);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SalonDeChat getSalon() {
        return salon;
    }

    public void setSalon(SalonDeChat salon) {
        this.salon = salon;
    }
}
