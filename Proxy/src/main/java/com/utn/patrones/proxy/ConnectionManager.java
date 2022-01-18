package com.utn.patrones.proxy;

// Esta clase deberia ser un singleton
public class ConnectionManager {

    private static boolean hayConexion;

    public ConnectionManager() {
        hayConexion = false;
    }

    public static void conectate() {
        // Se abre la conexion
        hayConexion = true;
    }

    public static void desconectate() {
        // Se cierra la conexion
        hayConexion = false;
    }

    public static boolean hayConexion() {
        return hayConexion;
    }
}
