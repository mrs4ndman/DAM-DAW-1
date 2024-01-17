package ejercicios6_4;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    // private String string_fecha;

    private static int[] dias = {0,  31, 28, 31, 30, 31, 30,
                                 31, 31, 30, 31, 30, 31};
    private int checkDia(int dia) {
        if ((dia < 1) || (dia > dias[this.mes])) {
            System.out.println("El día dado ha sido " + dia +
                               ", debería de estar entre 1 y 31");
            return 1;
        } else {
            return dia;
        }
    }
    private int checkMes(int mes) {
        if (mes < 1 || mes > 12) {
            System.out.println("El mes dado ha sido " + mes +
                               ", debería de estar entre 1 y 12");
            return 1;
        } else {
            return mes;
        }
    }
    private int checkAnio(int anio) {
        if (anio < 0) {
            System.out.println("El año dado ha sido " + anio +
                               ", debería de estar por encima de 0");
            return 2022;
        } else {
            return anio;
        }
    }
    public Fecha(int dia, int mes, int anio) {
        this.anio = checkAnio(anio);
        this.mes = checkMes(mes);
        this.dia = checkDia(dia);
    }
    public Fecha(String string_fecha) {
        if (!(string_fecha.matches(
                "[0-9]{1,2}(-|/){1}[0-9]{1,2}(-|/)[0-9]{4}"))) {
            System.err.println("Error: La fecha no es correcta");
            this.anio = 2022;
            this.mes = 1;
            this.dia = 1;
        } else {
            String[] numInput = string_fecha.split("(-|/)");
            this.anio = checkAnio(Integer.parseInt(numInput[2]));
            this.mes = checkMes(Integer.parseInt(numInput[1]));
            this.dia = checkDia(Integer.parseInt(numInput[0]));
        }
    }
    @Override
    public String toString() {
        return "Fecha [dia=" + this.dia + ", mes=" + this.mes +
            ", anio=" + this.anio + "]";
    }

    /**
     * Devuelve 1 si el input es null, -1 si es mayor, 0 si es igual, y 1 si es
     * menor*
     */
    public int comparar(Fecha f) {
        if (f == null) {
            System.out.println("La fecha dada es nula");
            return 1;
        }
        if (f.anio >= this.anio) {
            if (f.mes >= this.mes) {
                if (f.dia == this.dia)
                    return 0;
                if (f.dia > this.dia)
                    return -1;
            } else
                return 1;
        } else
            return 1;
        return 1;
    }

    public void addDays(int dias_dados) {
        if ((this.dia + dias_dados) < 1 ||
            ((this.dia + dias_dados) > dias[this.mes])) {
            System.out.println(
                "ERROR → Cambio de mes → No es posible sumar el número de días");
        } else {
            this.dia += dias_dados;
        }
    }
    public void addMonths(int meses_dados) {
        if (((this.mes + meses_dados) < 1) || (this.mes + meses_dados) > 12) {
            System.out.println(
                "ERROR → Cambio de año → No es posible sumar el número de meses");
        } else {
            this.mes += meses_dados;
        }
    }
    public void addYears(int anios_dados) {
        if ((this.anio + anios_dados) < 1 ||
            ((this.anio + anios_dados) > 2023)) {
            System.out.println("ERROR → No es posible sumar el número de años");
        } else {
            this.anio += anios_dados;
        }
    }
}
