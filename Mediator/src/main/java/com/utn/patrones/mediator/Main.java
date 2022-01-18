package com.utn.patrones.mediator;

public class Main {
    public static void main(String[] args) {
        SalonDeChat salonDeChat = new SalonDeChat();
        Usuario usuario1 = new Usuario(salonDeChat);
        usuario1.setNombre("Juan");

        Usuario usuario2 = new Usuario(salonDeChat);
        usuario2.setNombre("Pepe");

        Usuario usuario3 = new Usuario(salonDeChat);
        usuario3.setNombre("Pedro");

        salonDeChat.registra(usuario1);
        salonDeChat.registra(usuario2);
        salonDeChat.registra(usuario3);

        usuario1.envia("Pepe", "Hola como andas?");
        usuario2.envia("Juan", "Todo ok, vos?");
        usuario3.envia("Martin", "Martin estas?");
    }
}
