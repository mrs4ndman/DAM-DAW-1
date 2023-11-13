package pseIntSecuenciales;

import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) {
        Scanner inputter = new Scanner(System.in);

        double sueldo_base, sueldo_final, comisiones, val1, val2, val3;
        System.out.println("Dime el sueldo base del vendedor");
        sueldo_base = inputter.nextDouble();

        System.out.println("Dime el importe de la primera venta");
        val1 = inputter.nextDouble();

        System.out.println("Dime el importe de la segunda venta");
        val2 = inputter.nextDouble();

        System.out.println("Dime el importe de la tercera venta");
        val3 = inputter.nextDouble();

        comisiones = (val1 + val2 + val3) * 0.1;

        sueldo_final = sueldo_base + comisiones;

        System.out.println("El sueldo final es " + sueldo_final);

        inputter.close();
    }
}
