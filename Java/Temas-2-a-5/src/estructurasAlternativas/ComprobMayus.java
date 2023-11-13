package estructurasAlternativas;

import java.util.Scanner;

public class ComprobMayus {
    public static void main(String[] args) {
        Scanner inputForStrings = new Scanner(System.in);

        String normalString, upperCaseString;

        System.out.println("Dime tu palabra y te digo si está en mayúsculas o no");
        normalString = inputForStrings.nextLine();

        upperCaseString = normalString.toUpperCase();

        if (normalString != upperCaseString) {
            System.out.println("Tu palabra no está entera en mayúsculas");
        } else {
            System.out.println("Tu palabra ("+ normalString + ") está entera en mayúsculas");
        }

        inputForStrings.close();
    }
}
