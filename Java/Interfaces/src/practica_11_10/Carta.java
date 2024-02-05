package practica_11_10;

public class Carta {

    private String palo;
    private int numero;

    // Getters
    public String getPalo() { return palo; }
    public int getNumero() { return numero; }

    // Setters
    public void setPalo(String palo) { this.palo = palo; }
    public void setNumero(int numero) { this.numero = numero; }

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta [palo=" + palo + ", numero=" + numero + "]";
    }
}
