package estructurasAlternativas;

import java.util.Scanner;

public class Passworder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String nombreUsuario, contraUsuario;

        System.out.println("Dime tu nombre de usuario: ");
        nombreUsuario = userInput.nextLine();

        // Recuerda, solo se puede hacer de ints a strings userInput.next();
        System.out.println("Dime tu contraseña: ");
        contraUsuario = userInput.nextLine();

        if (nombreUsuario.equals("pepe") && contraUsuario.equals("asdasd")) {
            System.out.println("Has entrado al sistema");
        } else {
            System.out.println("¡ACCESO DENEGADO!");
        }

        userInput.close();
        // System.out.println(contraUsuario + ", " + nombreUsuario);
    }
}
