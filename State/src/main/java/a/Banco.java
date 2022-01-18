package a;

import java.util.ArrayList;
import java.util.List;

import com.utn.patrones.state.entidades.Persona;

public class Banco {
	private String nombre;
	private String sucursal;
	private EstadoVentanilla ventanilla;
	private List<Persona> clientes;
	
	public Banco() {
		ventanilla = new Abierta();
		clientes = new ArrayList<Persona>();
	}
	
	public void atende() {
		ventanilla.atende(clientes);
	}
	
	public void cerrate() {
		ventanilla = new Cerrada();
	}
	
	public void soloPrioridad() {
		ventanilla = new SoloPrioridad();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public EstadoVentanilla getVentanilla() {
		return ventanilla;
	}
	public void setVentanilla(EstadoVentanilla ventanilla) {
		this.ventanilla = ventanilla;
	}
	public List<Persona> getClientes() {
		return clientes;
	}
	public void setClientes(List<Persona> clientes) {
		this.clientes = clientes;
	}
	
}
