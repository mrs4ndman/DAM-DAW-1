package ejerciciosArrays;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String[] charArr = new String[5];
        String[] inversedCharArr = new String[5];

        System.out.println("Inversor de orden");
        for (int i = 0; i < (charArr.length); i++) {
            System.out.println("Dime una string a almacenar");
            charArr[i] = userInput.nextLine();
            inversedCharArr[(charArr.length - 1) - i] = charArr[i];
        }
        for (int j = 0; j < (inversedCharArr.length); j++) {
            System.out.println("" + inversedCharArr[j]);
        }
        userInput.close();
    }
}
