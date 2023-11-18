package ejerciciosStrings;

import java.util.Scanner;

public class MetodoEspejo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Dime una string y te doy el espejo");
        String userStr = userInput.nextLine();
        System.out.println("String espejo → " + espejoMagico(userStr));
        System.out.println("También comprobamos si es palíndromo");
        if (esPalindromo(espejoMagico(userStr))) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Nope");
        }

        userInput.close();
    }
    public static String espejoMagico(String normal_string) {
        String rev_string = "";
        String espejoString = "";
        for (int t = 0; t < normal_string.length(); t++) {
            rev_string += normal_string.charAt(normal_string.length() - 1 - t);
        }
        espejoString = normal_string + rev_string.substring(1);

        return espejoString;
    }
    public static boolean esPalindromo(String user_word) {
        user_word = user_word.replaceAll("\\s", "");
        int str_length = user_word.length();
        String h1, h2, h2rev = "";
        if (str_length % 2 == 0) {
            h1 = user_word.substring(0, Math.round((str_length / 2)));
            h2 = user_word.substring(Math.round((str_length / 2)));
            for (int t = 0; t < h2.length(); t++) {
                h2rev += h2.charAt(h2.length() - 1 - t);
            }
            if (h1.equals(h2rev)) {
                return true;
            } else {
                return false;
            }
        } else {
            boolean palind = true;
            for (int i = 0; i < str_length; i++) {
                if (user_word.charAt(i) != user_word.charAt(str_length - 1 - i)) {
                    palind = false;
                    break;
                }
            }
            return palind;
        }
    }
}
