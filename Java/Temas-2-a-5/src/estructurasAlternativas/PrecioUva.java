package estructurasAlternativas;

import java.util.Scanner;

public class PrecioUva {
    public static void main(String[] args) {
        Scanner inputter = new Scanner(System.in);

        long /* size, */ precioUva, precioUvaInicial, gananciaTotal;
        short size;
        // char tipoUva;
        String tipoUva;

        System.out.println("Dime el precio inicial por kilo (en céntimos)");
        precioUva = inputter.nextLong();

        System.out.println("Dime el tipo de uva (A o B)");
        tipoUva = inputter.next();

        System.out.println("Dime el tamaño (1 o 2)");
// size = inputter.nextLong();
        size = inputter.nextShort();

        if ( ((tipoUva.equals("A")) || tipoUva.equals("B") || tipoUva.equals("a") || tipoUva.equals("b")) && (size == 1 || size == 2) ) {
            precioUvaInicial = precioUva;
            if (tipoUva.equals("A") || tipoUva.equals("a")) {
                if (size == 1) {
                    precioUva = precioUva + 20;
                }
                if (size == 2) {
                    precioUva = precioUva + 30;
                }
            }
            if (tipoUva.equals("B") || tipoUva.equals("b")) {
                if (size == 1) {
                    precioUva = precioUva - 30;
                }
                if (size == 2) {
                    precioUva = precioUva - 50;
                }
            }

            gananciaTotal = precioUva - precioUvaInicial;

            if (gananciaTotal == 0) {
                System.out.println("No hay ni pérdidas ni ganancias");
            } else if (gananciaTotal < 0) {
                System.out.println("Las pérdidas son de " + Math.abs(gananciaTotal) + " centimos");
            } else if (gananciaTotal > 0) {
                System.out.println("Las ganancias son de " + gananciaTotal + " centimos");
            }

        } else {
            System.out.println("Datos de uva erróneos");
        }

        inputter.close();
    }
}
