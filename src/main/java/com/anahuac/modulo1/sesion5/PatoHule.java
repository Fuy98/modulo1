package com.anahuac.modulo1.sesion5;

public class PatoHule extends Pato{

	public PatoHule(String nombre, String color) {
		super(nombre, color);
	}
	
	public void comer() {
		System.out.println("Soy un pato de hule y no como");
	}
	public void volar() {
		System.out.println("Soy un pato de hule y no salgo volando");
	}
	public void quack() {
		  System.out.println("Soy un pato de hule y hago squick!");
	}

}
