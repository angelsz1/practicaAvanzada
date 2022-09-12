package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		HashMapas();
		
	}
	
	public static void ConjuntoTree() {
		Set<String> conjunto = new TreeSet<String>();
		
		//agrego
		conjunto.add("hola");
		conjunto.add("chau");
		conjunto.add("Hola");
		conjunto.add("Chau");
		System.out.println(conjunto);
		
		//insertar
		//lista.add(5, 9999); //no tiene orden
		
		System.out.println(conjunto);
		
		//eliminar
		
		conjunto.remove("Hola");
		
		System.out.println(conjunto);
		
		//buscar
		
		//System.out.println("Indice del 9999 = " + lista.indexOf(9999)); //no tiene orden
		
		System.out.println(conjunto);
		
		//recorrer
		for(String in : conjunto) 
			System.out.print(in + "-");
		System.out.println();
		
		//imprimir
		System.out.println(conjunto);
		
		
		//vacio
		
		System.out.println(conjunto.isEmpty()? "Esta vacio." : "No esta vacio");
		
		//esta?
		
		System.out.println(conjunto.contains("HOLA")? "HOLA esta" : "HOLA no esta");
		
		//tamanio
		
		System.out.println("Tamanio de la lista = " + conjunto.size());
		
		//vaciar
		conjunto.clear();
		//vacio
		System.out.println("Vacio la lista...");
		System.out.println(conjunto.isEmpty()? "Esta vacio." : "No esta vacio");
		
		
		
	}
	
	
	public static void Conjunto() {
		Set<Integer> lista = new HashSet<Integer>();
		
		//agrego
		for(int i = 0; i < 10; i++)
			lista.add(i);
		System.out.println(lista);
		
		//insertar
		//lista.add(5, 9999); //no tiene orden
		
		System.out.println(lista);
		
		//eliminar
		
		lista.remove(0);
		
		System.out.println(lista);
		
		//buscar
		
		//System.out.println("Indice del 9999 = " + lista.indexOf(9999)); //no tiene orden
		
		System.out.println(lista);
		
		//recorrer
		for(Integer in : lista) 
			System.out.print(in + "-");
		System.out.println();
		
		//imprimir
		System.out.println(lista);
		
		
		//vacio
		
		System.out.println(lista.isEmpty()? "Esta vacio." : "No esta vacio");
		
		//esta?
		
		System.out.println(lista.contains(4)? "El 4 esta" : "El 4 no esta");
		
		//tamanio
		
		System.out.println("Tamanio de la lista = " + lista.size());
		
		//vaciar
		lista.clear();
		//vacio
		System.out.println("Vacio la lista...");
		System.out.println(lista.isEmpty()? "Esta vacio." : "No esta vacio");
		
		
		
	}
	
	
	
	
	public static void Listas() {
		List<Integer> lista = new ArrayList<Integer>();
		
		//agrego
		for(int i = 0; i < 10; i++)
			lista.add(i);
		System.out.println(lista);
		
		//insertar
		lista.add(5, 9999);
		
		System.out.println(lista);
		
		//eliminar
		
		lista.remove(0);
		
		System.out.println(lista);
		
		//buscar
		
		System.out.println("Indice del 9999 = " + lista.indexOf(9999));
		
		System.out.println(lista);
		
		//recorrer
		for(Integer in : lista) 
			System.out.print(in + "-");
		System.out.println();
		
		//imprimir
		System.out.println(lista);
		
		
		//vacio
		
		System.out.println(lista.isEmpty()? "Esta vacio." : "No esta vacio");
		
		//esta?
		
		System.out.println(lista.contains(4)? "El 4 esta" : "El 4 no esta");
		
		//tamanio
		
		System.out.println("Tamanio de la lista = " + lista.size());
		
		//vaciar
		lista.clear();
		//vacio
		System.out.println("Vacio la lista...");
		System.out.println(lista.isEmpty()? "Esta vacio." : "No esta vacio");
		
		
	}
	
	
	
	public static void HashMapas() {
		
		Map<Integer, String> mapita = new HashMap<Integer,String> ();
		
		mapita.put(1, "Angel");
		mapita.put(2, "Victor");
		mapita.put(3, "Facu");
		mapita.put(4, "Lucas");
		
		System.out.println(mapita);
		
		System.out.println(mapita.get(1));
		
		for(Integer i : mapita.keySet()) 
			System.out.println("Clave = " + i + ", Valor = " + mapita.get(i));
		
		System.out.println("Tamanio = " + mapita.size());
		
		System.out.println(mapita.entrySet());
		
		
	}
	
}
//System.err.println para mostrar cosas como errores.

