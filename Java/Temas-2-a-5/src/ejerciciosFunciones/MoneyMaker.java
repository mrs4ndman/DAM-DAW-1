package ejerciciosFunciones;

import java.util.Scanner;

public class MoneyMaker {
    public static void main(String[] args) {
        long cantidad_euros;
        String divisa;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Dime la cantidad de euros a convertir");
            cantidad_euros = userInput.nextLong();
        } while (cantidad_euros == 0);

        System.out.println("Dime el tipo de moneda a convertir");
        divisa = userInput.next();

        if (divisa.isEmpty()) {
            System.out.println("Me diste una divisa nula");
        } else {
            cambiadorMoneda(cantidad_euros, divisa);
        }

        userInput.close();
    }
    public static void cambiadorMoneda(long money_in, String moneda) {
        double euros = (double)money_in;
        switch (moneda.toUpperCase()) {
            case "DOLARES":
            double dolares = 1.066258;
            System.out.println(euros + " euros son " + (dolares * (double)euros) +
                " dólares");
            break;
            case "YENES":
            double yenes = 160.74987;
            System.out.println(euros + " euros son " + (yenes * (double)euros) +
                " yenes");
            break;
            case "LIBRAS":
            double libras = 0.87454544;
            System.out.println(euros + " euros son " + (libras * (double)euros) +
                " libras");
            break;
            default:
            System.out.println(
                "No me has dado una divisa válida. Vuelve a intentarlo");
            break;
        }
    }
}
