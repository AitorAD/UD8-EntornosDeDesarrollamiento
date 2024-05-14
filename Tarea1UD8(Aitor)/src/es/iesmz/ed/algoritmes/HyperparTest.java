package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

    @Test
    public void tests_ElNumero_24680_es_HYPERPAR() {
        Hyperpar hp = new Hyperpar(24680);
        boolean esperado = true;
        assertEquals(esperado, hp.esHyperPar());
    }

    @Test
    public void tests_ElNumero_2568_noEs_HYPERPAR() {
        Hyperpar hp = new Hyperpar(2568);
        boolean esperado = false;
        assertEquals(esperado, hp.esHyperPar());
    }
}