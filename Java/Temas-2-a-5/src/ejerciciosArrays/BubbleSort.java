package ejerciciosArrays;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int arrLength;
        long aux;

        System.out.println("Dime la longitud del array");
        arrLength = userInput.nextInt();

        long randArr[] = new long[arrLength];
        for (int k = 0; k < arrLength; k++) {
            randArr[k] = (long) ((Math.random() * arrLength) + 1);
            System.out.println(randArr[k]);
        }

        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < (arrLength - i - 1); j++) {
                if (randArr[j] > randArr[j + 1]) {
                    aux = randArr[j];
                    randArr[j] = randArr[j + 1];
                    randArr[j + 1] = aux;
                }
            }
        }
        System.out.println("_");
        for (int l = 0; l < arrLength; l++) {
            System.out.println(randArr[l]);
        }
        userInput.close();
    }
}
