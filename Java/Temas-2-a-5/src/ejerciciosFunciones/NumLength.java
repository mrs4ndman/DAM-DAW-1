package ejerciciosFunciones;

import java.util.Scanner;

public class NumLength {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Dime un número entero positivo y te digo su longitud ↓");
        long numUsuario = userInput.nextLong();
        while (numUsuario < 0) {
            System.out.println("Vuelve a decirme el número ↓");
            numUsuario = userInput.nextLong();
        }
        System.out.println("El número tiene " + LengthMachine(numUsuario) + " dígitos.");

        userInput.close();
    }
    public static int LengthMachine(long num) {
        // String typecastedNum = Long.toString(num);
        // int numLength = typecastedNum.length();
        // return numLength;
        //
        int numLength = 0;
        while (num > 0) {
            numLength++;
            num /= 10;
        }
        return numLength;
    }
}
