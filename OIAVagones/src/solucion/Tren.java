package solucion;

import java.util.ArrayList;
import java.util.List;
import archivos.Archivos;

public class Tren {
	private List<Vagon> vagones = new ArrayList<>();
	private List<Animal> todosLosAnimales = new ArrayList<>();
	private int agresividadMaxima = 0;
	
	
	public Tren() {
		
	}
	
	public Tren(String path) {
		recibirInput(path);
	}
	
	public void sortAnimales() {
		
		int n = todosLosAnimales.size();
		
		for(int i = 0; i < n; i++) {
			Animal min = todosLosAnimales.get(i);
					
			for(int j = i + 1; j < n; j++) {
				if(todosLosAnimales.get(j).getAgresividad() < min.getAgresividad()) {
					min = todosLosAnimales.get(j);
				}
			}
			Animal aux = new Animal(min.getNombre(), min.getAgresividad());
			todosLosAnimales.set(todosLosAnimales.indexOf(min), todosLosAnimales.get(i));
			todosLosAnimales.set(i, aux);
			
		}
	}
	
	
	public void recibirInput(String path) {
		int i = 2;
		String file = Archivos.leer(path);
		String[] words = file.split("[ |\n]+");
		String e = words[0];
		
		agresividadMaxima = Integer.parseInt(words[1]);
		
		while(i < words.length) {
			String name = words[i];
			i++;
			int agresividad = Integer.parseInt(words[i]);
			i++;
			int cant = Integer.parseInt(words[i]);
			i++;
			Animal tmp = new Animal(name, agresividad);
			for(int j = 0; j < cant; j++)
				todosLosAnimales.add(tmp);
		}
		
	}
	
	public void mostrarAnimales() {
		for(Animal a : todosLosAnimales) {
			System.out.println(a);
		}
	}
	
	
	public void solucion(String pathEntrada, String pathSalida) {
		if(todosLosAnimales.isEmpty())
			recibirInput(pathEntrada);
		
		
		sortAnimales();
		
		for (Animal a: todosLosAnimales) {
			
			if(!vagones.isEmpty()) {
				boolean entre = false;
				int index = 0;
				while(!entre && index < vagones.size()) {
					if (vagones.get(index).testAnimal(a, agresividadMaxima)) {
						vagones.get(index).meterAnimal(a);
						entre = true;
					}else index++;
				}
				if(!entre) {
					Vagon v = new Vagon();
					v.meterAnimal(a);
					vagones.add(v);
				}
				
			}
			
			else {
				Vagon v = new Vagon();
				v.meterAnimal(a);
				vagones.add(v);
			}
	
		}
		generarOutput(pathSalida);
	}
	
	public void generarOutput(String path) {
		String total = new String();
		total += vagones.size();
		int agresivTot = 0;
		for(Vagon v : vagones)
			agresivTot += v.getCurrentAggressivity();
		
		total += " " + agresivTot;
		
		
		Archivos.escribir(path, total);
	}
	
}
