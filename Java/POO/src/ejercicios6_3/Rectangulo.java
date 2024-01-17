package ejercicios6_3;

public class Rectangulo {
    private int base, altura;

    public int getBase() { return base; }
    public int getAltura() { return altura; }

    /** Constructor con solo base y altura **/
    public Rectangulo(int base, int altura) {
        if (altura <= 0) {
            System.err.println("Altura equivocada (" + altura +
                               "), se baja a 1");
            altura = 1;
        }
        if (base <= 0) {
            System.err.println("Base equivocada (" + base + "), se baja a 1");
            altura = 1;
        }
        this.altura = altura;
        this.base = base;
    }
    public Rectangulo(int lado) {
        this.base = lado;
        this.altura = lado;
    }

    // Métodos
    public long calcularPerimetro() {
        long perimetro = (2 * (this.base + this.altura));
        return perimetro;
    }

    public long calcularAreaFigura() {
        long area = (this.base * this.altura);
        return area;
    }

    public boolean esMasAlto(Rectangulo r) {
        boolean ret = (this.altura > r.altura) ? true : false;
        return ret;
    }

    public boolean esMasAncho(Rectangulo r) {
        boolean ret = (this.base > r.base) ? true : false;
        return ret;
    }

    public int compararArea(Rectangulo r) {
        if (calcularAreaFigura() < r.calcularAreaFigura()) {
            return -1;
        } else if (calcularAreaFigura() == r.calcularAreaFigura()) {
            return 0;
        } else if (calcularAreaFigura() > r.calcularAreaFigura()) {
            return 1;
        }
        return 1;
    }
}
