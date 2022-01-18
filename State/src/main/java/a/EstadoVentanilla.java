package a;

import java.util.List;

import com.utn.patrones.state.entidades.Persona;

public interface EstadoVentanilla {
	
	public void atende(List<Persona> clientes);

}
