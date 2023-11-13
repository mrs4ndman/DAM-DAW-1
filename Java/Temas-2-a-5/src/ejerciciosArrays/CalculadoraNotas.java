package ejerciciosArrays;

import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] notas_alumno = new int[5];

        for (int i = 0; i < notas_alumno.length; i++ ) {
            do {
                System.out.println("Dime la nota " + (i + 1) + ":");
                notas_alumno[i] = userInput.nextInt();
            } while (notas_alumno[i] < 0 || notas_alumno[i] > 10);
        }
        double nota_media = 0;
        int nota_mas_alta = 0, nota_mas_baja = 0;
        nota_mas_baja = notas_alumno[0];
        for (int j = 0; j < notas_alumno.length; j++) {
            nota_media = nota_media + notas_alumno[j];
            System.out.println("Nota " + (j + 1) + ": " + notas_alumno[j]);
            if (notas_alumno[j] > nota_mas_alta) {
                nota_mas_alta = notas_alumno[j];
            }
            if (notas_alumno[j] < nota_mas_baja) {
                nota_mas_baja = notas_alumno[j];
            }
        }
        nota_media /= notas_alumno.length;
        System.out.println("Nota media → " + nota_media);
        System.out.println("Nota más baja → " + nota_mas_baja);
        System.out.println("Nota más alta → " + nota_mas_alta);

        userInput.close();
    }
}
