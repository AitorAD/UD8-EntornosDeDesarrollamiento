package es.iesmz.ed.algoritmes;

import java.util.HashMap;

/**
 * Clase Any
 * @author Aitor Agullo Duque
 * @version 1.0
 */
public class Any {
    private long any;

    /**
     * Constructor por al que le pasas un año
     * @param any
     */
    public Any(long any) {
        this.any = any;
    }

    /**
     * Getter any
     * @return Devuelve el año
     */
    public long getAny() {
        return any;
    }

    /**
     * Setter any
     * @param any Le pasas un año
     */
    public void setAny(long any) {
        this.any = any;
    }

    /**
     * Almacena el numero de veces que aparece un numero en el año.
     * @return Devuelve la cantidad de numeros distintos
     */
    public int digitsDiferents() {
        HashMap<String, Integer> numeros = new HashMap();
        char[] anyo = String.valueOf(this.any).toCharArray();

        for (int i = 0; i < anyo.length; i++) {
            String numActual = String.valueOf(anyo[i]);
            numeros.put(numActual, 1 + numeros.getOrDefault(numActual, 0));
        }
        return numeros.size();
    }
}