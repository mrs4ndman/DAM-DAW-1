package practica_11_6;

import java.util.ArrayList;

public class Vivienda {
    private double metros_cuadrados;
    private String calle;
    private int numero;
    public static int numViviendasCreadas;

    public Vivienda() {
        this.metros_cuadrados = 0;
        this.calle = "";
        this.numero = 0;
        Vivienda.numViviendasCreadas++;
    }

    public Vivienda(double metros_cuadrados, String calle, int numero) {
        this.metros_cuadrados = metros_cuadrados;
        this.calle = calle;
        this.numero = numero;
        Vivienda.numViviendasCreadas++;
    }

    @Override
    public String toString() {
        return "Vivienda [metros_cuadrados=" + metros_cuadrados + ", calle=" + calle +
            ", numero=" + numero + "]";
    }

    // Getters
    public double getMetros_cuadrados() { return metros_cuadrados; }
    public String getCalle() { return calle; }
    public int getNumero() { return numero; }

    // Setters
    public void setMetros_cuadrados(double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }
    public void setCalle(String calle) { this.calle = calle; }
    public void setNumero(int numero) { this.numero = numero; }
    public static int introducirVivienda(Vivienda[] i) {
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
