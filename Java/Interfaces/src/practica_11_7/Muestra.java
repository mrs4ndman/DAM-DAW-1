package practica_11_7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Muestra {
    private LocalDateTime diaYHora;
    private String codigoPuesto;
    private String matriculaVehiculo;
    private float tasaAlcohol;

    // Getters
    public LocalDateTime getDiaYHora() { return diaYHora; }
    public String getCodigoPuesto() { return codigoPuesto; }
    public String getMatriculaVehiculo() { return matriculaVehiculo; }
    public float getTasaAlcohol() { return tasaAlcohol; }

    // Setters
    public void setDiaYHora(LocalDateTime diaYHora) { this.diaYHora = diaYHora; }
    public void setCodigoPuesto(String codigoPuesto) { this.codigoPuesto = codigoPuesto; }
    public void setMatriculaVehiculo(String matriculaVehiculo) {
        this.matriculaVehiculo = matriculaVehiculo;
    }
    public void setTasaAlcohol(float tasaAlcohol) { this.tasaAlcohol = tasaAlcohol; }
    public Muestra(LocalDateTime diaYHora, String codigoPuesto, String matriculaVehiculo,
                   float tasaAlcohol) {
        this.diaYHora = diaYHora;
        this.codigoPuesto = codigoPuesto;
        this.matriculaVehiculo = matriculaVehiculo;
        this.tasaAlcohol = tasaAlcohol;
    }

    @Override
    public String toString() {
        return "Muestra [diaYHora=" + diaYHora + ", codigoPuesto=" + codigoPuesto +
            ", matriculaVehiculo=" + matriculaVehiculo + ", tasaAlcohol=" + tasaAlcohol +
            "]";
    }
    /**
     * Para convertir de una <i>String</i> a un objeto <i>LocalDate</i>
     * @param string_hora Formato DD:MM:AAAA
     * */
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

    /**
     * Validamos el código del puesto con formato Letra-Letra-Nº-Nº
     * @param  Type and description of the parameter.
     * */
    public static boolean validarCodigo(String string_input) {
        if (!(string_input.matches("[0-9]{2}[a-zA-Z]{2}"))) {
            return false;
        }
        return true;
    }

    public static boolean validarMatrícula(String matricula) {
        if (!matricula.matches("[0-9]{4}[a-zA-Z]{3}")) {
            return false;
        }
        return true;
    }

    /**
     * Para convertir de una <i>String</i> a un objeto <i>LocalTime</i>
     * @param string_hora Formato HH:MM:SS
     * */
    public static LocalTime recogerHora(String string_hora) {
        if (!(string_hora.matches("[0-9]{1,2}:[0-9]{1,2}:[0-9]{1,2}"))) {
            System.err.println("Error: La hora no es correcta");
            return LocalTime.of(0, 0, 0);
        } else {
            String[] numInput = string_hora.split(":");
            return LocalTime.of(Integer.parseInt(numInput[0]),
                                Integer.parseInt(numInput[1]),
                                Integer.parseInt(numInput[2]));
        }
    }

    /**
     * Aglutinador que combina un objeto <i>LocalDate</i> y otro <i>LocalTime</i>
     * @param fecha Objeto LocalDate
     * @param hora Objeto LocalTime
     * */
    public static LocalDateTime combinarFechaYHora(LocalDate fecha, LocalTime hora) {
        return LocalDateTime.of(fecha, hora);
    }
}
