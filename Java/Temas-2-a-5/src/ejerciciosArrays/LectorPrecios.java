package ejerciciosArrays;

import java.util.Scanner;

public class LectorPrecios {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // Inicializamos constantes
        int SUCURSALES = 4;
        int num_articulos = 5;
        int cant_articulos_s2 = 0;
        double recaudacion_total = 0;
        // El núm. de sucursal que tendrá mayor recaudación
        int max_recaudacion = 0;
        // Para llevar cuenta en el bucle de qué recaudación es mayor
        double rec_index = 0;

        // Inicializamos diversos arrays
        long[] cantidades_totales = new long[5];
        double[] recaud_total_por_sucursal = new double[4];
        double[][][] cantidades_vendidas = new double[SUCURSALES][num_articulos][2];
        for (int i = 0; i < SUCURSALES; i++) {
            for (int j = 0; j < num_articulos; j++) {
                System.out.printf("Dime el precio del artículo %d para la sucursal %d\n", (j + 1), (i + 1));
                cantidades_vendidas[i][j][0] = userInput.nextDouble();
                System.out.printf("Dime la cantidad vendida del artículo %d para la sucursal %d\n", (j + 1), (i + 1));
                cantidades_vendidas[i][j][1] = userInput.nextLong();
                cantidades_totales[j] += cantidades_vendidas[i][j][1];
                recaud_total_por_sucursal[i] += cantidades_vendidas[i][j][0];
            }
        }

        // Iteramos para imprimir las cantidades totales de cada artículo
        for (int k = 0; k < num_articulos; k++) {
            System.out.printf("Cantidades totales del artículo %d → %d\n", (k + 1), cantidades_totales[k]);
        }

        // Iteramos para sumar todos los artículos de la sucursal 2
        for (int l = 0; l < 5; l++) {
            cant_articulos_s2 += cantidades_vendidas[1][l][1];
        }
        System.out.printf("Cantidades de artículos en la sucursal 2 → %d\n", cant_articulos_s2);

        // Sacamos el slot del array tridimensional que tiene el dato
        System.out.printf("Cantidad del articulo 3 en la sucursal 1 → %d\n", (long)cantidades_vendidas[0][2][1]);

        // Iteramos para sacar los valores del array de recaudación
        for (int m = 0; m < 4; m++) {
            if (recaud_total_por_sucursal[m] > rec_index) {
                rec_index = recaud_total_por_sucursal[m];
                max_recaudacion = (m + 1);
            }
            System.out.printf("Recaudacion total de la sucursal %d → %.3f.\n", (m + 1), recaud_total_por_sucursal[m]);
            recaudacion_total += (double)recaud_total_por_sucursal[m];
        }

        // Recaudación total de la empresa = sumar todos los valores del array de sucursales
        System.out.printf("Recaudación total de la empresa → %.3f.\n", recaudacion_total);
        System.out.printf("La sucursal %d es la que más recaudación ha tenido.", max_recaudacion);



        userInput.close();
    }
}
