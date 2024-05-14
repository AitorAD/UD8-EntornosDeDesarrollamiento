package es.iesmz.ed.algoritmes;

/**
 * Clase Hyperpar
 * @author Aitor Agullo Duque
 * @version 1.0
 */
public class Hyperpar {
    private long num;

    /**
     * Constructor por defecto
     */
    public Hyperpar(long num) {
        this.num = num;
    }

    /**
     * Getter numero
     * @return
     */
    public long getNum() {
        return num;
    }

    /**
     * Setter numero
     * @param num
     */
    public void setNum(long num) {
        this.num = num;
    }

    /**
     * Comprueba si el numero esta formado solamente por numeros pares.
     * @return Devuelve verdadero en caso de que este formado solo por numeros pares. Devuelve falso si hay algun numero impar.
     */
    public boolean esHyperPar() {
        char[] numerosSeparados = String.valueOf(this.num).toCharArray();

        for (int i = 0; i < numerosSeparados.length; i++) {
            int num = Integer.parseInt(String.valueOf(numerosSeparados[i]));
            if (num % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
