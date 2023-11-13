package ejerciciosArrays;

import java.util.Scanner;

public class TemperaturaMinMax {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double tempArr[][] = new double[5][4];

        for (int i = 0; i < 5; i++) {
            System.out.println("Dime la temperatura mínima del día " + (i + 1));
            tempArr[i][0] = userInput.nextInt();
            System.out.println("Dime la temperatura máxima del día " + (i + 1));
            tempArr[i][1] = userInput.nextInt();
            tempArr[i][2] = (i + 1);
            tempArr[i][3] = (tempArr[i][0] + tempArr[i][1]) / 2;
        }
        double aux;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i - 1); j++) {
                if (tempArr[j][0] > tempArr[j + 1][0]) {
                    // Movemos las temperaturas mínimas
                    aux = tempArr[j][0];
                    tempArr[j][0] = tempArr[j + 1][0];
                    tempArr[j + 1][0] = aux;
                    // Movemos las temperaturas máximas
                    aux = tempArr[j][1];
                    tempArr[j][1] = tempArr[j + 1][1];
                    tempArr[j + 1][1] = aux;
                    // Movemos los días
                    aux = tempArr[j][2];
                    tempArr[j][2] = tempArr[j + 1][2];
                    tempArr[j + 1][2] = aux;
                }
            }
            System.out.println("La media de temperatura del día " + (i + 1) + " es " + tempArr[i][3]);
        }
        System.out.println("Estos son los 2 días más fríos");
        for (int l = 0; l < 2; l++) {
            System.out.println("Día " + (int) tempArr[l][2] + " → " + tempArr[l][0]);
        }
        int coincidente = 1;
        System.out.println("Dime una temperatura y te digo si coincide con una máxima");
        int tempCheck = userInput.nextInt();
        for (int i = 0; i < 5; i++) {
            if (tempCheck == tempArr[i][1]) {
                coincidente = 0;
                System.out.println("Coincide con la máxima del día " + (int) tempArr[i][2]);
            }
        }
        if (coincidente == 1) {
            System.out.println("No coincide con ninguna temperatura máxima");
        }

        userInput.close();
    }
}
