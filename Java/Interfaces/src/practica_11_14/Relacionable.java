package practica_11_14;

public interface Relacionable {
    /** Devuelve verdadero si a es mayor que b */
    boolean esMayor(Figura b);
    /** Devuelve verdadero si a es menor que b */
    boolean esMenor(Figura b);
    /** Devuelve verdadero si a es igual a b */
    boolean esIgual(Figura b);
}
