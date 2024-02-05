package practica_11_12;

public class Alarma {
    private int umbral;
    private Sensor sensor;
    private Timbre timbre;

    public int getUmbral() { return umbral; }
    public Sensor getSensor() { return sensor; }
    public Timbre getTimbre() { return timbre; }

    public void setUmbral(int umbral) { this.umbral = umbral; }
    public void setSensor(Sensor sensor) { this.sensor = sensor; }
    public void setTimbre(Timbre timbre) { this.timbre = timbre; }

    public int valorActual;
    private class Sensor {
        private int valorActual;

        public int getValorActual() { return valorActual; }
        public void setValorActual(int valorActual) { this.valorActual = valorActual; }
    }

    public void comprobar() {
        if (this.sensor.getValorActual() >= umbral) {
            timbre.activar();
        } else {
            timbre.desactivar();
        }
    }
}
