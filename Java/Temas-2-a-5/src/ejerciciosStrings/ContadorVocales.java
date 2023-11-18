package ejerciciosStrings;

import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Dime una palabra y te cuento las vocales");
        String palabraUsuario = userInput.nextLine();

        System.out.println("Hay " + contarVocales(palabraUsuario) +
                           " vocal(es) en la palabra.");

        userInput.close();
    }
    public static int contarVocales(String input) {
        int vocal_count = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
            case 'a', 'e', 'i', 'o', 'u':
                vocal_count += 1;
                break;
            default:
                break;
            }
        }

        return vocal_count;
    }
}
