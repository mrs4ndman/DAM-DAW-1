package ejercicios6_5;

public class Parcela {

    private double metrosCuadrados;
    private String tipoExplotacion;

    // Getters
    public String getTipoExplotacion() { return tipoExplotacion; }
    public double getMetrosCuadrados() { return metrosCuadrados; }

    // Setters
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public void setTipoExplotacion(String tipoExplotacion) {
        this.tipoExplotacion = tipoExplotacion;
    }
}
