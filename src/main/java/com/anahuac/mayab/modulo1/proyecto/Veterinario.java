package com.anahuac.mayab.modulo1.proyecto;

public class Veterinario {
	private String nombre;
	//private ArrayList<>

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Veterinario(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Servicio crearServicio(String tipo, String nombre, String fecha) throws Exception {
		Servicio servicio = null;
		
		if(tipo == "baño" || tipo == "corte") {
			//String tipo, double costo, String fecha, String encargado
			servicio = new ServicioEstetico(tipo, 250, fecha, "encargadoEstetico");
		}else if (tipo == "vacuna" || tipo == "consulta") {
			servicio = new ServicioMedico(tipo, 5000, fecha, "veterinario");
		}
		else {
			throw new Exception("No existe ese servicio");
		}
		return servicio;
	}
	
	/*public void agregarPaciente(CartillaPerro cartilla) {
		listaPacientes.add(cartilla);
	}
	
	public void imprimirExpedientes() {
		
	}*/

}
