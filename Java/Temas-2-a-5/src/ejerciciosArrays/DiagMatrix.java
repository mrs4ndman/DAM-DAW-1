package ejerciciosArrays;

public class DiagMatrix {
    public static void main(String[] args) {
        int[][] DiagMatrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                DiagMatrix[i][i] = 1;
                System.out.printf("%3d", DiagMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
