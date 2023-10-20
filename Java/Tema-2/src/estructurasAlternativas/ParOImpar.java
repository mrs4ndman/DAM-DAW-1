package estructurasAlternativas;

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double userNum;

        System.out.println("Dime un número y te digo si es par o impar");
        userNum = userInput.nextDouble();

        if (userNum % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        userInput.close();
    }
}
