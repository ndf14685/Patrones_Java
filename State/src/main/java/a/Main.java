package a;

import com.utn.patrones.state.entidades.Persona;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.setNombre("Pepe");
		
		Persona persona2 = new Persona();
		persona2.setNombre("Juan");
		
		Banco banco = new Banco();
		banco.getClientes().add(persona1);
		banco.getClientes().add(persona2);
		
		banco.atende();
		banco.cerrate();
		banco.atende();

	}

}
