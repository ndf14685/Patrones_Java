package a;

import java.util.List;

import com.utn.patrones.state.entidades.Persona;

public class Abierta implements EstadoVentanilla {

	@Override
	public void atende(List<Persona> clientes) {
		Persona persona = clientes.remove(0);
		System.out.println("Atendiendo a "+persona.getNombre());
	}

}
