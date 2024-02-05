package practica_11_7;

import java.util.ArrayList;

public class Conductor {
    private String DNI;
    private String nombre;
    private ArrayList<Muestra> muestras;
    public static int numConductores;

    // Getters
    public String getDNI() { return DNI; }
    public String getNombre() { return nombre; }
    public ArrayList<Muestra> getMuestras() { return muestras; }

    // Setters
    public void setDNI(String dNI) { DNI = dNI; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMuestras(ArrayList<Muestra> muestras) { this.muestras = muestras; }

    // Constructor grande
    public Conductor(String dNI, String nombre, ArrayList<Muestra> muestras) {
        DNI = dNI;
        this.nombre = nombre;
        this.muestras = muestras;
    }

    public static void colocarMuestras(ArrayList<Conductor> c, String dni, Muestra m) {
        for (Conductor i : c) {
            if (i.getDNI().equals(dni)) {
                i.muestras.add(m);
                return;
            }
        }
    }
    @Override
    public String toString() {
        return "Conductor [DNI=" + DNI + ", nombre=" + nombre + ", muestras=" + muestras +
            "]";
    }
}
