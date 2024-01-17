package ejercicios6_8;

// Importamos las librerías nativas de Java para fechas.
import java.time.*;
import java.time.temporal.*;

public class Fecha {

    public static void main(String[] args) {
        LocalDate fecha1;
        fecha1 = LocalDate.now();
        LocalDate fecha2 = LocalDate.of(2022, 1, 22);

        LocalDate fNacimiento = LocalDate.of(2022, 1, 22);
        System.out.println(" DIFERENCIA ENTRE DOS FECHAS EN AÑOS: " +

                           ChronoUnit.YEARS.between(fNacimiento, LocalDate.now()) +
                           " años");

        System.out.println(" DIFERENCIA ENTRE DOS FECHAS EN DIAS: " +

                           ChronoUnit.DAYS.between(fNacimiento, LocalDate.now()) +
                           " DIAS");
        System.out.println(" diferencia entre fechas: " +
                           ChronoUnit.MONTHS.between(fNacimiento, LocalDate.now()) +
                           " MESES");

        System.out.println("La fecha actual es: " + LocalDate.now());

        System.out.println("La hora actual es: " + LocalTime.now());

        System.out.println("La fecha y hora actuales son: " + LocalDateTime.now());

        System.out.println("El instante actual es: " + Instant.now());

        System.out.println("La fecha y hora actuales con zona horaria son: " +
                           ZonedDateTime.now());

        System.out.println("Fecha de mi cumpleaños: " +
                           LocalDate.of(1972, Month.MAY, 23));

        fecha1 = fecha1.with(LocalDate.of(1972, Month.MAY, 23));

        fecha1 = LocalDate.of(2023, 1, 1);

        System.out.println(fecha1);
        System.out.println(fecha1.getDayOfMonth());
        System.out.println(fecha1.getMonth());
        System.out.println(fecha1.getYear());
        System.out.println(fecha1.getDayOfWeek());
        System.out.println("sumar 5 dias: " + fecha1.plusDays(5));
        System.out.println("sumar 5 meses: " + fecha1.plusMonths(5));
        System.out.println("sumar 5 años: " + fecha1.plusYears(5));
        System.out.println("sumar 5 semanas: " + fecha1.plusWeeks(5));

        System.out.println("La hora actual es:  " + LocalDateTime.now().getHour());
        System.out.println("El minuto actual es:  " + LocalDateTime.now().getMinute());
        System.out.println("El mes actual es:  " + LocalDateTime.now().getMonth());
        System.out.println("El día de la semana es: " +
                           LocalDateTime.now().getDayOfWeek());
        System.out.println("La hora actual es:  " + LocalDateTime.now().getHour());

        System.out.println("Dentro de 10 días será:  " + LocalDate.now().plusDays(10));

        System.out.println("Dentro de 2 semanas será:  " + LocalDate.now().plusWeeks(10));

        System.out.println("Dentro de 2 años será:  " + LocalDate.now().plusYears(2));

        System.out.println(" una fecha (25-4-2022):   " + LocalDate.of(2022, 4, 25));
    }
}
