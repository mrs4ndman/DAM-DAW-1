package estructurasAlternativas;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double userBase, userExponent, mathPowNumber;

        System.out.println("Dame un número: ");
        userBase = userInput.nextDouble();

        System.out.println("Dame un número: ");
        userExponent = userInput.nextDouble();

        if (userExponent > 0) {
            mathPowNumber = Math.pow(userBase, userExponent );
            System.out.println("La potencia es " + mathPowNumber);
        } else if (userExponent == 0) {
            mathPowNumber = (int) 1;
            System.out.println("La potencia es " + mathPowNumber);
        } else {
            mathPowNumber = Math.pow(userBase, (int) ( Math.abs(userExponent) ));
            System.out.println("La potencia es 1/" + mathPowNumber);
        }

        userInput.close();
    }
}
