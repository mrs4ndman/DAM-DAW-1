
package practica_11_6;

public class Palacio extends Vivienda {
    private int numeroHabitaciones;
    public Palacio() {}
    public Palacio(double metros_cuadrados, String calle, int numero,
                   int numeroHabitaciones) {
        super(metros_cuadrados, calle, numero);
        this.numeroHabitaciones = numeroHabitaciones;
    }
    @Override
    public String toString() {
        return super.toString() + " + Palacio [numeroHabitaciones=" + numeroHabitaciones + "]";
    }
    // Getter
    public int getNumeroHabitaciones() { return numeroHabitaciones; }
    // Setter
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }
}
