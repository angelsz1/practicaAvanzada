package clase;

public class Circulo {
	private double radio;
			
	public Circulo(double radio) throws radioNegativoException{
		
	}
	
	public void setRadio(double radio) {
		if(radio < 0)
			throw new radioNegativoException("El radio no puede ser negativo");
		else
			this.radio = radio;
	}
}
