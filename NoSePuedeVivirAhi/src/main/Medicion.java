package main;

public class Medicion {
	private int max;
	private int min;
	
	public Medicion(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean sePuedeComparar(Medicion otraMedicion) {
		return (this.max >= otraMedicion.max && this.min <= otraMedicion.getMin()) || (this.max <= otraMedicion.max && this.min >= otraMedicion.getMin());
	}
	
	public int compare(Medicion m) {
		if(this.max == m.max && this.min == m.min)
			return 0;
		else if(this.max >= m.max && this.min <= m.min)
			return 1;
		else
			return -1;
		
	}
	
	
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
}
