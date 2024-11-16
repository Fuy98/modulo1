package com.anahuac.modulo1.sesion5;

import java.util.ArrayList;

public class SimuladorPatos {

	public void simulaAcciones(ArrayList<Pato> listaPatos) {
		for(Pato p: listaPatos) {
			System.out.println("Nombre: " + p.getNombre());
			p.volar();
			p.quack();
			p.comer();
			System.out.println("----------");
		}// TODO Auto-generated method stub
		//System.out.println("----------");

	}

}
