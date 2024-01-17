package ejercicios6_4;

// import java.lang.Double;
public class Ecuacion2Grado {
    private int a;
    private int b;
    private int c;

    public Ecuacion2Grado(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() { return a; }
    public int getB() { return b; }
    public int getC() { return c; }

    private int discriminante() {

        int discriminante = ((int)Math.pow(this.b, this.b) - (4 * this.a * this.c));
        return discriminante;
    }
    public int numSoluciones() {
        if (discriminante() > 0) {
            return 2;
        } else if (discriminante() < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public double solucion1() {
        switch (numSoluciones()) {
        case 0:
            System.err.println("No tiene soluciones");
            return Double.MIN_VALUE;
        case 1:
            double s_unique = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;
            return s_unique;
        case 2:
            double s1 = (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;
            return s1;
        default:
            return 1.0;
        }
    }
    public double solucion2() {
        switch (numSoluciones()) {
        case 0:
            System.err.println("No tiene soluciones");
            return Double.MIN_VALUE;
        case 1:
            double s_unique = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;
            return s_unique;
        case 2:
            double s2 = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;
            return s2;
        }
        return 1;
    }
}
