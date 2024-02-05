package practica_11_8;

public class Circulo extends Figura {
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
}
