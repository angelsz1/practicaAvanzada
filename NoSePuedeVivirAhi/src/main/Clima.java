package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clima {
	private int numDeEstaciones;
	private List<Estacion> estaciones = new ArrayList<>();
	
	public Clima(String path) {
		String todoElFile = Archivos.leer(path);
		int i = 1;
		String[] words = todoElFile.split("[ |\n]+");
	
		numDeEstaciones = Integer.parseInt(words[0]);
		
		while(i < words.length) {
			int cantidadMedicionesEstacion = Integer.parseInt(words[i]);
			i++;
			Estacion estacionActual = new Estacion();
			
			for(int j = 0; j < cantidadMedicionesEstacion; j++) {
				int min = Integer.parseInt(words[i]);
				i++;
				int max = Integer.parseInt(words[i]);
				i++;
				estacionActual.addMedicion(new Medicion(min, max));
			}
			
			estaciones.add(estacionActual);
		}	
	}
	
	public String procesarResultadosYEscribirlos() {
		String sol = "";
		
		int maxHost = 0;
		
		compararTodosConTodos();
		
		for(Estacion e : estaciones) {
			if (e.getHostilidades() > maxHost)
				maxHost = e.getHostilidades();
		}
		
		int index = 1;
		
		for(Estacion e : estaciones) {
			
			if(e.getHostilidades() == maxHost)
				sol += index + " " + e.getNoComparaciones() + "\n";
			
			index++;
			
		}
		
		return sol;
	}
	
	
	
	public void compararTodosConTodos() {
		
		for(int i = 0; i < estaciones.size(); i++) 
			for(int j = i + 1; j < estaciones.size(); j++) 
				estaciones.get(i).compare(estaciones.get(j));
		
	}
	
	
	
}
