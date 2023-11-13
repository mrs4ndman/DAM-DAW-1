package ejerciciosArrays;

public class MatrixCool {
    public static void main(String[] args) {
        int[][] bidiTable = new int[5][5];
        int[] suma_columnas = new int[5];
        int[] suma_filas = new int[5];
        for (int i = 0; i < 5; i++) {
            suma_filas[i] = 0;
            suma_columnas[i] = 0;
            for (int j = 0; j < 5; j++) {
                bidiTable[i][j] = (int)(Math.random() * 10);
                System.out.printf("%3d", bidiTable[i][j]);
                suma_filas[i] = suma_filas[i] + bidiTable[i][j];
            }
            System.out.print("   → Suma filas → " + suma_filas[i]);
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                suma_columnas[i] = suma_columnas[i] + bidiTable[j][i];
            }
        }
        for (int k = 0; k < 5; k++) {
            System.out.println("Suma columnas → " + suma_columnas[k]);
        }
    }
}
