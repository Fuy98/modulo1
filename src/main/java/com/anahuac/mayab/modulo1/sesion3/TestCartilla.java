package com.anahuac.mayab.modulo1.sesion3;

import java.io.IOException;

public class TestCartilla {

	public static void main(String[] args) {
		
		Perro miPerro = new Perro("unica", "firulais", "paty", 5);
		
		CartillaPerro cartilla = new CartillaPerro();
		
		cartilla.setDatosPerro(miPerro);
		
		cartilla.actualizar("rabia", "5-marzo-2022");
		cartilla.actualizar("rabia", "5-marzo-2023");
		cartilla.actualizar("rabia", "5-marzo-2024");
		cartilla.actualizar("desparasitación", "5-marzo-2022");
		
		
		cartilla.imprimirCartilla();
		//Este metodo imprime el archivo con la cartilla
		try {
			cartilla.imprimirExpediente();
		} catch (IOException e) {
			System.out.println("No se pudo abrir el archivo");
			e.printStackTrace();
		}

	}

}
