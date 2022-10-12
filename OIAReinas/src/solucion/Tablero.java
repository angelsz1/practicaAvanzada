package solucion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import archivos.Archivos;

public class Tablero {
    private List<Reina> reinas = new ArrayList<>();
    private int dimensiones;

    public Tablero(String path){
        String file = Archivos.leer(path);
        String[] words = file.split("[ |\n]+");
        dimensiones = Integer.parseInt(words[0]);

        int i = 2;

        while (i < words.length){
            int f , c;
            f = Integer.parseInt(words[i]);
            i++;
            c = Integer.parseInt(words[i]);
            i++;
            reinas.add(new Reina(f, c));
        }
    }


    public String conflictSolver(){
        int i = 0;
        String result = new String();
        for( Reina r : reinas){
            if(!r.isChoqueDeAbajo())
                chocoAbajo(r, i);
            if(!r.isChoqueDeArriba())
                chocoArriba(r, i);
            if(!r.isChoqueDeDerecha())
                chocoDerecha(r, i);
            if(!r.isChoqueDeIzquierda())
                chocoIzquierda(r, i);
            if(!r.isChoqueDeIzqArr())
                chocoDiagIzqArr(r, i);
            if(!r.isChoqueDeDerArr())
                chocoDiagDerArr(r, i);
            if(!r.isChoqueDeIzqAbj())
                chocoDiagIzqAba(r, i);
            if(!r.isChoqueDeDerAbj())
                chocoDiagDerAba(r, i);

            Collections.sort(r.getConflictos());
            result += r.toStringConflictos();
            if(i < reinas.size() -1)
                result += '\n';
            i++;

        }

        return result;

    }

    public void chocoDerecha(Reina reina, int index){
        int fila = reina.getFila();
        int miC = reina.getColumna();
        int i;

        while(miC <= dimensiones){
            miC++;
            if (( i = hayReina(fila, miC)) != -1){
                reinas.get(i).addConflict((index+1));
                reinas.get(i).setChoqueDeIzquierda(true);
                reina.addConflict((i+1));
                return;
            }
        }
    }

    public void chocoIzquierda(Reina reina, int index){
        int fila = reina.getFila();
        int miC = reina.getColumna();
        int i;

        while(miC >= 1){
            miC--;
            if (( i = hayReina(fila, miC)) != -1){
                reinas.get(i).addConflict((index+1));
                reinas.get(i).setChoqueDeDerecha(true);
                reina.addConflict((i+1));
                return ;
            }
        }

    }

    public void chocoArriba(Reina reina, int index){
        int columna = reina.getColumna();
        int miF = reina.getFila();
        int i;

        while(miF >= 1){
            miF--;
            if (( i = hayReina(miF, columna)) != -1){
                reinas.get(i).addConflict((index+1));
                reinas.get(i).setChoqueDeAbajo(true);
                reina.addConflict((i+1));
                return;
            }
        }

    }

    public void chocoAbajo(Reina reina, int index){
        int columna = reina.getColumna();
        int miF = reina.getFila();
        int i;

        while(miF <= dimensiones){
            miF++;
            if (( i = hayReina(miF, columna)) != -1){
                reinas.get(i).addConflict((index+1));
                reinas.get(i).setChoqueDeArriba(true);
                reina.addConflict((i+1));
                return;
            }
        }

    }

    public void chocoDiagDerArr(Reina reina, int index){
        int miF = reina.getFila();
        int miC = reina.getColumna();
        int i;

        while(miF >= 1 && miC <= dimensiones){
            miF--;
            miC++;
            if (( i = hayReina(miF, miC)) != -1){
                reinas.get(i).addConflict((index+1));
                reinas.get(i).setChoqueDeIzqAbj(true);
                reina.addConflict((i+1));
                return;
            }
        }

    }

    public void chocoDiagDerAba(Reina reina, int index){
        int miF = reina.getFila();
        int miC = reina.getColumna();
        int i;

        while(miF <= dimensiones && miC <= dimensiones){
            miF++;
            miC++;
            if (( i = hayReina(miF, miC)) != -1){
                reinas.get(i).addConflict((index+1));
                reinas.get(i).setChoqueDeIzqArr(true);
                reina.addConflict((i+1));
                return;
            }
        }
    }

    public void chocoDiagIzqArr(Reina reina, int index){
        int miF = reina.getFila();
        int miC = reina.getColumna();
        int i;

        while(miF >= 1 && miC >= 1){
            miF--;
            miC--;
            if (( i = hayReina(miF, miC)) != -1){
                reinas.get(i).addConflict((index+1));
                reinas.get(i).setChoqueDeDerAbj(true);
                reina.addConflict((i+1));
                return;
            }
        }

    }

    public void chocoDiagIzqAba(Reina reina, int index){
        int miF = reina.getFila();
        int miC = reina.getColumna();
        int i;

        while(miF <= dimensiones && miC >= 1){
            miF++;
            miC--;
            if (( i = hayReina(miF, miC)) != -1){
                reinas.get(i).addConflict((index+1));
                reinas.get(i).setChoqueDeDerArr(true);
                reina.addConflict((i+1));
                return;
            }
        }
    }







    public int hayReina(int fila, int columna){
        int index = 0;

        while(index < reinas.size()){
            if(fila == reinas.get(index).getFila() && columna == reinas.get(index).getColumna())
                return index;
            index++;
        }
        return -1;

    }

}
