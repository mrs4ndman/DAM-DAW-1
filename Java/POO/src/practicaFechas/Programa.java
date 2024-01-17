package practicaFechas;

// Importamos las librerías nativas de Java para fechas.
import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Empleado> lista = new ArrayList<Empleado>();

        int op, num, edad, anios, trienios, dias;

        boolean continuar = true;

        do {
            op = menu();
        } while (true);
    }

    public static int menu() {
        System.out.println("Elije una opción ↓");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("Otro → Salir");
        int res = sc.nextInt();
        return res;
    }
}
