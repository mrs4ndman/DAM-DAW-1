package pseIntBucles;

import java.util.Scanner;

/**
 * MaquinaPares
 */
public class MaquinaPares {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);

        int userInput1, bigger, userInput2, numToCheck;

        System.out.println("Introduce el primer número: ");
        userInput1 = userScanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        userInput2 = userScanner.nextInt();

        if (userInput1 > userInput2) {
            bigger = userInput1;
        } else {
            bigger = userInput2;
        }

        numToCheck = 0;

        while (numToCheck < bigger) {
            if (numToCheck % 2 == 0) {
                System.out.println("Par: " + numToCheck);
                numToCheck += 1;
            } else {
                numToCheck += 1;
            }
        }

        userScanner.close();
    }
}
