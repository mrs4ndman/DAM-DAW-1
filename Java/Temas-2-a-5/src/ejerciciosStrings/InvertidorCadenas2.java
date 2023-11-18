
package ejerciciosStrings;

import java.util.Scanner;

public class InvertidorCadenas2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Dime la cadena a invertir");
        String cadenita_no_invertida = userInput.nextLine();
        System.out.println("Cadena invertida ↓");
        System.out.println(invertirCadena(cadenita_no_invertida));
        userInput.close();
    }
    public static String invertirCadena(String cadena) {
        int len = cadena.length();
        char[] pepe =  new char[len];

        for (int i = 0; i < len; i++) {
            pepe[i] += cadena.charAt((len - 1) - i);
        }
        return new String(pepe);
    }
}
