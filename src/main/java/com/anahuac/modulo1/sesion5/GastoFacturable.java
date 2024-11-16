package com.anahuac.modulo1.sesion5;

public class GastoFacturable extends Gasto implements Facturable{
	
	public GastoFacturable(double monto, String categoria, String fecha, String tipoPago) {
		super(monto, categoria, fecha, tipoPago);
		// TODO Auto-generated constructor stub
	}
	public void pedirConstanciaSAT() {
		System.out.println("Dame tu constancia del SAT ");

	}
	public void emitirFactura(String id) {
		System.out.println("Emitiendo la factura... " + id);

	}
	public void enviarFactura(String email) {
		System.out.println("Enviando la factura al correo: " + email);
	}
	public void parcializarAMeses(int meses) {
		System.out.println("Parcializando CON intereses a: " + meses + "meses");
		
	}

}
