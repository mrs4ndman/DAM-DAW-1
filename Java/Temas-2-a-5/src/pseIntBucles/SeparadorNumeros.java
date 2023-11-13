package pseIntBucles;

import java.util.Scanner;

public class SeparadorNumeros {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double userNum;
        int contadorIguales = 0, contadorMayores = 0, contadorMenores = 0, contadorInputs = 10;

        do {
            System.out.println("Dime un número");
            userNum = userInput.nextDouble();

            if (userNum > 0) {
                contadorMayores++;
            }
            if (userNum < 0) {
                contadorMenores++;
            }
            if (userNum == 0) {
                contadorIguales++;
            }
            contadorInputs--;
        } while (contadorInputs > 0);

        System.out.println("Me has dado " + contadorIguales + " números iguales a 0, " + contadorMayores + " mayores que 0 y " + contadorMenores  + " menores que 0");

        userInput.close();
    }
}
