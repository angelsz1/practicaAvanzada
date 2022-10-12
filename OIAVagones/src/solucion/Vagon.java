package solucion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vagon {
	private List<Animal> animales = new ArrayList<>();
	private int mayorAgresividad = -1;
	private int menorAgresividad = -1;
	
	public int getCurrentAggressivity() {
		return mayorAgresividad - menorAgresividad;
	}
	
	public boolean testAnimal(Animal a, int maxAg) {
		if (a.getAgresividad() > mayorAgresividad)
			return a.getAgresividad() - menorAgresividad <= maxAg;
		if(a.getAgresividad() < menorAgresividad)
			return mayorAgresividad - a.getAgresividad() <= maxAg;
		
		return mayorAgresividad - menorAgresividad <= maxAg;
	}
	
	
	public void meterAnimal(Animal a) {
		animales.add(a);
		if(a.getAgresividad() > mayorAgresividad || mayorAgresividad == -1)
			mayorAgresividad = a.getAgresividad();
		if(a.getAgresividad() < menorAgresividad || menorAgresividad == -1)
			menorAgresividad = a.getAgresividad();
	}
	
}
