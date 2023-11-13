package ejerciciosArrays;

import java.util.Scanner;

public class QuinielaFurbo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[][] equipos = new String[3][2];
        int[][] resultados = new int[3][2];

        System.out.println("Ingrese los datos para la quiniela");
        for (int i = 0; i < 3; i++) {
            System.out.println("Partido " + (i + 1));
            for (int j = 0; j < 2; j++) {
                System.out.println("Dime el nombre del equipo " + (j + 1));
                equipos[i][j] = userInput.next();
            }
            System.out.println("Dime el resultado del partido (Formato → 2-1, 0-0, ...)");
            String resultado_partido = userInput.next();
            char resultado_equipo1 = resultado_partido.charAt(0);
            char resultado_equipo2 = resultado_partido.charAt(2);
            int res1 = Integer.parseInt(String.valueOf(resultado_equipo1));
            int res2 = Integer.parseInt(String.valueOf(resultado_equipo2));
            resultados[i][0] = res1;
            resultados[i][1] = res2;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Partido " + (i + 1) + ": Resultado ↓");
            System.out.println(equipos[i][0] + " - " + equipos[i][1] + " → " +
                               resultados[i][0] + " - " + resultados[i][1]);
        }

        userInput.close();
    }
}
