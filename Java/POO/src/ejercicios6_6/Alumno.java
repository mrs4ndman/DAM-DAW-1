// Código Clase
package ejercicios6_6;

public class Alumno {
    private String Nombre, Apellidos;
    private float NotaFinal;

    public static int NumAlumnos;

    // Getters
    public String getNombre() { return Nombre; }
    public String getApellidos() { return Apellidos; }
    public float getNotaFinal() { return NotaFinal; }
    public static int getNumAlumnos() { return NumAlumnos; }

    // Setters
    public void setNombre(String nombre) { Nombre = nombre; }
    public void setApellidos(String apellidos) { Apellidos = apellidos; }
    public void setNotaFinal(float notaFinal) { NotaFinal = notaFinal; }
    public static void setNumAlumnos(int numAlumnos) {
        NumAlumnos = numAlumnos;
    }

    // Constructor
    public Alumno(String nombre, String apellidos, float notaFinal) {
        Nombre = nombre;
        Apellidos = apellidos;
        NotaFinal = notaFinal;
    }

    // Método toString del objeto propio
    @Override
    public String toString() {
        return "Alumno [Nombre=" + Nombre + ", Apellidos=" + Apellidos +
            ", NotaFinal=" + NotaFinal + "]";
    }
}
