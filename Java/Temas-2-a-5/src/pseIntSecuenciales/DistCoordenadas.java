package pseIntSecuenciales;

import java.util.Scanner;

public class DistCoordenadas {
    public static void main(String[] args) {
        Scanner CoordInput = new Scanner(System.in);

        double x1, y1, x2, y2;
        double distancia;

        System.out.println("Dime el primer punto en el eje X");
        x1 = CoordInput.nextDouble();

        System.out.println("Dime el primer punto en el eje Y");
        y1 = CoordInput.nextDouble();

        System.out.println("Dime el segundo punto en el eje X");
        x2 = CoordInput.nextDouble();

        System.out.println("Dime el segundo punto en el eje Y");
        y2 = CoordInput.nextDouble();

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));

        System.out.println("La distancia entre los dos puntos es " + distancia);

        CoordInput.close();
    }
}
