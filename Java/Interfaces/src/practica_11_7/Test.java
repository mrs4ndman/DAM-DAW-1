package practica_11_7;

import java.util.Scanner;

public class Test {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String test = sc.nextLine();

        System.out.println(Muestra.validarMatrícula(test));
    }
}
