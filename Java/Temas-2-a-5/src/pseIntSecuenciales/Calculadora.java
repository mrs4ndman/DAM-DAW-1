package pseIntSecuenciales;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner inputter = new Scanner(System.in);

        double Num1, Num2, S_resultado, R_resultado, D_resultado, M_resultado;

        System.out.println("Dime el primer número");

        // Instancia que recoge el primer número
        Num1 = inputter.nextDouble();

        System.out.println("Dime el segundo número");
        
        // Instancia que recoge el segundo número
        Num2 = inputter.nextDouble();

        // Realizamos todas las operaciones
        S_resultado = Num1 + Num2;
        R_resultado = Num1 - Num2;
        M_resultado = Num1 * Num2;
        D_resultado = Num1 / Num2;

        // Imprimimos los resultados
        System.out.println("La suma da: " + S_resultado);
        System.out.println("La resta da: " + R_resultado);
        System.out.println("La multiplicación da: " + M_resultado);
        System.out.println("La división da: " + D_resultado);

        inputter.close();
    }
}
