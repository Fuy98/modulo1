package com.anahuac.mayab.modulo1.sesion3;

import java.util.HashMap;
import java.util.Map;


public class HashMap4 {
	public static void main(String[] args) {
		
		// Creating a HashMap object
		HashMap<String, Integer> students = new HashMap<>();
		
		//HashMap<String, Perro>
		
		//Adding key-value pairs (student name and age) to the HashMap
		students.put("Alice", 20);
		students.put("Bob", 22);
		students.put("Charlie", 19);
		students.put("Charlie1", 19);
		students.put("Charlie2", 19);
		students.put("Charlie3", 19);
		students.put("Charlie4", 19);
		
		//Retreiving a value by its keys
		Integer aliceAge = students.get("Alice");
		System.out.println("Alice's age: "+ aliceAge);
		
		//Checking if a key is present in the HashMap
		boolean containsKey = students.containsKey("David");
		System.out.println("Is David in the HashMap?  "+ containsKey);
		
		System.out.println("Tamaño antes de remover a Bob:  "+ students.size());
		//Removing a key-balue pair by its key
		students.remove("Bob");
		
		System.out.println("Tamaño DESPUES de remover a Bob:  " + students.size());
		
		//Iterating over the HashMap using a for-each loop and entrySet
		System.out.println("Iterating over the HashMap: ");
		
		for(Map.Entry<String, Integer> entry: students.entrySet()) {
			String name = entry.getKey();
			Integer age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		
		System.out.println("------- Iterating over the HashMap: KEYSET -------");
		//Iterar usando las llaves
		for (String llave : students.keySet()) {
			System.out.println(llave);
			System.out.println( "Edad: " + students.get(llave));
		}
		
		System.out.println("------- Encontrar elementos con edad 19 -------");
		//Iterar usando las llaves
		for (Map.Entry<String, Integer> entry: students.entrySet()) {
			String name = entry.getKey();
			Integer age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		
	}
}
