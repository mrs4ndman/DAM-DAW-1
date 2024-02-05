package practica_11_14;

public class Recta extends Figura1D implements Relacionable {
    public Recta(String colorBorde, Punto puntoInicio, Punto puntoFin) {
        super(colorBorde, puntoInicio, puntoFin);
    }

    public double longitud() {
        Punto a = this.getPuntoFin();
        Punto b = this.getPuntoInicio();
        return Math.sqrt((a.getPuntoX() - b.getPuntoX()) +
                         (a.getPuntoY() - b.getPuntoY()));
    }

    @Override
    public void dibuja() {
        System.out.println("Se ha dibujado la recta " + this.toString());
    }

    @Override
    public void borra() {
        System.out.println("Se ha borrado la recta " + this.toString());
    }

    @Override
    public String toString() {
        return "Recta [] → " + super.toString();
    }

    @Override
    public boolean esIgual(Figura b) {
        if (this.longitud() == ((Recta)b).longitud())
            return true;
        else
            return false;
    }

    @Override
    public boolean esMayor(Figura b) {
        if (this.longitud() > ((Recta)b).longitud())
            return true;
        else
            return false;
    }

    @Override
    public boolean esMenor(Figura b) {
        if (this.longitud() < ((Recta)b).longitud())
            return true;
        else
            return false;
    }
}
