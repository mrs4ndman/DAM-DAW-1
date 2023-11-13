package pseIntSecuenciales;

import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        long NumOrig, Resultado, Cociente;
        double modulo;

        System.out.println("Dame un número de 2 cifras:");
        NumOrig = userInput.nextLong();

        modulo = NumOrig % 10;

        Cociente = (int) Math.floor(NumOrig / 10);

        Resultado = (int) (Cociente + (modulo * 10));

        if (Resultado < 10) {
            System.out.println("0" + Resultado);
        } else {
            System.out.println(Resultado);
        }

        userInput.close();
    }
}
