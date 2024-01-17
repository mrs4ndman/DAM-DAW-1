package practicaFechas;

// Importamos las librerías nativas de Java para fechas.
import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoApp {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Empleado> lista = new ArrayList<Empleado>();
    private static Empleado buscarEmpleado(String dni) {
        for (Empleado i : lista) {
            if (i.getDni().equals(dni)) {
                return i;
            }
        }
        return null;
    }
    public static void main(String[] args) {

        int op, num, edad, anios, trienios, dias;
        String dniBuscado = "";

        boolean continuar = true;

        do {
            op = menu();
            if (op < 1 || op > 8) {
                break;
            }
            switch (op) {
            case 1:
                // String dni = sc.nextLine();
                // String nombre = sc.nextLine();
                System.out.println("Introduzca el DNI del empleado");
                String dni = sc.nextLine();
                System.out.println("Introduzca el nombre del empleado");
                String nombre = sc.nextLine();
                System.out.println(
                    "Introduzca la fecha de nacimiento del empleado (DD-MM-AAAA)");
                LocalDate fechaNac = FuncionesFecha.recogeFechas(sc.nextLine());
                System.out.println(
                    "Introduzca introduzca la feha de contratación del empleado (DD-MM-AAAA)");
                LocalDate fechaContrato = FuncionesFecha.recogeFechas(sc.nextLine());
                System.out.println("Introduzca el sueldo del empleado");
                float sueldo = sc.nextFloat();

                Empleado newEmp =
                    new Empleado(dni, nombre, fechaNac, fechaContrato, sueldo);
                // System.out.println(newEmp.toString());
                lista.add(newEmp);
                break;
            case 2:
                System.out.println("Dime el DNI del empleado");
                dniBuscado = sc.nextLine();
                System.out.println("Edad del empleado con DNI " + dniBuscado + " ↓");
                System.out.println(
                    FuncionesFecha.edad(buscarEmpleado(dniBuscado).getFechaNacimiento()));
                break;
            case 3:
                System.out.println("Dime el DNI del empleado");
                dniBuscado = sc.nextLine();
                System.out.println("Trienios en la empresa del empleado con DNI " +
                                   dniBuscado + " ↓");
                System.out.println(FuncionesFecha.trienios(
                    buscarEmpleado(dniBuscado).getFechaContrato(), LocalDate.now()));
                break;
            case 4:
                System.out.println("Dime el DNI del empleado");
                dniBuscado = sc.nextLine();
                System.out.println("Antiguedad en la empresa del empleado con DNI " +
                                   dniBuscado + " ↓");
                System.out.println(FuncionesFecha.anios(
                    buscarEmpleado(dniBuscado).getFechaContrato(), LocalDate.now()));
                break;
            case 5:
                System.out.println("Dime el DNI del empleado");
                dniBuscado = sc.nextLine();
                int aniosJubilacion =
                    FuncionesFecha.edad(buscarEmpleado(dniBuscado).getFechaNacimiento());
                if (aniosJubilacion > 65) {
                    System.out.println("Ya debería estar jubilado el empleado");
                } else {
                    System.out.println("Años para jubilación del empleado con DNI " +
                                       dniBuscado + " ↓");
                    System.out.println(65 - aniosJubilacion);
                }

                break;
            case 6:
                System.out.println("Dime el DNI del empleado");
                dniBuscado = sc.nextLine();
                System.out.println("Edad del empleado con DNI " + dniBuscado +
                                   " cuando fue contratado ↓");
                System.out.println(
                    FuncionesFecha.anios(buscarEmpleado(dniBuscado).getFechaNacimiento(),
                                         buscarEmpleado(dniBuscado).getFechaContrato()));
                break;
            case 7:
                System.out.println("Mostrando datos de todos los empleados");
                System.out.println();
                for (Empleado i : lista) {
                    System.out.println(i.toString());
                }
                break;

            default:
                break;
            }
        } while (true);
    }

    private static int menu() {
        System.out.println("Elije una opción ↓");
        System.out.println("1. Añadir empleado (Introducir datos)");
        System.out.println("2. Edad del empleado (Introducir DNI)");
        System.out.println(
            "3. Nº de trienios en la empresa del empleado (Introducir DNI)");
        System.out.println("4. Antiguedad en la empresa del empleado (Introducir DNI)");
        System.out.println("5. Años para jubilarse del empleado (Introducir DNI)");
        System.out.println("6. Edad cuando fue contratado (Introducir DNI)");
        System.out.println(
            "7. Mostrar todos los datos de todos los empleados (Introducir DNI)");
        System.out.println("Otro → Salir");
        int res = sc.nextInt();
        sc.nextLine();
        return res;
    }
}
