package com.utn.patrones.singleton;

public class Banco {

    /*
     * La clase Banco tiene una propiedad de su mismo tipo de dato
     * ya que aca va a alocar la unica instancia de Banco en todo el sistema
     */
    private static Banco instance;
    
    private String nombre;
    private String calle;
    private int numero;
    private String telefono;

    /*
     * Definimos el constructor privado para que nadie
     * desde fuera de la clase pueda crear una instancia de Banco
     */
    private Banco() {
        this.nombre = "Banco IT";
        this.calle = "Lavalle";
        this.numero = 648;
        this.telefono = "4328-0457";
    }

    /*
     * La clase Banco tiene un metodo static el cual
     * provee la funcionalidad de devolver la unica instancia
     * en el sistema, si no existe la crea y la devuelve, si 
     * ya existe devuelve esa. Es importante notar la palabra
     * synchronized esta puesta para asegurar que dos hilos no pueden
     * acceder a este mismo metodo al mismo tiempo.
     */
    public static Banco getInstance() {
        if (instance == null) {
            instance = new Banco();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", calle=" + calle + ", numero=" + numero + ", telefono=" + telefono + '}';
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
