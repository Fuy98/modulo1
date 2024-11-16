package com.anahuac.modulo1.sesion5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestArchivo {

	public static void main(String[] args) {
		
		String nombreArchivo = "prueba.txt";
		try (FileWriter archivo = new FileWriter(nombreArchivo))
        {
            PrintWriter pw = new PrintWriter(archivo);
            pw.print("Hola mundo\n");
            pw.print("\tdiplomado anahuac");
            pw.print("\nde java y python");

        } catch (IOException e) {
        	System.out.println("No pude abrir el archivo");
            e.printStackTrace();
        }

	}

}
