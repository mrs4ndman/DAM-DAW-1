package ejercicios6_2;

import java.util.Scanner;

public class PruebaCafetera {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Cafetera miCafetera = new Cafetera(0, 1000);

        System.out.println("Cantidad máxima → " + miCafetera.getCapacidadMaxima() +
                           ", Cantidad actual → " + miCafetera.getCantidadActual());
        userInput.close();
    }
}
