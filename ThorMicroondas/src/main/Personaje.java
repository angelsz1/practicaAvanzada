package main;

public class Personaje {
	private int altura, fuerza;

	public Personaje(){
		altura = fuerza = 0;
	}
	
	public Personaje(int altura, int fuerza){
		this.altura = altura;
		this.fuerza = fuerza;
	}
	
	public int distanciaTiro(int peso) {
		return (this.altura*this.fuerza)/peso;
	}
	
	public boolean pasaDistancia(int peso, int dist) {
		return distanciaTiro(peso) >= dist;
	}
	
}
