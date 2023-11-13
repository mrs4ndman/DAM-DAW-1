package pseIntCondicionales;

import java.util.Scanner;

public class PosNegNull {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        float numAComprobar;

        System.out.println("Dime un número");
        numAComprobar = numInput.nextFloat();

        if (numAComprobar > 0) {
            System.out.println("El numero " + (int) numAComprobar + " es positivo");
        } else if (numAComprobar < 0) {
            System.out.println("El numero " + (int) numAComprobar + " es negativo");
        } else {
            System.out.println("El numero " + (int) numAComprobar + " es nulo");
        }

        numInput.close();
    }
}
