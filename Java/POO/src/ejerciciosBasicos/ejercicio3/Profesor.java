package ejerciciosBasicos.ejercicio3;

public class Profesor {
    // Arguments
    private String nombre, apellidos;
    private int edad;
    private boolean casado, especialista;

    // Constructor vacío
    public Profesor() {}

    // Hacemos un override al constructor para poder tener objetos con o sin argumentos
    // Constructor con todos los parámetros
    public Profesor(String nombre, String apellidos, int edad, boolean casado,
                    boolean especialista) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casado = casado;
        this.especialista = especialista;
    }

    // Getters / Setters
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public int getEdad() { return edad; }
    public boolean getCasado() { return casado; }
    public boolean getEspecialista() { return especialista; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setCasado(boolean casado) { this.casado = casado; }
    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }
}
