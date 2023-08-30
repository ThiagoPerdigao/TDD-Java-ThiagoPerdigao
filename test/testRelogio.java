package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.Relogio;

public class testRelogio {
    @Test
    public void testAjustarHora() {
        Relogio relogio = new Relogio(20, 10, 30);

        relogio.acertaHora(14, 30, 15);
        
        assertEquals(14, relogio.getHora());
        assertEquals(30, relogio.getMinuto());
        assertEquals(15, relogio.getSegundo());
    }

    @Test
    public void testMeiaNoite() {

        Relogio relogio = new Relogio(10, 30, 20);

        relogio.reiniciarParaMeiaNoite();

        assertEquals(0, relogio.getHora());
        assertEquals(0, relogio.getMinuto());
        assertEquals(0, relogio.getSegundo());
    }

    @Test
    public void testMarcarIntervalo() {
        Relogio relogio = new Relogio(0, 0, 0);

        relogio.marcarIntervalo(10, 0, 0, 12, 30, 15);

        assertEquals(2, relogio.getHora());
        assertEquals(30, relogio.getMinuto());
        assertEquals(15, relogio.getSegundo());
    }

    @Test
    public void testImprimirHora() {
        Relogio relogio = new Relogio(10, 20, 30);

        String horaFormatada = relogio.imprimirHora(true);

        assertEquals("10:20:30", horaFormatada);
    }

}