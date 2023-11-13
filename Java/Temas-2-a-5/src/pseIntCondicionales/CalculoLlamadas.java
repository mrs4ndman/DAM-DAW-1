package pseIntCondicionales;

import java.util.Scanner;

public class CalculoLlamadas {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        long minutosLlamada, costeCentimos, costeEuros;
        String diaLlamada, turnoDia;
        double impuesto, coste;

        System.out.println("Dime la longitud de la llamada en minutos");
        minutosLlamada = userInput.nextLong();

        userInput.nextLine();
        System.out.println("Dime el día en el que realizaste la llamada");
        diaLlamada = userInput.next();

        userInput.nextLine();
        System.out.println("Dime el turno en el que realizaste la llamada");
        turnoDia = userInput.next();

        if ( minutosLlamada <= 0 ) {
            System.out.println("Tu llamada no ha durado nada, no te cuesta nada");
        } else {
            if (minutosLlamada > 10) {
                coste = (100 * 5) + (80 * 3) + (70 * 2) + ((minutosLlamada -10) * 50);
            } else if (minutosLlamada > 8 && minutosLlamada <= 10) {
                coste = (100 * 5) + (80 * 3) + ((minutosLlamada - 8) * 70);
            } else if (minutosLlamada > 5 && minutosLlamada <= 8 ) {
                coste = (100 * 5) + ((minutosLlamada - 5) * 80);
            } else {
                coste = (100 * minutosLlamada);
            }

            if (diaLlamada.equals("Domingo") || diaLlamada.equals("domingo")) {
                impuesto = 0.03 * coste;
                coste += impuesto;
            } else {
                if (turnoDia.equals("Mañana") || turnoDia.equals("mañana")) {
                    impuesto = 0.15 * coste;
                    coste += impuesto;
                } else {
                    if (turnoDia.equals("Tarde") || turnoDia.equals("tarde")) {
                        impuesto = 0.10 * coste;
                        coste += impuesto;
                    }
                }
            }

            costeEuros = (long) Math.floor(coste / 100);

            costeCentimos = (long) coste % 100;

            System.out.println("Te ha costado " + costeEuros + " euros y " + costeCentimos + " céntimos.");
        }
        // System.out.println(turnoDia);
        // System.out.println(diaLlamada);
        userInput.close();
    }
}
