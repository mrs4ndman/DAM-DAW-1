package ejerciciosExamen;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int min = userInput.nextInt();
        int max = userInput.nextInt();

        for (int i = min; i < max; i++) {
            int count = 0;
            for (int j = 4; j < max; j++) {
                count++;
            }
            System.out.println(count);
        }


        userInput.close();
    }
}
