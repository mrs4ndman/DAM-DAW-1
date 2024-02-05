package practica_11_4;

public class Camion extends Vehiculos {

    private Remolque tipoRemolque;

    public Camion(String matricula, double velocidad, Remolque tipoRemolque) {
        super(matricula, velocidad);
        this.tipoRemolque = tipoRemolque;
    }

    public Remolque getTipoRemolque() { return tipoRemolque; }

    public void setTipoRemolque(Remolque tipoRemolque) {
        this.tipoRemolque = tipoRemolque;
    }

    @Override
    public String toString() {
        return super.toString() + " - Camion [tipoRemolque=" + tipoRemolque + "]";
    }

    public void ponRemolque(Remolque remolque) { this.setTipoRemolque(remolque); }
    public void quitaRemolque(Camion camion) { this.setTipoRemolque(null); }
}
