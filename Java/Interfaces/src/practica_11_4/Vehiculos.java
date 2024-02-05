package practica_11_4;

public class Vehiculos {
    private String matricula;
    private double velocidad;

    public Vehiculos(String matricula, double velocidad) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    // Getters
    public String getMatricula() { return matricula; }
    public double getVelocidad() { return velocidad; }

    // Setters
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public void setVelocidad(double velocidad) { this.velocidad = velocidad; }

    @Override
    public String toString() {
        return "Vehiculos [matricula=" + matricula + ", velocidad=" + velocidad + "]";
    }
}
