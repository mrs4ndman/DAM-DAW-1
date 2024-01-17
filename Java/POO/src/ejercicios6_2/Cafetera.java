package ejercicios6_2;

public class Cafetera {
    /** Cantidad máxima de café (en c.c.) que puede contener la cafetera **/
    private int capacidadMaxima;

    /** Cantidad actual de café (en c.c.) que contiene la cafetera **/
    private int cantidadActual;

    // Getters
    public int getCapacidadMaxima() { return capacidadMaxima; }
    public int getCantidadActual() { return cantidadActual; }

    // Setters
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    /** Inicializamos la cafetera por defecto con 0 de café y 1000 c.c de máximo **/
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    /** Inicializamos la cafetera por defecto con el máximo de café ya rellena **/
    public Cafetera(int capacidadMax) { this.capacidadMaxima = capacidadMax; }

    /**
     * Inicializamos la cafetera por defecto con la cantidad
     * actual y el máximo de café
     */
    public Cafetera(int cantidadActual, int capacidadMax) {
        this.capacidadMaxima = capacidadMax;
        this.cantidadActual = cantidadActual;
        if (cantidadActual > this.capacidadMaxima) {
            cantidadActual = this.capacidadMaxima;
        }
    }

    /** Iguala la cantidad actual de café al máximo de café posible **/
    public void llenarCafetera() { this.cantidadActual = this.capacidadMaxima; }

    /** Simula la acción de servir una taza con la cantidad indicada **/
    public void servirTaza(int cantidadAServir) {
        if (cantidadAServir >= this.cantidadActual) {
            this.cantidadActual -= cantidadAServir;
        } else {
            cantidadAServir = this.cantidadActual;
        }
        System.out.printf("Se han servido %d c.c. en la taza", cantidadAServir);
        System.out.printf("Quedan %d c.c. en la cafetera", this.cantidadActual);
    }

    /** Pone la cantidad de café actual en cero **/
    public void vaciarCafetera() { this.cantidadActual = 0; }

    /**
     * Añade a la cafetera la cantidad de café indicada en el parámetro. Si esa  cantidad
     * excede el máximo, ajusta al máximo
     **/
    public void agregarCafetera(int cantidadASumar) {
        if (cantidadASumar < 0) {
            System.out.println("Error de suma");
        } else {
            if ((this.cantidadActual + cantidadASumar > this.capacidadMaxima)) {
                this.cantidadActual = this.capacidadMaxima;
            } else {
                this.cantidadActual += cantidadASumar;
            }
        }
    }
}
