package pseIntBucles;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AdivinadorNumeros {
    public int GetRandomRangedNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        int rand, userInput, tryCounter;
        int min = 0, max = 99;

        rand = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println("Dime un primer número, a ver si adivinas");
        userInput = numInput.nextInt();

        if (userInput > rand) {
            System.out.println("Estás por encima del aleatorio");
        }
        if (userInput < rand) {
            System.out.println("Estás por debajo del aleatorio");
        }
        tryCounter = 1;

        while (userInput != rand && tryCounter <= 10) {
            tryCounter += 1;
            System.out.println("Dime otro número");
            userInput = numInput.nextInt();

            if (userInput > rand) {
                System.out.println("Estás por encima del aleatorio");
            }
            if (userInput < rand) {
                System.out.println("Estás por debajo del aleatorio");
            }
        }

        if (userInput == rand) {
            System.out.println("¡Lo conseguiste!");
        } else {
            System.out.println("El número aleatorio era " + rand);
            System.out.println("Agotaste tus intentos, vuelve a empezar");
        }

        // System.out.println(rand);

        numInput.close();
    }

}
