package ejercicios6_8;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmpleadoApp {
    private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Dime el DNI");
        String newDNI = userInput.next();
        System.out.println("Dime el nombre");
        String newNombre = userInput.next();
        System.out.println("Dime el sueldo");
        int newSueldo = userInput.nextInt();

        // Creamos el objeto
        Empleado emp1 = new Empleado(newDNI, newNombre, LocalDate.of(1984, 12, 27),
                                     LocalDate.of(2006, 02, 28), newSueldo);

        int edadEmpleado =
            (int)ChronoUnit.YEARS.between(emp1.getFechaNacimiento(), LocalDate.now());
        // Debería salir 39
        System.out.println("Edad del empleado → " + edadEmpleado);
        System.out.println("Años para la jubilación → " + (65 - edadEmpleado));

        int edadContratacion = (int)(ChronoUnit.YEARS.between(emp1.getFechaNacimiento(),
                                                              emp1.getFechaContrato()));

        System.out.println("Edad cuando fue contratado → " + edadContratacion);

        int tiempoContratado =
            (int)ChronoUnit.YEARS.between(emp1.getFechaContrato(), LocalDate.now());
        int trieniosEmpleado = tiempoContratado / 3;
        System.out.println("Trienios del empleado en la empresa → " + trieniosEmpleado);

        System.out.println((int)ChronoUnit.DAYS.between(
            LocalDate.of(emp1.getFechaNacimiento().getYear(),
                         emp1.getFechaNacimiento().getMonthValue(),
                         emp1.getFechaNacimiento().getDayOfMonth()),
            LocalDate.now()));

        System.out.println("Días para su próximo cumpleaños → "
                           + "");
    }
}
