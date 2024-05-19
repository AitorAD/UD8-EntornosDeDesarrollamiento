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
}