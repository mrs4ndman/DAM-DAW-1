package ejerciciosArrays;

import java.util.Scanner;

public class RellenaVectores {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[] vector_rellenado = new int[10];
        int empty_counter = 0;

        for (int i = 0; i < vector_rellenado.length; i++) {
            System.out.println("Dime un número");
            vector_rellenado[i] = userInput.nextInt();
            if (vector_rellenado[i] < 0) {
                break;
            }
            empty_counter++;
        }
        for (int j = 0; j < empty_counter; j++) {
            System.out.println(vector_rellenado[j]);
        }
        // System.out.println(vector_rellenado[9]);
        userInput.close();
    }
}
