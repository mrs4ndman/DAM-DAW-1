package ejerciciosArrays;

import java.util.Scanner;

public class KilomCamioneros {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Dime el número de conductores:");
        int numConductores = userInput.nextInt();
        String[] nombres_conductores = new String[numConductores];
        double[][] kilom_camioneros = new double[numConductores][7];
        double[] total_kms = new double[numConductores];

        for (int i = 0; i < numConductores; i++) {
            System.out.println("Dime el nombre del conductor nº" + (i + 1));
            nombres_conductores[i] = userInput.next();
            // System.out.println(nombresConductores[i]);
            for (int j = 0; j < 7; j++) {
                System.out.println("Dime sus kilómetros del día " + (j + 1));
                kilom_camioneros[i][j] = userInput.nextDouble();
                // Sacamos el total perteneciente a cada conductor
                total_kms[i] += kilom_camioneros[i][j];
            }
        }

        // Imprimimos los resultados
        for (int i = 0; i < numConductores; i++) {
            System.out.println("Conductor: " + nombres_conductores[i] + " → " + total_kms[i] + " kilómetros semanales");
        }

        userInput.close();
    }
}
