package practica_11_14;

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

    public Punto getPuntoInicio() {
        return puntoInicio;
    }

    public void setPuntoInicio(Punto puntoInicio) {
        this.puntoInicio = puntoInicio;
    }

    public Punto getPuntoFin() {
        return puntoFin;
    }

    public void setPuntoFin(Punto puntoFin) {
        this.puntoFin = puntoFin;
    }
}
