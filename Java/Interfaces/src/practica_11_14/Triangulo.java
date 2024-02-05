package practica_11_14;

public class Triangulo extends Figura {
    private double altura;
    private double base;

    public Triangulo(String colorBorde, double base, double altura) {
        super(colorBorde);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibuja() {
        System.out.println("Dibujo un triángulo");
    }

    @Override
    public void borra() {
        System.out.println("Borro un triángulo");
    }
}
