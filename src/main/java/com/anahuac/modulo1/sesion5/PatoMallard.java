package com.anahuac.modulo1.sesion5;

public class PatoMallard extends Pato{

	public PatoMallard(String nombre, String color) {
		super(nombre, color);
	}
	
	public void quack() {
		System.out.println("Soy un pato Mallard y quack!");
	}

	public void comer() {
		System.out.println("Soy un pato Mallard y como");
	}
	
	

}
