package practica_11_4;

public class Coche extends Vehiculos {

    private int numPuertas;

    public Coche(String matricula, double velocidad, int numPuertas) {
        super(matricula, velocidad);
        this.numPuertas = numPuertas;
    }

    public int numeroPuertas() { return this.numPuertas; }

    @Override
    public String toString() {
        return super.toString() + " - Coches [numPuertas= " + numPuertas + "]";
    }
}
