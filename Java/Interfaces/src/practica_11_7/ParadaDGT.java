package practica_11_7;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ParadaDGT {
    private static int menu() {
        System.out.println("Elije una opción ↓");
        System.out.println("1. Introducir un nuevo conductor");
        System.out.println("2. Introducir muestra");
        System.out.println("3. Mostrar datos de un conductor (Introducir DNI)");
        System.out.println("4. Mostrar las muestras de un conductor (Introducir DNI)");
        System.out.println("5. Mostrar los datos de todos los conductores");
        System.out.println("6. Salir");
        int res = Integer.parseInt(sc.nextLine());
        return res;
    }
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Conductor> ArrayConductores = new ArrayList<Conductor>();

        int choice;
        do {
            choice = menu();
            switch (choice) {
            case 1:
                System.out.println("Creando conductor ↓");
                System.out.println();
                System.out.println("Nombre ↓");
                String nombre = sc.nextLine();
                System.out.println("DNI ↓");
                String DNI = sc.nextLine();
                ArrayList<Muestra> nuevasMuestras = new ArrayList<Muestra>();
                Conductor nuevoConductor = new Conductor(DNI, nombre, nuevasMuestras);
                ArrayConductores.add(nuevoConductor);
                break;
            case 2:
                if (ArrayConductores.isEmpty()) {
                    System.out.println("No hay conductores para colocarles muestras");
                    return;
                }
                System.out.println("Creando muestra ↓");
                System.out.println();
                System.out.println("Día de la muestra (Formato DD:MM:AAAA)");
                String stringDia = sc.nextLine();
                System.out.println("Hora de la muestra (Formato HH:MM:SS)");
                String stringHora = sc.nextLine();
                System.out.println(
                    "Código del puesto de control preventivo (Formato Letra-Letra-Nº-Nº)");
                String codPuesto = sc.nextLine();
                System.out.println(
                    "Matrícula del vehículo (Formato: 4 Números y 3 letras)");
                String matriculaVehiculo = sc.nextLine();
                System.out.println("Tasa de alcohol (Formato: Entero.Decimales)");
                float tasaAlcohol = Float.parseFloat(sc.nextLine());
                System.out.println(
                    "DNI del conductor al que se le han tomado las muestras");
                String dniConductor = sc.nextLine();
                // if (!Muestra.validarCodigo(codPuesto) ||
                //     !Muestra.validarMatrícula(matriculaVehiculo)) {
                //     return;
                // }
                LocalDateTime fechaCompleta = Muestra.combinarFechaYHora(
                    Muestra.recogeFechas(stringDia), Muestra.recogerHora(stringHora));

                Muestra nuevaMuestra =
                    new Muestra(fechaCompleta, codPuesto, matriculaVehiculo, tasaAlcohol);

                Conductor.colocarMuestras(ArrayConductores, dniConductor, nuevaMuestra);
                break;
            case 3:
                System.out.println("Dime el DNI del que quieres sacar los datos");
                String dniABuscar = sc.nextLine();
                for (Conductor i : ArrayConductores) {
                    if (i.getDNI().equals(dniABuscar)) {
                        System.out.println(i.toString());
                        return;
                    }
                }
                break;
            case 4:
                System.out.println("Dime el DNI del que quieres sacar las muestras");
                String dniMuestras = sc.nextLine();
                for (Conductor i : ArrayConductores) {
                    if (i.getDNI().equals(dniMuestras)) {
                        System.out.println(i.getMuestras().toString());
                        return;
                    }
                }
                break;
            case 5:
                System.out.println("Mostrando datos de todos los conductores");
                for (Conductor i : ArrayConductores) {
                    System.out.println(i.toString());
                }
                break;
            default:
                break;
            }
        } while (choice != 6 || choice > 0 || choice < 7 || true);
    }
}
