package ejemplo.javadoc;

/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar,
 * etc.
 *
 * @author Jamilett Samperio
 * @version 1.0
 *
 */
public class Aritmetica {

    /**
     * Primer y Segundo operando
     */
    // No es muy común documentar los atributos, ya que JavaDoc solo muestra la doc de los metodos, pero podemos hacerlo
    int operandoA;
    int operandoB;

    /**
     * Constructor vacio de la Clase
     */
    // Se recomienda NO usar acentos ni caracteres especiales (ñ)
    public Aritmetica() {

    }

    /**
     * Constructor con dos argumentos de tipo int
     *
     * @param operandoA
     * @param operandoB
     */
    public Aritmetica(int operandoA, int operandoB) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }

    /**
     * Este metodo regresa la suma de dos operandos enteros
     *
     * @return int resultado de la suma
     */
    public int sumar() {
        return operandoA + operandoB;
    }

}
