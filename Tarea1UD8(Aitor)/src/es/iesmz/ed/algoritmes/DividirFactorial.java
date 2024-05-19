package es.iesmz.ed.algoritmes;

import java.util.ArrayList;

/**
 * Clase DividirFactorial
 * @author Aitor Agullo Duque
 * @version 1.0
 */
public class DividirFactorial {
    private int numerador;
    private int denominador;

    /**
     * Constructor por al que le un numerador y un denominador
     * @param numerador
     * @param denominador
     */
    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Getter numerador
     * @return Devuelve el numerador
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Setter numerador
     * @param numerador Le pasas un numero entero y lo asigna a la variable numerador
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Getter denominador
     * @return Devuelve el denominador
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Setter denominador
     * @param denominador Le pasas un numero entero y lo asigna a la variable denominador
     */
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    /**
     * Metodo que multiplica la diferencia de numeros entre numerador y denominador
     * @return Devuelve la division de 2 numeros factoriales
     */
    public int divisio() {
        int resultado = 1;
        for (int i = numerador; i > denominador; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
