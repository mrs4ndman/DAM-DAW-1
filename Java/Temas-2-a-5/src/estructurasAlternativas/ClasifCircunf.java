package estructurasAlternativas;

import java.util.Scanner;

public class ClasifCircunf {
    public static void main(String[] args) {
        Scanner coordInput = new Scanner(System.in);

        long x1, y1, r1, x2, y2, r2;
        double distanciaCentros;

        System.out.println("Dime las coordenadaas y el radio de la primera circunferencia (Separados por Intro)");
        x1 = coordInput.nextLong();
        y1 = coordInput.nextLong();
        r1 = coordInput.nextLong();
        
        System.out.println("Dime las coordenadaas y el radio de la primera circunferencia (Separados por Intro)");
        x2 = coordInput.nextLong();
        y2 = coordInput.nextLong();
        r2 = coordInput.nextLong();

        distanciaCentros = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);;

        if (distanciaCentros < (r1 + r2) && distanciaCentros > Math.abs(r1 - r2)) {
            System.out.println("Secantes");
        }
        if (distanciaCentros > 0 && distanciaCentros < Math.abs(r1 - r2)) {
            System.out.println("Interiores");
        }

        if (distanciaCentros > (r1 + r2)) {
            System.out.println("Exteriores");
        } else if (distanciaCentros == 0) {
            System.out.println("Circunferencias concéntricas");
        } else if (distanciaCentros == (r1 + r2)) {
            System.out.println("Tangentes exteriores");
        } else if (distanciaCentros == Math.abs(r1 - r2)) {
            System.out.println("Tangentes interiores");
        }

        coordInput.close();
    }
}
