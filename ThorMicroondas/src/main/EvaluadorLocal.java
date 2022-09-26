package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvaluadorLocal {
	private int cantPersonajes, cantObjetos, distObj;
	private List<Personaje> personajes = new ArrayList<>();
	private List<Objeto> objetos = new ArrayList<>();
	
	public EvaluadorLocal(String path){
		File f = new File(path);
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
			cantPersonajes = sc.nextInt();
			cantObjetos = sc.nextInt();
			distObj = sc.nextInt();
			for(int i = 0; i < cantPersonajes; i++){
				int alturaActual = sc.nextInt();
				int fuerzaActual = sc.nextInt();
				personajes.add(new Personaje(alturaActual,fuerzaActual));
			}
			for(int i = 0; i < cantObjetos; i++){
				int pesoActual = sc.nextInt();
				objetos.add(new Objeto(pesoActual));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(sc != null) {
				try {
					sc.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}


	public int campeonatoThor(){
		int cantidadCombinaciones = 0;

		for (Personaje p : personajes) {
			for (Objeto o : objetos) {
				if(p.pasaDistancia(o.getPeso(), distObj))
					cantidadCombinaciones++;
			}
		}
		
		return cantidadCombinaciones;
	}
}
