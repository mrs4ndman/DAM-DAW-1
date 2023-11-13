package ejerciciosFunciones;

import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        long pepe;
        pepe = 0;

        while (pepe != 666) {
            System.out.println("Dime el número (si metes 666 el ciclo se acaba)");
            pepe = userInput.nextLong();
            if (pepe != 666) {
                System.out.println("El número en binario es " + BinaryConverter(pepe));
            } else {
                System.out.println("Se acabó ;)");
            }
        }
        userInput.close();
    }
    public static String BinaryConverter(long num) {
        if (num == 0) {
            return "0";
        }
        String digito, binarizado = "";
        while (num > 0) {
            if (num % 2 == 1) {
                digito = "1";
            } else {
                digito = "0";
            }
            binarizado = digito + binarizado;
            num = num / 2;
        }

        return binarizado;
    }
}
