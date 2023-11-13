package ejerciciosFunciones;

import java.util.Scanner;

public class CalculadoraAreas {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double num1;
        double num2;
        String modeSelect = " ";

        while (modeSelect != "4") {
            System.out.println("Elije el tipo de operación (1, 2, 3 o 4) ↓");
            System.out.println("1 → Área del círculo");
            System.out.println("2 → Área del triángulo");
            System.out.println("3 → Área del cuadrado");
            System.out.println("4 / otros → Salir");
            modeSelect = userInput.nextLine();
            switch (modeSelect) {
                case "1":
                System.out.println("Dime el radio del círculo");
                num1 = userInput.nextDouble();
                num1 = Math.abs(num1);
                num2 = 0;
                userInput.nextLine();
                System.out.println("El área del círculo vale " + AreaCirculo(num1));
                break;
                case "2":
                System.out.println("Dime la base del triángulo");
                num1 = userInput.nextDouble();
                System.out.println("Dime la altura del triángulo");
                num2 = userInput.nextDouble();
                System.out.println("El área del triángulo vale " + AreaTriangulo(num1, num2));
                userInput.nextLine();
                break;
                case "3":
                System.out.println("Dime el lado del cuadrado");
                num1 = userInput.nextDouble();
                System.out.println("El área del cuadrado vale " + AreaCuadrado(num1));
                userInput.nextLine();
                break;
                default:
                System.out.println("Saliendo");
                break;
            }
            if (modeSelect.equals("4") || !modeSelect.equals("1") ||!modeSelect.equals("2") ||!modeSelect.equals("3") ) {
                break;
            }
        }
        userInput.close();
    }
    public static double AreaCirculo(double radio) {
        return (double) (Math.pow(radio, (double) 2) * Math.PI);
    }
    public static double AreaTriangulo(double base, double altura) {
        return (double)(((double)base * (double)altura) / 2);
    }
    public static double AreaCuadrado(double lado) {
        return (double)(lado * lado);
    }
}
