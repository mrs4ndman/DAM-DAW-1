
package practica_11_8;

public abstract class Figura2D extends Figura {
    private String colorRelleno;

    public Figura2D(String colorBorde, String colorRelleno) {
        super(colorBorde);
        this.colorRelleno = colorRelleno;
    }

    @Override
    public String toString() {
        return "Figura2D [colorRelleno=" + colorRelleno +
            ", toString() = " + super.toString() + ", + ]";
    }
}
