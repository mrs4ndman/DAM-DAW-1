package ejerciciosArrays;

import java.util.Scanner;

public class TripleVector {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[] vector_1 = new int[5];
        int[] vector_2 = new int[5];
        int[] vector_3 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime el número " + (i + 1) + " del vector 1");
            vector_1[i] = userInput.nextInt();
            System.out.println("Dime el número " + (i + 1) + " del vector 2");
            vector_2[i] = userInput.nextInt();
            vector_3[i] = (int)(vector_1[i] + vector_2[i]);
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("V3." + (j + 1) + " → " + vector_3[j]);
        }

        userInput.close();
    }
}
