package com.anahuac.mayab.modulo1.sesion3;

import java.util.ArrayList;
import java.util.HashMap;

public class CartillaPerro {
	//Atributos
	
	private Perro datosPerro;
	private String idCartilla;
	HashMap<String, ArrayList<String>> vacunas;
	
	//Constructores
	public CartillaPerro() {}
	
	public Perro getDatosPerro() {
		return datosPerro;
	}
	public CartillaPerro(Perro datosPerro, String idCartilla) {
		super();
		this.datosPerro = datosPerro;
		this.idCartilla = idCartilla;
	}	
	
	//Getters and Stters

	public void setDatosPerro(Perro datosPerro) {
		this.datosPerro = datosPerro;
	}
	public String getIdCartilla() {
		return idCartilla;
	}
	public void setIdCartilla(String idCartilla) {
		this.idCartilla = idCartilla;
	}
	public HashMap<String, ArrayList<String>> getVacunas() {
		return vacunas;
	}
	public void setVacunas(HashMap<String, ArrayList<String>> vacunas) {
		this.vacunas = vacunas;
	}
	
	public void actualizar(String nombreVacuna, String fechaaplicacion) {
		//Checar si la vacuna ya existe en la cartilla
		if (vacunas.containsKey(nombreVacuna)) {
			ArrayList<String> fechas = vacunas.get(nombreVacuna);
			fechas.add(fechaaplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		else {
			ArrayList<String> fechas = new ArrayList<>();
			fechas.add(fechaaplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		
		
	}

}
