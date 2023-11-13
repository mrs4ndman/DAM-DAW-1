package ejerciciosArrays;

public class MarcoMatrix {
    public static void main(String[] args) {
        int[][] marco = new int[5][15];
        for (int i = 0; i < 5; i++) {
            marco[i][0] = 1;
            marco[i][14] = 1;
            for (int j = 0; j < 15; j++) {
                marco[0][j] = 1;
                marco[4][j] = 1;
                System.out.printf("%2d", marco[i][j]);
            }
            System.out.println();
        }
    }
}
