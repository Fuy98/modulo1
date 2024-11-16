package com.anahuac.mayab.modulo1.sesion3;
import java.util.Random;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class TestPerro {
	
	public static void main(String[] args) {
		
		Perro perro1 = new Perro();
		
		Perro perro2 = new Perro("desconocida", "pequeño", 10.5,"firulais", "pepe",2);
		
		System.out.println("El perro1 se llama: " + perro1.getNombre());
		
		System.out.println("El perro2 se llama: " + perro2.getNombre());
		
		
		//Ya sabemos el nombre de perro1 
		
		perro1.setNombre("solovino");
		
		System.out.println("El perro1 se llama: " + perro1.getNombre());
		
		System.out.println("el perro2 ladra: ");
		perro2.ladrar();
		
		//Arreglo de perros 
		
		Perro[] misPerros = new Perro[10];
		
		String[] nombres = {"Tomas","Cookie", "Scooby", "Pelote", "Balon", "Camila", "Tina", "Lulu", "Cachetes", "Richie"};
		String[] duenios = {"Ramon", "Carlos", "Genaro", "Miguel", "Bayron", "Alejandro", "Tania", "Lourdes", "Josue", "Ricardo"};
		for(int i = 0; i < 10; i++) {
			misPerros[i] = new Perro();
			misPerros[i].setNombre(nombres[i]);
		}
		
		for(int i = 0; i < 10; i++) {
			misPerros[i].ladrar();
		}
		
		
		Random generador = new Random();
		
		for(int i = 0; i<10; i++) {
			int aleatorio = generador.nextInt(10); //nos da numero aleatorio entre 0 y 10
			misPerros[i].setNombreDuenio(duenios[aleatorio]);
			misPerros[i].ladrar();
		}
		
		System.out.println("--------- Ahora usando un arrayList ----------");
		//Ahora vamos a usar un arrayList
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		
		for (int i = 0; i < 10; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
			int numeroAleatorio = generador.nextInt(nombres.length);
			perroTemporal.setNombreDuenio(duenios[numeroAleatorio]);
			
			//Ya que estan seteados los valores, ahora guardo en la lista
			listaPerros.add(perroTemporal);
			
		}
		
		for(int i = 0; i < 10; i++) {
			listaPerros.get(i).ladrar();
		}
		
		//Busqueda de un perro
		for(int i = 0; i < listaPerros.size(); i++) {
			String nombre = listaPerros.get(i).getNombre();
			if (nombre == "Camila") {
				listaPerros.get(i).setNombre("Nuevo nombre del perro");
				break;
			}
		}
		
		System.out.println("--------- Despues de cambiar el nombre  ----------");
		
		for(int i = 0; i < listaPerros.size(); i++) {
			listaPerros.get(i).ladrar();
		}
		
		System.out.println("--- For each ");
		for (Perro perro : listaPerros) {
			perro.ladrar();
		}
		
		System.out.println("--- Usando un HashMap ");
		HashMap<Integer, Perro> mapPerros = new HashMap<>();
		
		for(int i = 0; i < 10; i++) {
			
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
			int numeroAleatorio = generador.nextInt(nombres.length);
			perroTemporal.setNombreDuenio(duenios[numeroAleatorio]);
			
			//Ya que que estan seteados los valores ahora guardo en el mapa
			mapPerros.put(i, perroTemporal);
		}
		System.out.println(mapPerros.size());
		System.out.println("--- Usando un HashMap con Keyset ---");
		 for(Integer i : mapPerros.keySet()) {
			 mapPerros.get(i).ladrar();
		 }
		
		 System.out.println("--- Usando un HashMap con entryset ---");
		 for(Entry<Integer, Perro> entry : mapPerros.entrySet()) {
			 entry.getValue().ladrar();
		 }
		 
		 System.out.println("--- Usando un HashMap con values ---");
		 for(Perro p : mapPerros.values()) {
			 p.ladrar();
		 }
		 
		 
	}
}
