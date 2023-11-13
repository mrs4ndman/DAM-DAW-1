package ejerciciosFunciones;

import java.util.Scanner;

public class SumaReales {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double numero1, numero2;
        numero1 = userInput.nextDouble();
        numero2 = userInput.nextDouble();

        ModuloSumaDoubles(numero1, numero2);

        userInput.close();
    }
    public static void ModuloSumaDoubles(double a, double b) {
        System.out.println("Resultado → " + (double)(a + b));
    }
}
