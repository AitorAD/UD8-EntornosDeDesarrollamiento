package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {
    @Test
    public void test_Anyo_1122_devuelve_2() {
        Any any = new Any(1122);
        int esperado = 2;
        assertEquals(esperado, any.digitsDiferents());
    }

    @Test
    public void test_Anyo_1912_devuelve_2() {
        Any any = new Any(1912);
        int esperado = 3;
        assertEquals(esperado, any.digitsDiferents());
    }

    @Test
    public void test_Anyo_1952_devuelve_2() {
        Any any = new Any(1952);
        int esperado = 4;
        assertEquals(esperado, any.digitsDiferents());
    }

    @Test
    public void test_Anyo_1111_devuelve_2() {
        Any any = new Any(1111);
        int esperado = 1;
        assertEquals(esperado, any.digitsDiferents());
    }
}