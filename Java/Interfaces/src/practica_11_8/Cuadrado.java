package practica_11_8;

public class Cuadrado extends Figura2D {
    private Punto puntoEsquina;
    private double lado;
    public Cuadrado(String colorBorde, String colorRelleno, Punto puntoEsquina,
                    double lado) {
        super(colorBorde, colorRelleno);
        this.puntoEsquina = puntoEsquina;
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado [puntoEsquina=" + puntoEsquina + ", lado=" + lado + "]";
    }

    @Override
    public void dibuja() {
        System.out.println("Se ha dibujado el cuadrado " + this.toString());
    }

    @Override
    public void borra() {
        System.out.println("Se ha borrado el cuadrado " + this.toString());
    }
}
