package ejerciciosStrings;

import java.util.Scanner;

public class CadenaGuiones2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Dime una cadena y te coloco guiones entre cada letra");
        String user_word = userInput.nextLine();
        System.out.println(insertarGuionesCadena2(user_word));

        userInput.close();
    }
    public static String insertarGuionesCadena2(String in) {
        if (in == null || in.length() == 1) {
            return null;
        }
        char[] c = new char[2 * (in.length())];
        for (int i = 0; i < (in.length() - 1); i += 2) {
            c[i] = in.charAt(i);
            c[i + 1] = '-';
        }
        return new String(c);
    }
}
