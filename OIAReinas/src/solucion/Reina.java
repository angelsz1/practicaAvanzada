package solucion;

import java.util.ArrayList;
import java.util.List;

public class Reina {
    private int fila;
    private int columna;
    private boolean choqueDeArriba = false;
    private boolean choqueDeAbajo = false;
    private boolean choqueDeIzquierda = false;
    private boolean choqueDeDerecha = false;
    private boolean choqueDeIzqArr = false;
    private boolean choqueDeDerArr = false;
    private boolean choqueDeIzqAbj = false;
    private boolean choqueDeDerAbj = false;



    private List<Integer> conflictos = new ArrayList<>();

    public Reina(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    //setters/getters
    public List<Integer> getConflictos() {
        return conflictos;
    }
    public int getColumna() {
        return columna;
    }
    public int getFila() {
        return fila;
    }
    public void setColumna(int columna) {
        this.columna = columna;
    }
    public void setConflictos(List<Integer> conflictos) {
        this.conflictos = conflictos;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public void addConflict(int number){
        conflictos.add(number);
    }

    public void setChoqueDeAbajo(boolean choqueDeAbajo) {
        this.choqueDeAbajo = choqueDeAbajo;
    }
    public void setChoqueDeArriba(boolean choqueDeArriba) {
        this.choqueDeArriba = choqueDeArriba;
    }
    public void setChoqueDeDerecha(boolean choqueDeDerecha) {
        this.choqueDeDerecha = choqueDeDerecha;
    }
    public void setChoqueDeIzquierda(boolean choqueDeIzquierda) {
        this.choqueDeIzquierda = choqueDeIzquierda;
    }
    public void setChoqueDeDerAbj(boolean choqueDeDerAbj) {
        this.choqueDeDerAbj = choqueDeDerAbj;
    }
    public void setChoqueDeDerArr(boolean choqueDeDerArr) {
        this.choqueDeDerArr = choqueDeDerArr;
    }
    public void setChoqueDeIzqAbj(boolean choqueDeIzqAbj) {
        this.choqueDeIzqAbj = choqueDeIzqAbj;
    }
    public void setChoqueDeIzqArr(boolean choqueDeIzqArr) {
        this.choqueDeIzqArr = choqueDeIzqArr;
    }
    public boolean isChoqueDeAbajo() {
        return choqueDeAbajo;
    }
    public boolean isChoqueDeArriba() {
        return choqueDeArriba;
    }
    public boolean isChoqueDeDerecha() {
        return choqueDeDerecha;
    }
    public boolean isChoqueDeIzquierda() {
        return choqueDeIzquierda;
    }
    public boolean isChoqueDeDerAbj() {
        return choqueDeDerAbj;
    }
    public boolean isChoqueDeDerArr() {
        return choqueDeDerArr;
    }
    public boolean isChoqueDeIzqAbj() {
        return choqueDeIzqAbj;
    }
    public boolean isChoqueDeIzqArr() {
        return choqueDeIzqArr;
    }

    @Override
    public String toString(){
        return "Fila: " + fila + " Columna: " + columna;
    }

    public String toStringConflictos(){
        String s = String.valueOf(conflictos.size()) ;

        for (Integer integer : conflictos) {
            s += " " + integer;
        }
        return s;
    }

}
