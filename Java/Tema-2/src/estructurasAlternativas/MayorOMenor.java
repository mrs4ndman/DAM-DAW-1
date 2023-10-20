package estructurasAlternativas;

import java.util.Scanner;

public class MayorOMenor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        long userNum1, userNum2;

        System.out.println("Dime el primer número:");
        userNum1 = userInput.nextLong();

        System.out.println("Dime el primer número:");
        userNum2 = userInput.nextLong();

        if (userNum1 > userNum2) {
            System.out.println("El primer número es mayor que el segundo");
        } else if (userNum1 == userNum2 ) {
            
            System.out.println("El primer número es igual que el segundo");
        } else {
            System.out.println("El primer número es menor que el segundo");
        }

        userInput.close();
    }
}
