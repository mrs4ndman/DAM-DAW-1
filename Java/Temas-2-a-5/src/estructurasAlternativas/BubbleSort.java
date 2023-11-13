package estructurasAlternativas;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        long userNum1, userNum2, userNum3, numHolder;

        System.out.println("Dime el primer número:");
        userNum1 = userInput.nextLong();

        System.out.println("Dime el segundo número:");
        userNum2 = userInput.nextLong();

        System.out.println("Dime el tercer número:");
        userNum3 = userInput.nextLong();

        if (userNum1 > userNum2) {
            numHolder = userNum2;
            userNum2 = userNum1;
            userNum1 = numHolder;
        }

        if (userNum1 > userNum3) {
            numHolder = userNum3;
            userNum3 = userNum1;
            userNum1 = numHolder;
        }

        if (userNum2 > userNum3) {
            numHolder = userNum3;
            userNum3 = userNum2;
            userNum2 = numHolder;
        }

        System.out.println("1 -> " + userNum1);
        System.out.println("2 -> " + userNum2);
        System.out.println("3 -> " + userNum3);

        userInput.close();
    }
}
