package practicaFechas;

import java.time.LocalDate;

public class Empleado {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaContrato;
    private float sueldo;

    // Getters
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public LocalDate getFechaContrato() { return fechaContrato; }
    public float getSueldo() { return sueldo; }

    // Setters
    public void setDni(String dni) { this.dni = dni; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    public void setSueldo(float sueldo) { this.sueldo = sueldo; }

    // Método toString :)
    @Override
    public String toString() {
        return "Empleado [dni=" + dni + ", nombre=" + nombre +
            ", fechaNacimiento=" + fechaNacimiento +
            ", fechaContrato=" + fechaContrato + ", sueldo=" + sueldo + "]";
    }

    // Constructor principal
    public Empleado(String dni, String nombre, LocalDate fechaNacimiento,
                    LocalDate fechaContrato, float sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
        this.sueldo = sueldo;
    }
}
