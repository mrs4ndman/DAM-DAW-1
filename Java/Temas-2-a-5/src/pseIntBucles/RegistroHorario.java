package pseIntBucles;

import java.util.Scanner;

public class RegistroHorario {
    public static void main(String[] args) {
        Scanner hourInput = new Scanner(System.in);

        long horasDiarias, horasTotalesSemana, sueldoPorHora, sueldoTotal;

        System.out.println("Dime el sueldo semanal del trabajador por hora");
        sueldoPorHora = hourInput.nextLong();

        horasTotalesSemana = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Dime las horas que ha trabajado el día " + (i + 1));
            horasDiarias = hourInput.nextLong();

            horasTotalesSemana = horasTotalesSemana + horasDiarias;
        }
        sueldoTotal = sueldoPorHora * horasTotalesSemana;
        System.out.println("Ha trabajado " + horasTotalesSemana + " horas en la semana.");
        System.out.println("Su sueldo de esta semana es de " +  sueldoTotal + " euros.");
        hourInput.close();
    }
}


