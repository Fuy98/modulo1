package com.anahuac.mayab.modulo1;

import java.time.LocalDate;


public class Circulo {
	
	public static double calcularArea(double radio) {
		
		double area = Math.pow(radio,  2) * Math.PI;
		
		return area;
	}
	
	public static double calcularCircunferencia(double radio) {
		
		double circunferencia = 2*Math.PI * radio;
		
		return circunferencia;
	}

	public static void main(String[] args) {
		// comment
		/*cdv
		 * comentario de mas de una linea 
		 */
		System.out.println("Este es el argumento de entrada: " + args[1]);
		double radio = Double.parseDouble(args[0]);
		
		double circunferencia = calcularCircunferencia(radio);
		//diametro = radio * 2;
		//
		
		/*System.out.println("El área es: " + area);
		System.out.println("La circunferencia es: " + circunferencia);
		*/
		
		System.out.println("El área es: " + calcularArea(radio) + "La circunferencia es: "+ calcularCircunferencia(radio));
		LocalDate.now();		
 

	}

}
