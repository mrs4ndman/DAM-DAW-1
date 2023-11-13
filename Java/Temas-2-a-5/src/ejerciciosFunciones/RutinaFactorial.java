package ejerciciosFunciones;

import java.util.Scanner;

public class RutinaFactorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        long numAOperar;

        System.out.println("Dime el número a factorizar ↓");
        numAOperar = userInput.nextLong();

        System.out.println("Número factorizado: " + Factorizado(numAOperar));

        userInput.close();
    }
    public static long Factorizado(long a) {
        long acumulator = 1;
        for (int i = 1; i < (a + 1); i++) {
            acumulator *= i;
        }
        return acumulator;
    }
}
