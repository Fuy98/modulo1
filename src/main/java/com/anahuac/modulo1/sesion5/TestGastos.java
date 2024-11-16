package com.anahuac.modulo1.sesion5;

public class TestGastos {
	
	public static void imprimirFacturas(Facturable gasto, String id, String email) {
		gasto.pedirConstanciaSAT();
		gasto.emitirFactura(id);
		gasto.enviarFactura(email);
	}

	public static void main(String[] args) {
		//double monto, String categoria, String fecha, String tipoPago
		Gasto gasto1 = new GastoNoFacturable(500, "comida", "16-11-2024", "tarjeta");
		
		Gasto gasto2 = new GastoFacturable(200, "consulta médica", "05-11-2024", "tarjeta");
		
		System.out.println("Fecha: " + gasto2.getFecha() + "\nTotal: $" + gasto2.getMonto() + "\nTipo de gasto: " + gasto2.getCategoria() + "\nForma de pago: " + gasto2.getTipoPago());
		imprimirFacturas((Facturable)gasto2,"123","correo@hola.com");

	}

}
