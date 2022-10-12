package main;

import solucion.Tren;

public class Main {
	public static void main(String[] args) {
		Tren t = new Tren("resources/Casos_de_prueba/in/caso_01.in");
		
		
		System.out.println("Antes: ");
		t.mostrarAnimales();
		t.sortAnimales();
		
		System.out.println("Despues: ");
		t.mostrarAnimales();
	}
}
