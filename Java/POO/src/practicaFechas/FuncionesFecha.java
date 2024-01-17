package practicaFechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FuncionesFecha {

    /**
     * Calcula la edad.<br>
     * @param fechaNac → Objeto de tipo <i>LocalDate</i>
     * @return (Primitivo <i>int</i>) Edad en base a la <b>fecha de nacimiento</b>
     */
    public static int edad(LocalDate fechaNac) {
        return (int)ChronoUnit.YEARS.between(fechaNac, LocalDate.now());
    }

    /**
     * Override para usar <i>2 fechas, incluyendo la de nacimiento</i> en vez de una
     * @param fechaNac → Objeto de tipo <i>LocalDate</i>, fecha de nacimiento
     * @param fecha2 → Objeto de tipo <i>LocalDate</i>, otra fecha cualquiera
     * @return (Primitivo <i>int</i>) Edad entre 2 fechas concretas
     *
     */
    public static int edad(LocalDate fechaNac, LocalDate fecha2) {
        return (int)ChronoUnit.YEARS.between(fechaNac, LocalDate.now());
    }

    /**
     * Años entre 2 fechas
     * @param fecha1 → Objeto de tipo <i>LocalDate</i>, una fecha cualquiera
     * @param fecha2 → Objeto de tipo <i>LocalDate</i>, otra fecha cualquiera
     * @return (Primitivo <i>int</i>) Número de años entre las fechas dadas
     * */
    public static int anios(LocalDate fecha1, LocalDate fecha2) {
        return (int)ChronoUnit.YEARS.between(fecha1, LocalDate.now());
    }

    /**
     * Calcular los días entre 2 fechas dadas.<br>
     * @param fecha1 : Objeto de tipo <i>LocalDate</i>, una fecha cualquiera.
     * @param fecha2 : Objeto de tipo <i>LocalDate</i>, otra fecha cualquiera.
     * @return (Primitivo <i>int</i>) Días que quedan entre una fecha y otra.
     * */
    public static int dias_hasta(LocalDate fecha1, LocalDate fecha2) {
        return (int)ChronoUnit.DAYS.between(fecha1, fecha2);
    }

    /**
     * Calcular los <b><i>trienios</i></b> (<i>grupos de 3 años</i>) entre 2 fechas dadas
     * @param fecha1 : Objeto de tipo <i>LocalDate</i>, una fecha cualquiera
     * @param fecha2 : Objeto de tipo <i>LocalDate</i>, otra fecha cualquiera
     * @return (Primitivo <i>int</i>) Nº de trienios entre una fecha y otra
     * */
    public static int trienios(LocalDate fecha1, LocalDate fecha2) {
        return ((int)ChronoUnit.YEARS.between(fecha1, fecha2) / 3);
    }

    /**
     * Nos da el <b>día de la semana</b> en que cae la fecha dada<br>
     * @param fecha : Objeto de tipo <i>LocalDate</i>, una fecha cualquiera
     * @return (Objeto DayOfWeek) Día de la semana en que cae la fecha dada
     * */
    public static DayOfWeek diaDeSemana(LocalDate fecha) { return fecha.getDayOfWeek(); }

    public static LocalDate recogeFechas(String string_fecha) {
        if (!(string_fecha.matches("[0-9]{1,2}(-|/){1}[0-9]{1,2}(-|/)[0-9]{4}"))) {
            System.err.println("Error: La fecha no es correcta");
            return LocalDate.of(1, 1, 1);
        } else {
            String[] numInput = string_fecha.split("(-|/)");
            return LocalDate.of(Integer.parseInt(numInput[2]),
                                Integer.parseInt(numInput[1]),
                                Integer.parseInt(numInput[0]));
        }

    }
}
