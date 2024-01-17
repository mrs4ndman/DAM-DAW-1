package retoJava;

import java.util.Scanner;

public class FraccionFact {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n;
        double sum;
        System.out.println("Dime el número N");
        n = userInput.nextInt();

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) 1 /(double) factorial(i);
        }

        System.out.println(sum);
        userInput.close();
    }
    public static int factorial(int input) {

        if (input == 0) {
            return 1;
        } else {
            input = input * factorial(input - 1);
        }
        return input;
    }
}
