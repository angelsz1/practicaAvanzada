package solucion;

public class Animal {
	private String nombre;
	private int agresividad;
	
	
	public Animal(String nombre, int agresividad) {
		super();
		this.nombre = nombre;
		this.agresividad = agresividad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAgresividad() {
		return agresividad;
	}
	public void setAgresividad(int agresividad) {
		this.agresividad = agresividad;
	}
	
	@Override
	public String toString() {
		return "[Nombre = " + nombre + ", Agresividad = " + agresividad + "]";
	}
	
	
}
