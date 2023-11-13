package estructurasAlternativas;

import java.util.Scanner;

public class MesImpreso {
    public static void main(String[] args) {
        Scanner mesInput = new Scanner(System.in);

        int numMes;

        System.out.println("Dime el número del mes:");
        numMes = mesInput.nextInt();

        if (numMes == 1 || numMes == 3 || numMes == 5 || numMes == 7 || numMes == 8 || numMes == 10 || numMes == 12) {
            System.out.println("Este mes tiene 31 días");
        } else if (numMes == 4 || numMes == 6 || numMes == 9 || numMes == 11) {
            System.out.println("Este mes tiene 30 días");
        } else if (numMes == 2) {
            System.out.println("Este mes tiene 28 días (29 en año bisiesto)");
        } 

        mesInput.close();
    }
}
