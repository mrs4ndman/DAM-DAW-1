package ejerciciosArrays;

public class VectorNumeros {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        for (int num = 0; num < 10; num++) {
            while (vector_numeros[num] == 0) {
                vector_numeros[num] = (int)(10 * Math.random());
            }
        }
        for (int num : vector_numeros) {
            System.out.printf("Normal → %d | Cuadrado → %d | Cubo → %d",
            (vector_numeros[num]),
            (int)Math.pow(vector_numeros[num], 2),
            (int)Math.pow(vector_numeros[num], 3));
            System.out.println();
        }
    }
}
