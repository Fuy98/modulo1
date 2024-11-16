package com.anahuac.modulo1.sesion5;

public class GastoNoFacturable extends Gasto {

	public GastoNoFacturable(double monto, String categoria, String fecha, String tipoPago) {
		super(monto, categoria, fecha, tipoPago);
		// TODO Auto-generated constructor stub
	}

	
	public void parcializarAMeses(int meses) {
		System.out.println("Parcializando sin interese a: " + meses + "meses");
		
		
	}


}
