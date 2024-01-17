package ejerciciosBasicos.ejercicio6;

public class Rueda {
    private String tipo, marca;
    private double grosor, diametro;

    // Getters
    public String getTipo() { return tipo; }
    public String getMarca() { return marca; }
    public double getGrosor() { return grosor; }
    public double getDiametro() { return diametro; }

    // Setters
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setGrosor(double grosor) { this.grosor = grosor; }
    public void setDiametro(double diametro) { this.diametro = diametro; }

    /**
     * Constructor para inicializar en vacío.
     **/
    public Rueda() {
        this.tipo = "Normal";
        this.marca = "Ninguna";
        this.grosor = 0.3;
        this.diametro = 1;
    }
    public void comprobarDimensiones() {
        // Comprobamos diámetro
        if (this.diametro > 1.4) {
            System.out.println("La rueda es para un vehículo grande");
        } else if (this.diametro <= 1.4 && this.diametro > 0.8) {
            System.out.println("La rueda es para un vehículo mediano");
        } else {
            System.out.println("La rueda es para un vehículo pequeño");
        }

        // Comprobamos diámetro + grosor
        if ((this.diametro > 1.4 && this.grosor < 0.4) ||
            ((this.diametro <= 1.4 && this.diametro > 0.8) && this.grosor < 0.25)) {
            System.out.println("El grosor para esta rueda es inferior al recomendado");
        }
    }
}
