package test;

import org.junit.Assert;
import org.junit.Test;

import archivos.Archivos;
import solucion.Tren;

public class TestVictor {
	@Test
	public void caso_01() {
		Tren t = new Tren();
		t.solucion("resources/Casos_de_prueba/in/caso_01.in","resources/Casos_de_prueba/out/caso_01.out");
		
		Assert.assertEquals(Archivos.leer("resources/Casos_de_prueba/out_esperado/caso_01.out"),Archivos.leer("resources/Casos_de_prueba/out/caso_01.out"));
	}
	
	@Test
	public void caso_02() {
		Tren t = new Tren();
		t.solucion("resources/Casos_de_prueba/in/caso_02.in","resources/Casos_de_prueba/out/caso_02.out");
		
		Assert.assertEquals(Archivos.leer("resources/Casos_de_prueba/out_esperado/caso_02.out"),Archivos.leer("resources/Casos_de_prueba/out/caso_02.out"));
	}
	
	
	@Test
	public void caso_03() {
		Tren t = new Tren();
		t.solucion("resources/Casos_de_prueba/in/caso_03.in","resources/Casos_de_prueba/out/caso_03.out");
		
		Assert.assertEquals(Archivos.leer("resources/Casos_de_prueba/out_esperado/caso_03.out"),Archivos.leer("resources/Casos_de_prueba/out/caso_03.out"));
	}
	
	@Test
	public void caso_04() {
		Tren t = new Tren();
		t.solucion("resources/Casos_de_prueba/in/caso_04.in","resources/Casos_de_prueba/out/caso_04.out");
		
		Assert.assertEquals(Archivos.leer("resources/Casos_de_prueba/out_esperado/caso_04.out"),Archivos.leer("resources/Casos_de_prueba/out/caso_04.out"));
	}
	@Test
	public void caso_05() {
		Tren t = new Tren();
		t.solucion("resources/Casos_de_prueba/in/caso_05.in","resources/Casos_de_prueba/out/caso_05.out");
		
		Assert.assertEquals(Archivos.leer("resources/Casos_de_prueba/out_esperado/caso_05.out"),Archivos.leer("resources/Casos_de_prueba/out/caso_05.out"));
	}
	@Test
	public void caso_06() {
		Tren t = new Tren();
		t.solucion("resources/Casos_de_prueba/in/caso_06.in","resources/Casos_de_prueba/out/caso_06.out");
		
		Assert.assertEquals(Archivos.leer("resources/Casos_de_prueba/out_esperado/caso_06.out"),Archivos.leer("resources/Casos_de_prueba/out/caso_06.out"));
	}
	@Test
	public void caso_07() {
		Tren t = new Tren();
		t.solucion("resources/Casos_de_prueba/in/caso_07.in","resources/Casos_de_prueba/out/caso_07.out");
		
		Assert.assertEquals(Archivos.leer("resources/Casos_de_prueba/out_esperado/caso_07.out"),Archivos.leer("resources/Casos_de_prueba/out/caso_07.out"));
	}
	
	
}
