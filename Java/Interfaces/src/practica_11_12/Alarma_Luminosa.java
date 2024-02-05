package practica_11_12;

public class Alarma_Luminosa extends Alarma {
    private class Bombilla {
        private boolean luz;

        public boolean isLuz() { return luz; }
        public void setLuz(boolean luz_encendida) { this.luz = luz_encendida; }
    }

    public void comprobar() {
        if (this.sensor.getValorActual() >= umbral) {
            timbre.activar();
        } else {
            timbre.desactivar();
        }
    }
}
