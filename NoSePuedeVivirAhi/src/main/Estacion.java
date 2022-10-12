package main;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
	private List<Medicion> mediciones = new ArrayList<>();
	private int tempMasMinima = 100;// para saber si llego algo o no
	private int tempMasMaxima = 100;// ""     ""       ""       ""
	private int masHostilQue = 0;
	private int noMePudeCompararCon = 0;
	
	public void addMedicion(Medicion m) {
		if(tempMasMaxima == 100 && tempMasMinima == 100) {
			tempMasMaxima = m.getMax();
			tempMasMinima = m.getMin();
		}else {
			if(tempMasMaxima < m.getMax()) 
				tempMasMaxima = m.getMax();
			if(tempMasMinima > m.getMin()) 
				tempMasMinima = m.getMin();
		}
		mediciones.add(m);
	}
	
	public int getHostilidades() {
		return masHostilQue;
	}
	
	public int getNoComparaciones() {
		return noMePudeCompararCon;
	}
	
	
	public Medicion getMinMax() {
		return new Medicion(tempMasMinima, tempMasMaxima);
	}
	
	
	public void compare(Estacion e) {
		Medicion miMinMax = this.getMinMax();
		Medicion eMinMax = e.getMinMax();
		
		
		if(miMinMax.sePuedeComparar(eMinMax)) {
			switch(miMinMax.compare(eMinMax)) {
			case 1:
				this.masHostilQue++;
				break;
			case -1:
				e.masHostilQue++;
				break;
			}
		}
		else {
			e.noMePudeCompararCon++;
			this.noMePudeCompararCon++;
		}
	}
}
