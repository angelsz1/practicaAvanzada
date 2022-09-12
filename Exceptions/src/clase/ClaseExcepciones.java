package clase;

import java.io.IOException;

public class ClaseExcepciones {
	public static void main(String[] args) {
		try{
			archivo();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void archivo() throws IOException{
		throw new IOException("El archivo no pudo ser encontrado");
	}
}
