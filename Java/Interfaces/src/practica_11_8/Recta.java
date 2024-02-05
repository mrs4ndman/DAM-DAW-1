package practica_11_8;

public class Recta extends Figura1D {
    public Recta(String colorBorde, Punto puntoInicio, Punto puntoFin) {
        super(colorBorde, puntoInicio, puntoFin);
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
}
