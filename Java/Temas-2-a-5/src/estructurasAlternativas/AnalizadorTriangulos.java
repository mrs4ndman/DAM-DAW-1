package estructurasAlternativas;

import java.util.Scanner;

public class AnalizadorTriangulos {
    public static void main(String[] args) {
        Scanner sideInput = new Scanner(System.in);

        double ladoA, ladoB, ladoC, numHolder;

        System.out.println("Dime la longitud del lado A:");
        ladoA = sideInput.nextDouble();

        System.out.println("Dime la longitud del lado B:");
        ladoB = sideInput.nextDouble();

        System.out.println("Dime la longitud del lado C:");
        ladoC = sideInput.nextDouble();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Es un triangulo equilátero");
        } else if (ladoA == ladoB || ladoB == ladoC) {
            System.out.println("Es un triangulo isósceles");
        } else if (ladoA != ladoB && ladoB != ladoC) {
            System.out.println("Es un triangulo escaleno");
        }

        if (ladoA > ladoB) {
            numHolder = ladoB;
            ladoB = ladoA;
            ladoA = numHolder;
        }

        if (ladoA > ladoC) {
            numHolder = ladoC;
            ladoC = ladoA;
            ladoA = numHolder;
        }

        if (ladoB > ladoC) {
            numHolder = ladoC;
            ladoC = ladoB;
            ladoB = numHolder;
        }
        // System.out.println(ladoB);

        if (ladoC == Math.sqrt(Math.pow(ladoB, 2) + Math.pow(ladoA, 2)) ) {
            System.out.println("Es un triangulo rectangulo");
        }

        sideInput.close();
    }
}
