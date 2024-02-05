package practica_11_8;

public abstract class Figura {
    private String colorBorde;
    private void cambiaColorBorde(String color) {}
    private String dameColorBorde(Figura figura) { return this.colorBorde; }

    public abstract void dibuja();
    public abstract void borra();
    public static int numFiguras;

    // Constructor
    public Figura(String colorBorde) {
        this.colorBorde = colorBorde;
        numFiguras++;
    }

    // Helper para introducir en el hueco libre del array
    public static int introducirFigura(Figura[] i) {
        int val = 0;
        for (int b = 0; b < i.length; b++) {
            if (i[b] == (null)) {
                val = b;
                break;
            }
        }
        return val;
    }
}
