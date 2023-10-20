package pseIntSecuenciales;

import java.util.Scanner;

public class Iniciales {
    public static void main(String[] args) {
        Scanner NameInput = new Scanner(System.in);

        String nombreInicial, apellidoInicial1, apellidoInicial2;
        String inicialN, inicialA1, inicialA2;

        System.out.println("Dime tu nombre");
        nombreInicial = NameInput.nextLine();

        System.out.println("Dime tu primer apellido");
        apellidoInicial1 = NameInput.nextLine();

        System.out.println("Dime tu segundo apellido");
        apellidoInicial2 = NameInput.nextLine();

        // Cogemos la primera posición del array de cada string inicial
        inicialN = nombreInicial.substring(0,1);
        inicialA1 = apellidoInicial1.substring(0,1);
        inicialA2 = apellidoInicial2.substring(0,1);

        System.out.println("Tus iniciales son: " + inicialN + " (nombre), " + inicialA1 + " (apellido 1), " + inicialA2 + " (apellido 2).");

        NameInput.close();
    }
}
