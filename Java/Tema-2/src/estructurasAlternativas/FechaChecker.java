package estructurasAlternativas;

import java.util.Scanner;

public class FechaChecker {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);

        long diaUsuario, mesUsuario, yearUsuario;

        System.out.println("Dime el día a comprobar");
        diaUsuario = inputUsuario.nextLong();

        System.out.println("Dime el mes a comprobar");
        mesUsuario = inputUsuario.nextLong();

        System.out.println("Dime el año a comprobar");
        yearUsuario = inputUsuario.nextLong();

        if ((diaUsuario < 0) || (mesUsuario < 1 && mesUsuario > 12 ) && (yearUsuario < 0)) {
            System.out.println("Fecha no válida");
        } else {
            if (mesUsuario == 2 && diaUsuario == 29 && ((( ( yearUsuario % 100 != 0 ) && (yearUsuario % 4 == 0 ) ) || ( (yearUsuario % 100 == 0) && (yearUsuario % 400 == 0  ) )))) {
                System.out.println("Febrero bisiesto!");
            } else if (mesUsuario == 2 && diaUsuario == 29 && !((( ( yearUsuario % 100 != 0 ) && (yearUsuario % 4 == 0 ) ) || ( (yearUsuario % 100 == 0) && (yearUsuario % 400 == 0  ) )))){
                System.out.println("No válido: Este febrero no es bisiesto");
            } else if (((mesUsuario == 1) ||(mesUsuario == 3) || (mesUsuario == 5) || (mesUsuario == 7) || (mesUsuario == 8) || (mesUsuario == 10) || (mesUsuario == 12)) && diaUsuario <= 31) {
                System.out.println("Válido");
            } else if (((mesUsuario == 4) ||(mesUsuario == 6) || (mesUsuario == 9) || (mesUsuario == 11)) && diaUsuario <= 30) {
                System.out.println("Válido");
            }
            // System.out.println("Dime el día a comprobar");
        }

        inputUsuario.close();
    }
}
