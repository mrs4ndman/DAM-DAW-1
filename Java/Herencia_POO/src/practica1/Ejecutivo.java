package practica1;

public class Ejecutivo extends Empleado {
    protected String nombre;
    protected int numEjecutivo, sueldo;

    private int presupuesto;

    static private int contador = 0;

    public Ejecutivo() {
        super();
    }

    public Ejecutivo(String nombre, int sueldo, int presu) {
        super(nombre, sueldo);
        presupuesto = presu;
    }

    public void asignarPresupuesto(int p) {
        presupuesto = p;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
