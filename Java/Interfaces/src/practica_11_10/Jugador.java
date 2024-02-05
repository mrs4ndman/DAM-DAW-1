package practica_11_10;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> mano = new ArrayList<Carta>();

    public static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

    public ArrayList<Carta> getMano() { return mano; }
    public String getNombre() { return nombre; }

    public void setMano(ArrayList<Carta> mano) { this.mano = mano; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Jugador(String nombre, ArrayList<Carta> mano) {
        this.nombre = nombre;
        this.mano = mano;
        listaJugadores.add(this);
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", mano=" + mano + "]";
    }

    public static void verCartasJugador(Jugador x) {
        System.out.println(x.getMano().toString());
    }
}
