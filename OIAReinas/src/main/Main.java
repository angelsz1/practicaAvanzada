package main;

import solucion.Tablero;

public class Main {
    public static void main(String[] args) {
        Tablero t = new Tablero("resources/in/reinas2.in");
        System.out.println(t.conflictSolver());
    }
}
