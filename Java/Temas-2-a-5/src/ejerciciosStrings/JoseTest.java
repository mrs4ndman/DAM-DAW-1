package ejerciciosStrings;
import java.util.Scanner;

public class JoseTest {

    public static void main(String[] args) {
        Scanner articulo = new Scanner(System.in);
        String[] producto = new String[5];
        double[] precio = new double[5], totales_vendidas = new double[5];
        int[] sucursal1 = new int[5], sucursal2 = new int[5], sucursal3 = new int[5],
              sucursal4 = new int[5], total = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Escribe el nombre del producto " + (i + 1));
            producto[i] = articulo.nextLine();
            System.out.println("Escribe el precio del " + producto[i]);
            precio[i] = articulo.nextDouble();
            System.out.println("Escribe la cantidad que vendia por la sucursal 1");
            sucursal1[i] = articulo.nextInt();
            System.out.println("Escribe la cantidad que vendia por la sucursal 2");
            sucursal2[i] = articulo.nextInt();
            System.out.println("Escribe la cantidad que vendia por la surucsal 3");
            sucursal3[i] = articulo.nextInt();
            System.out.println("Escribe la cantidad que vendia por la sucursal 4");
            sucursal4[i] = articulo.nextInt();
            total[i] = (int)(sucursal1[i] + sucursal2[i] + sucursal3[i] +
                             sucursal4[i]); // Sumo todas las cantidades
            totales_vendidas[i] =
                (int)(sucursal1[i] + sucursal2[i] + sucursal3[i] + sucursal4[i]) *
                precio[i]; // Multiplico la suma de todas las cantidades por el precio
            articulo.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            total[i] = sucursal1[i] + sucursal2[i] + sucursal3[i] + sucursal4[i];

            System.out.println("En total se vendio " + total[i] + " del producto " +
                               producto[i] + " ganando asi " + totales_vendidas[i] +
                               " Euros");
        }

        articulo.close();
    }
}
