package pseIntSecuenciales;

import java.util.Scanner;

public class CalculoCalificaciones {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double parcial1, parcial2, parcial3, promedioParciales, examenFinal, trabajoFinal, notaFinal;

        System.out.println("Dime la nota de tu primer parcial");
        parcial1 = userInput.nextDouble();

        System.out.println("Dime la nota de tu segundo parcial");
        parcial2 = userInput.nextDouble();

        System.out.println("Dime la nota de tu tercer parcial");
        parcial3 = userInput.nextDouble();

        promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        System.out.println("Dime la nota de tu examen final");
        examenFinal = userInput.nextDouble();

        System.out.println("Dime la nota de tu trabajo final");
        trabajoFinal = userInput.nextDouble();

        examenFinal = examenFinal * 0.30;
        trabajoFinal = trabajoFinal * 0.15;

        promedioParciales = promedioParciales * 0.55;

        notaFinal = promedioParciales + examenFinal + trabajoFinal;

        System.out.println("Tu nota final es " + notaFinal);

        userInput.close();
    }
}
