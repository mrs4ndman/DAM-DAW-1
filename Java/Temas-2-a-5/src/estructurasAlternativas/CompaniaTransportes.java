package estructurasAlternativas;

import java.util.Scanner;

public class CompaniaTransportes {
    public static void main(String[] args) {
        Scanner pesoInput = new Scanner(System.in);

        double zonaPaquete, costeFinal, pesoPaquete, costePorGramo; 
        String ubicacionEnvio;
        System.out.println("Dime la zona del envío:");
        zonaPaquete = pesoInput.nextInt();

        if (zonaPaquete == 1) {
            ubicacionEnvio = "América del Norte";
            costePorGramo = 24;
        } else if (zonaPaquete == 2) {
            ubicacionEnvio = "América Central";
            costePorGramo = 20;
        } else if (zonaPaquete == 3) {
            ubicacionEnvio = "América del Sur";
            costePorGramo = 21;
        } else if (zonaPaquete == 4) {
            ubicacionEnvio = "Europa";
            costePorGramo = 10;
        } else if (zonaPaquete == 5) {
            ubicacionEnvio = "Asia";
            costePorGramo = 18;
        } else {
            costePorGramo = 0;
            System.out.println("La zona no es válida");
            ubicacionEnvio = "Ninguna";
        }

        System.out.println("Dime el peso del paquete:");
        pesoPaquete = pesoInput.nextDouble();

        if (pesoPaquete < 5) {
            System.out.println("Peso: " + pesoPaquete);
            // pesoPaquete *= 1000;
            costeFinal = costePorGramo * pesoPaquete;
            System.out.println("El envío cuesta " + costeFinal + " euros al enviarlo a " + ubicacionEnvio + ".");
        } else {
            System.out.println("El envío es demasiado pesado, se rechaza la entrega");
        }

        pesoInput.close();
    }
}
