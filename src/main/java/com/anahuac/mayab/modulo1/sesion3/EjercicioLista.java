package com.anahuac.mayab.modulo1.sesion3;

import java.util.ArrayList;
import java.util.Arrays;

public class EjercicioLista {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(i);
			//Agregar
			num.add(i);
		}
		
		//Acceder a los elementos de un ArrayList
		System.out.println("Elemento 0 en la lista: " + num.get(0));
		
		num.add(100);
		
		//Para saber el tamnio de la lista usamos
		int len = num.size();
		System.out.println("Ultimo elemento en la lista: " + num.get(num.size()-1));
		
		//Eliminar elementos de la lista:
		num.remove(0);
		System.out.println("Elemento 0 en la lista: " + num.get(0));
		System.out.println("------- Antes de Insertar --------");
		for(int i = 0; i < num.size(); i++) {
			System.out.println("pos =  " + (i) + " valor = " + num.get(i));
			//AGREGAR
		}
		
		//Modificar elementos de la lista - insertando en una posición específica
		num.add(2, 1000);
		System.out.println("-------Insertando--------");
		System.out.println("Elemento 2 en la lista: " + num.get(2));
		
		for(int i = 0; i < num.size(); i++) {
			System.out.println("pos =  " + (i) + " valor = " + num.get(i));
			//AGREGAR
		}
		
		//Modificar elementos de lista - reemplazando en una posicionespecifica
		num.set(0,  2000);
		System.out.println("-------Reemplazando--------");
		for(int i = 0; i < num.size(); i++) {
			System.out.println("pos =  " + (i) + " valor = " + num.get(i));
		}
		
		//Insertar más de un elemento
		//int [] masNumeros = {10,20,30,40,50,60};
		num.addAll(Arrays.asList(10,20,30,40,50,60));
		
	}

}
