package pseIntBucles;

import java.util.Scanner;

/**
 * DelimitingPower
 */
public class DelimitingPower {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);

        long upperLimit, lowerLimit, intervalSum, outsiderNum, userInput;
        boolean matched;

        matched = false;

        System.out.println("Dime el límite inferior");
        lowerLimit = userScanner.nextLong();
        System.out.println("Dime el límite superior");
        upperLimit = userScanner.nextLong();

        while (lowerLimit > upperLimit) {
            System.out.println("Dame un límite inferior que sea menor que el superior");
            lowerLimit = userScanner.nextLong();
        }

        intervalSum = 0;
        outsiderNum = 0;

        System.out.println("Ve diciéndome números, cuando introduzcas el 0 se para");
        userInput = userScanner.nextLong();
        while (userInput != 0) {
            userInput = userScanner.nextLong();

            if ((userInput > lowerLimit) && (userInput < upperLimit)) {
                intervalSum = intervalSum + userInput;
            }
            if ((userInput < lowerLimit) || (userInput > upperLimit)) {
                outsiderNum = outsiderNum + 1;
            }
            if ((userInput == lowerLimit) || (userInput == upperLimit)) {
                matched = true;
            }
            // if (userInput == 0) {
            //     break;
            // }
        }

        System.out.println("Límite inferior: " + lowerLimit);
        System.out.println("Límite superior: " + upperLimit);
        System.out.println("Suma de los número entre los límites: " + intervalSum);
        System.out.println("Cantidad de números fuera del intervalo: " + outsiderNum);

        if (matched) {
            System.out.println("Has introducido uno o ambos límites en los últimos números");
        }

        userScanner.close();
    }
}
