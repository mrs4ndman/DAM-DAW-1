package practicasClase;

public class AsignacionVariables {
    public static void main(String[] args) {
        // Definimos las variables
        int a = 5, b = 0, c;

        b = a * 3; // Se cambia el valor de b de 0 a 15
        c = a; // Se guarda el valor de a en c, que se inicializó sin valor
        a = a + 6; // se suma 6 a "a", que ahora vale 11.

        b = a - c; // b ahora vale la diferencia de a (11 como último valor) y c (5) = 6
        
        System.out.println("La variable a contiene: " + a);
        System.out.println("La variable b contiene: " + b);
        System.out.println("La variable c contiene: " + c);

        // Output:
        /* Se muestra lo siguiente:
         * La variable a contiene: 11
         * La variable b contiene: 6
         * La variable c contiene: 5
         * */
    }
}
