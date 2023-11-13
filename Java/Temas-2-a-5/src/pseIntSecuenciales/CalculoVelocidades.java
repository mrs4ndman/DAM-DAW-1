package pseIntSecuenciales;

import java.util.Scanner;

public class CalculoVelocidades {
    public static void main(String[] args) {
        Scanner inputter = new Scanner(System.in);

        int v1, v2;
        float speed_diff, ttl_m, ttl_h, distancia;

        System.out.println("Introduzca la velocidad del primer vehículo (km/h)");
        v1 = inputter.nextInt();

        System.out.println("Introduzca la velocidad del primer vehículo (km/h)");
        v2 = inputter.nextInt();

        System.out.println("Introduzca la distancia entre ambos vehículos (km)");
        distancia = inputter.nextFloat();

        speed_diff = Math.abs(v2 - v1);
        ttl_h = distancia / speed_diff;
        ttl_m = ttl_h * 60;

        // TODO: Crear una if-condition para que se reordene la impresión final
        System.out.println("El coche 2 tardará " + (int) ttl_m + " minutos en alcanzar al coche 1");

        inputter.close();
    }
}
