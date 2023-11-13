package retoJava;

import java.util.Scanner;

public class CalculadoraDNI {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int dni_sin_letra = 0;
        char[] tabla_letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        while (Integer.toString(dni_sin_letra).length() < 8) {
            System.out.println("Dime el número del DNi y te digo el DNI con la letra");
            dni_sin_letra = userInput.nextInt();
        }

        int resto = (int) dni_sin_letra % 23; 
        String resultado = Integer.toString(dni_sin_letra);
        System.out.println("DNI con letra →" + resultado + tabla_letras[resto]);

        userInput.close();
    }
}
