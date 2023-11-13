package ejerciciosArrays;

import java.util.Scanner;

public class DevuelveMeses {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Dime el número de un mes y te digo sus características ↓");
        int numero_mes_usuario = userInput.nextInt();

        int[] numero_dias_mes = {28, 30, 31};
        String[] nombres_meses = {
            "Enero", "Febrero", "Marzo",      "Abril",   "Mayo",      "Junio",
            "Julio", "Agosto",  "Septiembre", "Octubre", "Noviembre", "Diciembre",
        };

        switch (numero_mes_usuario) {
        case 2:
            System.out.println("Febrero tiene " + numero_dias_mes[0]);
            break;
        case 1, 3, 5, 7, 8, 10, 12:
            System.out.println("El mes de " + nombres_meses[(numero_mes_usuario - 1)] + " tiene " + numero_dias_mes[2] +
                               " días.");
            break;
        case 4, 6, 9, 11:
            System.out.println("El mes de " + nombres_meses[(numero_mes_usuario - 1)] + " tiene " + numero_dias_mes[1] +
                               " días.");
            break;
        default:
            System.out.println("Me diste un número de mes erróneo");
        }

        userInput.close();
    }
}
