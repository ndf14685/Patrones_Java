package a;

import java.util.List;

import com.utn.patrones.state.entidades.Persona;

public class Cerrada implements EstadoVentanilla{

	@Override
	public void atende(List<Persona> clientes) {
		System.out.println("No estoy atendiendo, vuelvo en 5 minutos");
	}

}
