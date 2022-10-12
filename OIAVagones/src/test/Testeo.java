package test;

import org.junit.Assert;
import org.junit.Test;

import archivos.Archivos;
import solucion.Tren;

public class Testeo {
	
	@Test
	public void testeoOIA() {
		Tren t = new Tren();
		t.solucion("resources/vagones.in", "resources/vagones.out");
		Assert.assertEquals("4 45" , Archivos.leer("resources/vagones.out"));
	}
	
	
	@Test
	public void testCaro1() {
		Tren t = new Tren();
		t.solucion("resources/vagonesCaro1.in", "resources/vagonesCaro1.out");
		
		Assert.assertEquals("1 0",Archivos.leer("resources/vagonesCaro1.out"));
	}
	
	@Test
	public void testCaro2() {
		Tren t = new Tren();
		t.solucion("resources/vagonesCaro2.in", "resources/vagonesCaro2.out");
		
		Assert.assertEquals("3 0",Archivos.leer("resources/vagonesCaro2.out"));
	}

}
