package practica_11_6;

public class Chalet extends Vivienda {
    private boolean tieneJardin;
    public Chalet() {}
    public Chalet(String calle, int numero, boolean tieneJardin) {
        super(120, calle, numero);
        this.tieneJardin = tieneJardin;
    }
    // Getter
    public boolean isTieneJardin() { return tieneJardin; }
    @Override
    public String toString() {
        return super.toString() + " + Chalet [tieneJardin=" + tieneJardin + "]";
    }
    // Setter
    public void setTieneJardin(boolean tieneJardin) { this.tieneJardin = tieneJardin; }
}
