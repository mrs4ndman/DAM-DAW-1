
package practica_11_8;

public abstract class Figura1D extends Figura {
    private Punto puntoInicio;
    private Punto puntoFin;

    public Figura1D(String colorBorde, Punto puntoInicio, Punto puntoFin) {
        super(colorBorde);
        this.puntoFin = puntoFin;
        this.puntoInicio = puntoInicio;
    }

    @Override
    public String toString() {
        return "Figura1D [puntoInicio=" + puntoInicio + ", puntoFin=" + puntoFin + "]";
    }
}
