package practica_11_4;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaVehiculo {
    private static Scanner sc = new Scanner(System.in);
    private static int menu() {
        System.out.println("Elije una opción ↓");
        System.out.println("1. Añadir coche");
        System.out.println("2. Añadir camión");
        System.out.println("3. Mostrar todos los vehículos");
        System.out.println("4. Borrar todos los camiones");
        System.out.println("5. Poner remolque");
        System.out.println("6. Quitar remolque");
        System.out.println("7. Salir");
        int res = sc.nextInt();
        sc.nextLine();
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Vehiculos> lista = new ArrayList<Vehiculos>();
        int choice = 0;
        do {
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Introducir matrícula del coche ↓");
                String matriculaCoche = sc.nextLine();
                System.out.println("Introducir velocidad ↓");
                double velocidadCoche = sc.nextDouble();
                System.out.println("Introducir nº de puertas del coche ↓");
                int numPuertas = sc.nextInt();
                Coche entradaCoche =
                    new Coche(matriculaCoche, velocidadCoche, numPuertas);
                lista.add(entradaCoche);
                break;
            case 2:
                System.out.println("Introducir matrícula del camión ↓");
                String matriculaCamion = sc.nextLine();
                System.out.println("Introducir velocidad ↓");
                double velocidadCamion = sc.nextDouble();
                System.out.println("Introducir peso del remolque ↓");
                int pesoRemolque = sc.nextInt();
                Remolque entradaRemolque = new Remolque(pesoRemolque);
                Camion entradaCamion =
                    new Camion(matriculaCamion, velocidadCamion, entradaRemolque);
                lista.add(entradaCamion);
                break;
            case 3:
                System.out.println("Mostrando toda la lista de vehículos");
                System.out.println();
                for (Vehiculos i : lista) {
                    System.out.println(i.toString());
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Borrando todos los camiones");
                for (Vehiculos i : lista) {
                    if (i instanceof Camion) {
                        lista.remove(i);
                    }
                }
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
            }
        } while (choice < 8 || true);
    }
}
