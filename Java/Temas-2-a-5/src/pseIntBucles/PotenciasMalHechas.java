package pseIntBucles;

import java.util.Scanner;

public class PotenciasMalHechas {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        long baseUsuario, exponenteUsuario, potenciaResultante;

        System.out.println("Dame una base");
        baseUsuario = numInput.nextLong();

        System.out.println("Dame un exponente");
        exponenteUsuario = numInput.nextLong();

        potenciaResultante = 1;

        if (exponenteUsuario > 0) {
            for (long i = 0; i < exponenteUsuario; i++) {
                potenciaResultante = potenciaResultante * baseUsuario;
            }
        } else if (exponenteUsuario == 0) {
            potenciaResultante = 1;
        }

        System.out.println("Resultado: " + potenciaResultante);


        numInput.close();
    }
}
