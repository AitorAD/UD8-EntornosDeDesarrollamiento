package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {
    @Test
    public void testDividirFactorial_numerador_5_denominador_3() {
        DividirFactorial df = new DividirFactorial(5,3);
        int esperado = 20;
        assertEquals(esperado, df.divisio());
    }

    @Test
    public void testDividirFactorial_numerador_10_denominador_8() {
        DividirFactorial df = new DividirFactorial(10,8);
        int esperado = 90;
        assertEquals(esperado, df.divisio());
    }

    @Test
    public void testDividirFactorial_numerador_8_denominador_10() {
        DividirFactorial df = new DividirFactorial(8,10);
        int esperado = 1;
        assertEquals(esperado, df.divisio());
    }

    @Test
    public void testDividirFactorial_numerador_8_denominador_8() {
        DividirFactorial df = new DividirFactorial(8,8);
        int esperado = 1;
        assertEquals(esperado, df.divisio());
    }
}