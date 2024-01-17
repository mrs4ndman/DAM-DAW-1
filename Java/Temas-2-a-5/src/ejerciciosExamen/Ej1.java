package ejerciciosExamen;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Dime el ancho");
        int ancho = userInput.nextInt();
        System.out.println("Dime el alto");
        int alto = userInput.nextInt();

        int[][] matriz_original = new int[alto][ancho];
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz_original[i][j] = userInput.nextInt();
            }
        }

        System.out.println("Normal");
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz_original[i][j]);
            }
            System.out.println();
        }

        int[][] matriz_traspuesta = transpuesta(matriz_original, alto, ancho);

        System.out.println("Traspuesta");
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                System.out.print(matriz_traspuesta[i][j]);
            }
            System.out.println();
        }

        userInput.close();
    }

    public static int[][] transpuesta(int[][] matriz_original, int alto, int ancho){

        int[][] matriz_ya_traspuesta = new int[ancho][alto];
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz_ya_traspuesta[j][i] = matriz_original[i][j];
            }
        }
        return matriz_ya_traspuesta;
    }
}

