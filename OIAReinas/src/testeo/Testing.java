package testeo;

import org.junit.Assert;
import org.junit.Test;

import archivos.Archivos;
import solucion.Tablero;

public class Testing {
    @Test
    public void testeoDefault(){
        String expectedString = Archivos.leer("resources/expected/reinas_e.out");

        Tablero t = new Tablero("resources/in/reinas.in");

        Assert.assertEquals(expectedString, t.conflictSolver());
    }


    @Test
    public void testeoEjemploOIA(){
        String expectedString = Archivos.leer("resources/expected/reinas2_e.out");

        Tablero t = new Tablero("resources/in/reinas2.in");

        Assert.assertEquals(expectedString, t.conflictSolver());
    }


    @Test
    public void testeoMiEjemplo(){
        String expectedString = Archivos.leer("resources/expected/reinas3_e.out");

        Tablero t = new Tablero("resources/in/reinas3.in");

        Assert.assertEquals(expectedString, t.conflictSolver());
    }
}
