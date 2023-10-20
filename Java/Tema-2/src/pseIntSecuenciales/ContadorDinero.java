package pseIntSecuenciales;

import java.util.Scanner;

public class ContadorDinero {
    public static void main(String[] args) {
        Scanner moneyInput = new Scanner(System.in);

        long monedas2Euros, monedas1Euro, monedas50Cent, monedas20Cent, monedas10Cent;
        long outputEuros, outputCentimos, outputCentimosASumar, sumaCentimillos;

        System.out.println("Introduzca la cantidad de monedas de 2€");
        monedas2Euros = moneyInput.nextLong();

        System.out.println("Introduzca la cantidad de monedas de 1€");
        monedas1Euro = moneyInput.nextLong();

        System.out.println("Introduzca la cantidad de monedas de 50 céntimos");
        monedas50Cent = moneyInput.nextLong();

        System.out.println("Introduzca la cantidad de monedas de 20 céntimos");
        monedas20Cent = moneyInput.nextLong();

        System.out.println("Introduzca la cantidad de monedas de 10 céntimos");
        monedas10Cent = moneyInput.nextLong();

        monedas10Cent = (monedas10Cent * 10);
        monedas20Cent = (monedas20Cent * 20);
        monedas50Cent = (monedas50Cent * 50);

        sumaCentimillos = (monedas10Cent + monedas20Cent + monedas50Cent);

        outputEuros = (monedas2Euros * 2) + monedas1Euro;

        outputCentimos = sumaCentimillos % 100;
        outputCentimosASumar = (long) Math.floor(sumaCentimillos / 100);

        outputEuros = outputEuros + outputCentimosASumar;

        System.out.println("Son " + outputEuros + " euros y " + outputCentimos + " céntimos.");

        moneyInput.close();
    }
}
