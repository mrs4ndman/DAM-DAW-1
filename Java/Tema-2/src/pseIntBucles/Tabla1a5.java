package pseIntBucles;

/**
 * Tabla1a5
 */
public class Tabla1a5 {
    public static void main(String[] args) throws InterruptedException {
        byte i, j;
        i = 0;
        for (i = 1; i < 6; ++i) {
            j = 1;
            Thread.sleep(1000);
            for (j = 1; j < 11; ++j) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
