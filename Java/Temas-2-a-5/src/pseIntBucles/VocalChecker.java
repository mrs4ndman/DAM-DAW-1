package pseIntBucles;

import java.util.Scanner;

public class VocalChecker {
    public static void main(String[] args) {
        Scanner charInput = new Scanner(System.in);

        String lineInput;
        char checkChar;

        do {
            System.out.println("Dime un caracter y te digo si es vocal o no");
            lineInput = charInput.nextLine();
            checkChar = lineInput.toUpperCase().charAt(0);
            if (checkChar == 'A' || checkChar == 'E' || checkChar == 'I' || checkChar == 'O' || checkChar == 'U') {
                System.out.println("Es vocal");
            } else if (checkChar == ' ' || checkChar == '\t' || checkChar == '\r' || checkChar == '\n'/*  || caracterActual == '\x0b' */) {
                System.out.println("Es espacio");
            } else {
                System.out.println("No es vocal");
            }
        } while (checkChar != ' ');
        charInput.close();
    }
}
