package com.anahuac.modulo1.sesion5;

import java.util.ArrayList;

public class TestPatos {

	public static void main(String[] args) {
		
		PatoMallard pato1 = new PatoMallard("mallard", "negro");
		
		PatoHule pato2 = new PatoHule("hule", "amarillo");
		
		PatoSenuelo pato3 = new PatoSenuelo("señuelo", "gris");
		
		PatoSenuelo pato4 = new PatoSenuelo("señuelo2", "cafe");
		
		PatoPapel pato5 = new PatoPapel("Papel", "blanco");
		
		ArrayList<Pato> listaPatos = new ArrayList<Pato>();
		
		listaPatos.add(pato1);
		listaPatos.add(pato2);
		listaPatos.add(pato3);
		listaPatos.add(pato4);
		listaPatos.add(pato5);
		
		SimuladorPatos simulador = new SimuladorPatos();
		simulador.simulaAcciones(listaPatos);
		

	}

}
