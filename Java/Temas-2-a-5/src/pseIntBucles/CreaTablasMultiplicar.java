package pseIntBucles;

import java.util.Scanner;

public class CreaTablasMultiplicar {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        long userNumber;

        System.out.println("Dame un número y te doy su tabla de multiplicar");
        userNumber = numInput.nextLong();
        System.out.println("");

        for (long i = 0; i < 10; i++ ) {
            System.out.println((userNumber) + " x " + (i + 1) + " = " + ((i + 1) * userNumber));
        }

        numInput.close();
    }
}
