package ejerciciosStrings;

import java.util.Scanner;

public class ContadorOcurrencias {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String to_match;
        System.out.println("Dime la palabra base");
        String base_str = userInput.nextLine();
        // userInput.nextLine();
        System.out.println("Dime la palabra de occurencia");
        to_match = userInput.nextLine();
        System.out.println("Ocurrencias de 2 en 1 → " +contarOcurrencias(base_str, to_match));

        userInput.close();
    }
    public static int contarOcurrencias(String a, String b) {
        int count = 0;
        if (a.isEmpty() || b.isEmpty()) {
            count = 0;
            return count;
        } else {
            int curpointer = 0;
            while (curpointer < a.length()) {
                if (a.substring(curpointer, curpointer + b.length()).equals(b)) {
                    curpointer += b.length();
                    count++;
                } else {
                    curpointer++;
                }
            }
            return count;
        }
    }
}
