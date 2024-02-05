package practica_11_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    // Por si queremos añadir input del usuario, descomentar esto
    private static int menu() {
        System.out.println("Elije una opción ↓");
        System.out.println("1. Crear nueva baraja");
        System.out.println("2. Crear jugadores");
        System.out.println("3. Repartir 4 cartas a cada jugador");
        System.out.println("4. Indicar cuantas cartas quedan");
        System.out.println("5. Mostrar las cartas de cada jugador");
        System.out.println("6. Mostrar las cartas restantes");
        System.out.println("7. Salir");
        int res = Integer.parseInt(sc.nextLine());
        return res;
    }
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Baraja baraja = new Baraja();

        // Imprimimos los datos de las cartas restantes
        System.out.println("Cartas restantes ↓");
        Baraja.imprimirRestantes(baraja);

        int choice = 0;

        do {
            choice = menu();
            switch (choice) {
            case 1:
                // La barajamos aleatoriamente
                baraja.getPila().clear();
                Baraja.rellenarBaraja(baraja);
                break;
            case 2:
                System.out.println("¿Cuántos jugadores quieres que haya?");
                int numJugadores = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < numJugadores; i++) {
                    ArrayList<Carta> mano = new ArrayList<Carta>();
                    System.out.println("Dime el nombre");
                    String nombreJugador = sc.nextLine();
                    Jugador nuevoJugador = new Jugador(nombreJugador, mano);
                    Jugador.listaJugadores.add(nuevoJugador);
                }
                break;
            case 3:
                for (Jugador i : Jugador.listaJugadores) {
                    Baraja.repartirCartas(baraja, i, 4);
                }
                break;
            case 4:
                break;
            case 5:
                // Imprimimos el nº de cartas restantes
                System.out.println("Quedan " + Baraja.cartasRestantes(baraja) +
                                   " cartas");
                break;
            case 6:
                // Imprimimos las cartas de cada jugador
                for (Jugador i : Jugador.listaJugadores) {
                    Jugador.verCartasJugador(i);
                }
                break;
            case 7:
                // Imprimimos los datos de las cartas restantes
                System.out.println("Cartas restantes ↓");
                Baraja.imprimirRestantes(baraja);
                return;
            default:
                break;
            }
        } while (choice < 7 || true);
    }
}
