package pseIntBucles;

import java.util.Scanner;

public class Ahorrador {
    public static void main(String[] args) {

        Scanner moneyInput = new Scanner(System.in);

        int ahorroTemp, ahorroAcum, ahorroFinal, monthCounter;

        ahorroAcum = 0;
        for (monthCounter = 0; monthCounter < 11; monthCounter++) {
            System.out.println("Mes " + (monthCounter + 1) + ": ");
            ahorroTemp = moneyInput.nextInt();
            ahorroAcum += ahorroTemp;
            System.out.println("Por ahora llevas ahorrados " + ahorroAcum + " euros.");
            moneyInput.close();
        }
        ahorroFinal = ahorroAcum;
        System.out.println("En el año has ahorrado en total " + ahorroFinal + " euros.");
    }
}
