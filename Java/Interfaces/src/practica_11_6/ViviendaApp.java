package practica_11_6;

import java.util.Scanner;

public class ViviendaApp {
    private static int menu() {
        System.out.println("Elije una opción ↓");
        System.out.println("1. Insertar vivienda");
        System.out.println("2. Insertar chalet");
        System.out.println("3. Insertar palacio");
        System.out.println("4. Mostrar viviendas");
        System.out.println("5. Mostrar palacioos");
        System.out.println("6. Borrar vivienda");
        System.out.println("7. Salir");
        int res = sc.nextInt();
        sc.nextLine();
        return res;
    }
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Dime el número de viviendas máximo a meter");
        int tamanoArray = sc.nextInt();

        Vivienda[] Viviendas = new Vivienda[tamanoArray];

        int choice = 0;
        double metrosCuad;
        String calleVivienda;
        int numeroVivienda;
        boolean hayJardin;
        int posicIntroducir;
        do {
            choice = menu();
            switch (choice) {
            case 1:
                if (Vivienda.numViviendasCreadas > (tamanoArray - 1)) {
                    System.out.println("No se pueden añadir más viviendas");
                    break;
                }
                System.out.println("Creando vivienda ↓");
                System.out.println();
                System.out.println("Metros cuadrados ↓");
                metrosCuad = Double.parseDouble(sc.nextLine());
                System.out.println("Calle ↓");
                calleVivienda = sc.nextLine();
                System.out.println("Número ↓");
                numeroVivienda = sc.nextInt();
                Vivienda nuevaVivienda =
                    new Vivienda(metrosCuad, calleVivienda, numeroVivienda);
                posicIntroducir = Vivienda.introducirVivienda(Viviendas);
                Viviendas[posicIntroducir] = nuevaVivienda;
                break;
            case 2:
                if (Vivienda.numViviendasCreadas > tamanoArray) {
                    System.out.println("No se pueden añadir más chalets ni viviendas");
                    break;
                }
                System.out.println("Creando chalet ↓");
                System.out.println();
                System.out.println("Calle ↓");
                calleVivienda = sc.nextLine();
                System.out.println("Número ↓");
                numeroVivienda = Integer.parseInt(sc.nextLine());
                System.out.println("¿Tiene jardín?");
                String respuesta = sc.nextLine();
                if (respuesta.charAt(0) == 'S' || respuesta.charAt(0) == 's') {
                    hayJardin = true;
                } else
                    hayJardin = false;
                Vivienda nuevoChalet =
                    new Chalet(calleVivienda, numeroVivienda, hayJardin);

                // for (int i = 0; i < tamanoArray; i++) {
                //     if (Viviendas[i].equals(null))
                // }
                posicIntroducir = Vivienda.introducirVivienda(Viviendas);
                Viviendas[posicIntroducir] = nuevoChalet;
                break;
            case 3:
                if (Vivienda.numViviendasCreadas > tamanoArray) {
                    System.out.println("No se pueden añadir más palacios ni viviendas");
                    break;
                }
                System.out.println("Creando palacio ↓");
                System.out.println();
                System.out.println("Metros cuadrados ↓");
                metrosCuad = Double.parseDouble(sc.nextLine());
                System.out.println("Calle ↓");
                calleVivienda = sc.nextLine();
                System.out.println("Número ↓");
                numeroVivienda = Integer.parseInt(sc.nextLine());
                System.out.println("¿Número de habitaciones jardín?");
                int numHabitaciones = Integer.parseInt(sc.nextLine());
                Vivienda nuevoPalacio = new Palacio(metrosCuad, calleVivienda,
                                                    numeroVivienda, numHabitaciones);
                posicIntroducir = Vivienda.introducirVivienda(Viviendas);
                Viviendas[posicIntroducir] = nuevoPalacio;
                break;
            case 4:
                System.out.println("Imprimiendo viviendas");
                for (Vivienda i : Viviendas) {
                    if (!(i == null)) {
                        System.out.println(i.toString());
                    }
                }
                break;
            case 5:
                System.out.println("Imprimiendo palacios");
                for (Vivienda i : Viviendas) {
                    if (i instanceof Palacio) {
                        System.out.println(i.toString());
                    }
                }
                break;
            case 6:
                System.out.println("De la siguiente lista, ¿cuál quieres borrar?");
                for (int i = 0; i < tamanoArray; i++) {
                    if (!(Viviendas[i].equals(null))) {
                        System.out.printf("Posición: %s\nDatos → %s\n", i,
                                          Viviendas[i].toString());
                    }
                }
                int borrar = Integer.parseInt(sc.nextLine());
                if (borrar < 0 || borrar > Viviendas.length) {
                    System.out.println("Esa posición no se puede borrar");
                    break;
                } else {
                    Viviendas[borrar] = null;
                    System.out.println("Posición borrada");
                    Vivienda.numViviendasCreadas--;
                }
                break;
            case 7:
                return;
            default:
                break;
            }
        } while (choice < 7 || true);
    }
}
