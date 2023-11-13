package ejerciciosFunciones;

import java.util.Scanner;

public class CalculadoraSelectiva {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String calcMode;
        double num1, num2;

        System.out.println("Dime el primer número ↓");
        num1 = userInput.nextDouble();
        System.out.println("Dime el segundo número ↓");
        num2 = userInput.nextDouble();
        System.out.println("Dime el modo a calcular (Suma, Resta, Multiplicacion, Division) ↓");
        calcMode = userInput.next();

        calcMode = calcMode.toUpperCase();
        switch (calcMode) {
            case "SUMA":
        System.out.println("Suma ↓");
            System.out.println(SumaModule(num1, num2));
            break;
            case "RESTA":
            System.out.println("Resta ↓");
            System.out.println(RestaModule(num1, num2));
            break;
            case "MULTIPLICACION":
            System.out.println("Multiplicación ↓");
            System.out.println(MultiplModule(num1, num2));
            break;
            case "DIVISION":
            System.out.println("División ↓");
            System.out.println(DivModule(num1, num2));
            break;
            default:
            System.out.println("Tipo de operación errónea");
            break;
        }

        userInput.close();
    }
    public static double MultiplModule(double a, double b) {
        return (double) (a * b);
    }
    public static double SumaModule(double a, double b) {
        return (double) (a + b);
    }
    public static double RestaModule(double a, double b) {
        return (double) (a - b);
    }
    public static double DivModule(double a, double b) {
        if (a != 0 && b != 0){
            return ((double)((double) a / (double) b));
        } else {
            System.out.println("Dame números que no sean 0 para poder dividir");
            return (double) 0;
        }
    }
}
