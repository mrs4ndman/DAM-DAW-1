package ejercicios6_7;

public class AparatoElectrico {
    private String nombre;
    private double potencia;
    private boolean encendido = false;
    public static double consumoElectrico = 0;

    // Getters
    public String getNombre() { return nombre; }
    public double getPotencia() { return potencia; }
    public boolean isEncendido() { return encendido; }
    public static double getConsumoElectrico() { return consumoElectrico; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPotencia(double potencia) { this.potencia = potencia; }
    public static void setConsumoElectrico(double consumoElectrico) {
        AparatoElectrico.consumoElectrico = consumoElectrico;
    }
    public void encender(boolean encendido) {
        if (this.encendido = true) {
            return;
        } else {
            this.encendido = true;
            setConsumoElectrico(AparatoElectrico.consumoElectrico +
                                this.potencia);
        }
    }
    public void apagar(boolean encendido) {
        if (this.encendido = false) {
            return;
        } else {
            this.encendido = false;
            {
                setConsumoElectrico(AparatoElectrico.consumoElectrico -
                                    this.potencia);
            }
        }
    }

    // Constructor
    public AparatoElectrico(String nombre, double potencia) {
        this.nombre = nombre;
        this.potencia = potencia;
    }
}
