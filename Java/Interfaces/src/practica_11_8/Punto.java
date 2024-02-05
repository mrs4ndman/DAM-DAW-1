package practica_11_8;

public class Punto {
    private int puntoX;
    private int puntoY;

    // Constructor
    public Punto(int X, int Y) {
        this.puntoX = X;
        this.puntoY = Y;
    }

    @Override
    public String toString() {
        return "Punto [puntoX=" + puntoX + ", puntoY=" + puntoY + "]";
    }
}
