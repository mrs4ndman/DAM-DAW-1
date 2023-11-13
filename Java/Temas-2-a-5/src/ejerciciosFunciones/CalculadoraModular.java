package ejerciciosFunciones;

import java.util.Scanner;

public class CalculadoraModular {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Dime el primer número");
        long primerNum = userInput.nextLong();
        System.out.println("Dime el segundo número");
        long segundoNum = userInput.nextLong();
        SumaModule(primerNum, segundoNum);
        RestaModule(primerNum, segundoNum);
        MultiplModule(primerNum, segundoNum);
        DivModule(primerNum, segundoNum);

        userInput.close();
    }
    public static void MultiplModule(long a, long b) {
        System.out.println("Multiplicación ↓");
        System.out.println((long) (a * b));
    }
    public static void SumaModule(long a, long b) {
        System.out.println("Suma ↓");
        System.out.println((long) (a + b));
    }
    public static void RestaModule(long a, long b) {
        System.out.println("Resta ↓");
        System.out.println((long) (a - b));
    }
    public static void DivModule(long a, long b) {
        System.out.println("División ↓");
        if (a != 0 && b != 0){
            System.out.println((double)((double) a / (double) b));
        } else System.out.println("Dame números que no sean 0 para poder dividir");
    }
}
