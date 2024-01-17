package ejerciciosBasicos.ejercicio1;

public class Persona1 {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;
    public Persona1(String nombre, String apellidos, int edad, boolean casado,
                   String numeroDocumentoIdentidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casado = casado;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setCasado(boolean casado) { this.casado = casado; }
    public void setDNI(String DNI) { this.numeroDocumentoIdentidad = DNI; }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public int getEdad() { return edad; }
    public boolean getCasado() { return casado; }
    public String getDNI() { return numeroDocumentoIdentidad; }
}
