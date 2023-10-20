package pseIntCondicionales;

import java.util.Scanner;

public class OutputSemanita {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        short diaSemana;

        System.out.println("Dime el numero del día de la semana (1 a 7)");
        diaSemana = numInput.nextShort();

        if (diaSemana <= 0 || diaSemana > 7) {
            System.out.println("ERROR: Número incorrecto");
        } else {
            if (diaSemana == 1) {
                System.out.println("Lunes");
            }
            if (diaSemana == 2) {
                System.out.println("Martes");
            }
            if (diaSemana == 3) {
                System.out.println("Miércoles");
            }
            if (diaSemana == 4) {
                System.out.println("Jueves");
            }
            if (diaSemana == 5) {
                System.out.println("Viernes");
            }
            if (diaSemana == 6) {
                System.out.println("Sábado");
            }
            if (diaSemana == 7) {
                System.out.println("Domingo");
            }
        }

        numInput.close();
    }
}
