package com.anahuac.mayab.modulo1;

public class Condicional {

	public static void main(String[] args) {

		int edad = 18;
		boolean ine = false;
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
			if (ine == true) {
				System.out.println("ya puedes votar");
			}
			else {      
				System.out.println("acude a tu modulo");
			}
		}
		else {
			System.out.println("NO eres mayor de edad");
		}

		// CALCULAR NUM MAYOR
		
		int num1, num2;
		
		num1 = 10;
		num2 = 10;
		
		if (num1 > num2) {
			System.out.println("El mayor es:" + num1);
		}
		else if (num1 == num2) {
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("El mayor es:" + num2);	
		}
		
		//CALCULAR PROPINA
		double cuenta = 190;
		double propina = 10;
		
		if (cuenta > 100) {
			propina = cuenta * .10;
		}
		System.out.println("la propina es: " + propina);
		
				
	}

}
