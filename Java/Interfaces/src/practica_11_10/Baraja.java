package practica_11_10;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private int size = 40;
    private ArrayList<Carta> pila = new ArrayList<Carta>(40);

    public Baraja() {}
    public Baraja(ArrayList<Carta> pila) { this.pila = pila; }
    // Getters
    public int getSize() { return size; }
    public ArrayList<Carta> getPila() { return pila; }

    // Setters
    public void setSize(int size) { this.size = size; }
    public void setPila(ArrayList<Carta> pila) { this.pila = pila; }

    public static void rellenarBaraja(Baraja b) {
        ArrayList<String> palos = new ArrayList<String>(4);
        palos.add("Oros");
        palos.add("Copas");
        palos.add("Espadas");
        palos.add("Bastos");
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                Carta add = new Carta(palos.get(j), i);
                b.pila.add(add);
            }
        }
        for (int i = 10; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                Carta add = new Carta(palos.get(j), i);
                b.pila.add(add);
            }
        }
        barajarCartas(b.pila);
    }

    public static void barajarCartas(ArrayList<Carta> cartas) {
        Collections.shuffle(cartas);
    }

    public static void sacarCartas(int num_cartas, Baraja b) {
        for (int i = 0; i < num_cartas; i++) {
            System.out.println("Carta → " + b.getPila().get(0).toString());
            b.getPila().remove(0);
        }
    }

    public Carta revelarPrimeraCarta() {
        Carta error = new Carta("0", 0);
        if (this.pila.size() > 0) {
            return this.pila.get(0);
        } else {
            System.out.println("ERROR: No nos quedan cartas");
            return error;
        }
    }

    public static void repartirCartas(Baraja b, Jugador x, int numero) {
        int cartasRestantes = b.getPila().size();
        if (cartasRestantes == 0) {
            System.out.println("No se pueden sacar más cartas");
            return;
        }
        if (cartasRestantes < numero) {
            System.out.println("No se pueden sacar más cartas");
            return;
        }
        for (int i = 0; i < numero; i++) {
            System.out.println("Carta → " + b.getPila().get(0).toString());
            x.getMano().add(b.getPila().get(0));
            b.getPila().remove(0);
        }
    }

    public static int cartasRestantes(Baraja b) { return b.getPila().size(); }

    public static void imprimirRestantes(Baraja b) {
        for (Carta c : b.getPila()) {
            System.out.println(c.toString());
        }
    }
}
