package main;

public class Main {
	
	public static void main(String[] args) {
        EvaluadorLocal eLocal = new EvaluadorLocal("src/entradas/campeonato_2.txt");
        System.out.println(eLocal.campeonatoThor());
    }
   
}
