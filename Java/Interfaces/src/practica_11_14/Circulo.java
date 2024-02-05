package practica_11_14;

public class Circulo extends Figura implements Relacionable, OperacionesFiguras {
    private Punto centro;
    private double radio;

    public Circulo(String colorBorde, Punto centro, double radio) {
        super(colorBorde);
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public void dibuja() {
        System.out.println("Se ha dibujado el cuadrado " + this.toString());
    }

    @Override
    public void borra() {
        System.out.println("Se ha borrado el cuadrado " + this.toString());
    }
    @Override
    public String toString() {
        return "Circulo [centro=" + centro + ", radio=" + radio + "]";
    }

    @Override
    public boolean esIgual(Figura b) {
        if (this.area() == ((Circulo)b).area())
            return true;
        else
            return false;
    }

    @Override
    public boolean esMayor(Figura b) {
        if (this.area() > ((Circulo)b).area())
            return true;
        else
            return false;
    }

    @Override
    public boolean esMenor(Figura b) {
        if (this.area() < ((Circulo)b).area())
            return true;
        else
            return false;
    }

    @Override
    public double area() {
        return (Math.pow(this.radio, 2) * PI);
    }

    // Implementación de los métodos de la interfaz
}
