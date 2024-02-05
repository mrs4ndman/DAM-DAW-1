package practica_11_14;

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

    public int getPuntoX() { return puntoX; }

    public void setPuntoX(int puntoX) { this.puntoX = puntoX; }

    public int getPuntoY() { return puntoY; }

    public void setPuntoY(int puntoY) { this.puntoY = puntoY; }
}
