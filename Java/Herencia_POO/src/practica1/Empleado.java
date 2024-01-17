package practica1;

public class Empleado {
    protected String nombre;
    protected int numEmpleado, sueldo;

    public static int contador = 0;

    public Empleado() {
        contador++;
        this.numEmpleado = contador;
    }

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        contador++;
        this.numEmpleado = contador;
    }

    public void subirSueldo(int porcentajeSubida) {
        sueldo += (int)(sueldo * (porcentajeSubida / 100));
    }

    public static int NumTrabajadores() {
        return contador;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", numEmpleado=" + numEmpleado +
            ", sueldo=" + sueldo + "]";
    }
}
