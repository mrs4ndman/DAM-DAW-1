package ejerciciosStrings;

import java.util.Scanner;

public class CadenaGuiones {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Dime una cadena y te coloco guiones entre cada letra");
        String user_word = userInput.nextLine();
        System.out.println(insertarGuionesCadena(user_word));

        userInput.close();
    }
    public static String insertarGuionesCadena(String in) {
        if (in == null || in.length() == 1) {
            return null;
        }
        String c = Character.toString(in.charAt(0));
        for (int i = 1; i < in.length(); i++) {
            if (in.charAt(i) == ' ') {
                c = c + in.charAt(i);
            } else {
                c = c + "-" + in.charAt(i);
            }
        }
        return c;
    }
}
