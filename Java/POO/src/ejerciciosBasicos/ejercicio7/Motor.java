package ejerciciosBasicos.ejercicio7;

public class Motor {
    private int tipoBomba;
    private String tipoFluido, combustible;

    // Getters
    public int getTipoBomba() { return tipoBomba; }
    public String getTipoFluido() { return tipoFluido; }
    public String getCombustible() { return combustible; }

    // Setters
    public void setTipoBomba(int tipoBomba) { this.tipoBomba = tipoBomba; }
    public void setTipoFluido(String tipoFluido) { this.tipoFluido = tipoFluido; }
    public void setCombustible(String combustible) { this.combustible = combustible; }

    public Motor() {
        this.tipoBomba = 0;
        this.tipoFluido = "Ninguno";
        this.combustible = "Ninguno";
    }

    public void dimeTipoMotor() {
        switch (this.tipoBomba) {
        case 0:
            System.out.println(
                "No hay establecido un valor definido para el tipo de motor");
            break;
        case 1:
            System.out.println("El motor es un motor de agua");
            break;
        case 2:
            System.out.println("El motor es un motor de gasolina");
            break;
        case 3:
            System.out.println("El motor es un motor de hormigón");
            break;
        case 4:
            System.out.println("El motor es un motor de pasta alimenticia");
            break;
        default:
            System.out.println("No se puede clasificadr el motor");
            break;
        }
    }
}
