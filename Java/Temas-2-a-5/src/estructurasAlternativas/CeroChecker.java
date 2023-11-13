package estructurasAlternativas;

import java.util.Scanner;

public class CeroChecker {
    public static void main(String[] args) {
        Scanner inputter = new Scanner(System.in);

        double num1, num2, resultadoDivision;

        System.out.println("Dime el primer número para la división");
        num1 = inputter.nextDouble();

        System.out.println("Dime el segundo número para la división");
        num2 = inputter.nextDouble();

        if (num2 != 0) {
            resultadoDivision = num1 / num2;
            System.out.println("El resultado de la división es " + resultadoDivision);
        } else {
            System.out.println("No puedo dividir entre cero :)");
        }

        inputter.close();
    }
}
