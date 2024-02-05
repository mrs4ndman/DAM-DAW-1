package practica_11_8;

import java.util.Scanner;

public class UsaFiguras {

    private static int menu() {
        System.out.println("Elije una opción ↓");
        System.out.println("1. Guardar recta");
        System.out.println("2. Guardar cuadrado");
        System.out.println("3. Guardar círculo");
        System.out.println("4. Mostrar figuras 1D");
        System.out.println("5. Mostrar figuras 2D");
        System.out.println("6. Borrar figura");
        System.out.println("7. Salir");
        int res = Integer.parseInt(sc.nextLine());
        return res;
    }
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Dime el número de figuras a guardar");
        int tamanoArray = Integer.parseInt(sc.nextLine());

        Figura[] ArrayFiguras = new Figura[tamanoArray];
        int choice = 0;
        int posicIntroducir;

        do {
            choice = menu();
            switch (choice) {
            case 1:
                if (Figura.numFiguras > (tamanoArray - 1)) {
                    System.out.println("No se pueden añadir más rectas");
                    break;
                }
                System.out.println("Creando figura ↓");
                System.out.println();
                System.out.println("Coordenada X del primer punto ↓");
                int coordenadaRX1 = Integer.parseInt(sc.nextLine());
                System.out.println("Coordenada Y del primer punto ↓");
                int coordenadaRY1 = Integer.parseInt(sc.nextLine());
                System.out.println("Coordenada X del segundo punto ↓");
                int coordenadaRX2 = Integer.parseInt(sc.nextLine());
                System.out.println("Coordenada Y del segundo punto ↓");
                int coordenadaRY2 = Integer.parseInt(sc.nextLine());
                Punto c1 = new Punto(coordenadaRX1, coordenadaRY1);
                Punto c2 = new Punto(coordenadaRX2, coordenadaRY2);
                Recta nuevaRecta = new Recta("Rojo", c1, c2);
                posicIntroducir = Figura.introducirFigura(ArrayFiguras);
                ArrayFiguras[posicIntroducir] = nuevaRecta;
                break;
            case 2:
                if (Figura.numFiguras > (tamanoArray - 1)) {
                    System.out.println("No se pueden añadir más cuadrados");
                    break;
                }
                System.out.println("Creando cuadrado ↓");
                System.out.println();
                System.out.println("Coordenada X de la esquina ↓");
                int coordenadaEsquinaX = Integer.parseInt(sc.nextLine());
                System.out.println("Coordenada Y de la esquina ↓");
                int coordenadaEsquinaY = Integer.parseInt(sc.nextLine());
                System.out.println("Coordenada X del primer punto ↓");
                double lado = Integer.parseInt(sc.nextLine());
                Punto esquina = new Punto(coordenadaEsquinaX, coordenadaEsquinaY);
                Cuadrado nuevoCuadrado = new Cuadrado("Verde", "Azul", esquina, lado);
                posicIntroducir = Figura.introducirFigura(ArrayFiguras);
                ArrayFiguras[posicIntroducir] = nuevoCuadrado;
                break;
            case 3:
                if (Figura.numFiguras > (tamanoArray - 1)) {
                    System.out.println("No se pueden añadir más círculos");
                    break;
                }
                System.out.println("Creando círculo ↓");
                System.out.println();
                System.out.println("Coordenada X del centro ↓");
                int coordenadaCentroX = Integer.parseInt(sc.nextLine());
                System.out.println("Coordenada Y del centro ↓");
                int coordenadaCentroY = Integer.parseInt(sc.nextLine());
                System.out.println("Radio del círculo");
                double radio = Double.parseDouble(sc.nextLine());
                Punto centro = new Punto(coordenadaCentroX, coordenadaCentroY);
                Circulo nuevoCirculo = new Circulo("Azul", centro, radio);
                posicIntroducir = Figura.introducirFigura(ArrayFiguras);
                ArrayFiguras[posicIntroducir] = nuevoCirculo;
                break;
            case 4:
                System.out.println("Mostrando figuras 1D");
                for (Figura i : ArrayFiguras) {
                    if (i instanceof Figura1D) {
                        System.out.println(i.toString());
                    }
                }
                break;
            case 5:
                System.out.println("Mostrando figuras 2D");
                for (Figura i : ArrayFiguras) {
                    if (i instanceof Figura2D) {
                        System.out.println(i.toString());
                    }
                }
                break;
            case 6:
                System.out.println("Menú de borrar figura");
                System.out.println("De la siguiente lista, ¿cuál quieres borrar?");
                for (int i = 0; i < tamanoArray; i++) {
                    if (!(ArrayFiguras[i].equals(null))) {
                        System.out.printf("Posición: %s\nDatos → %s\n", i,
                                          ArrayFiguras[i].toString());
                    }
                }
                int borrar = Integer.parseInt(sc.nextLine());
                if (borrar < 0 || borrar > ArrayFiguras.length) {
                    System.out.println("Esa posición no se puede borrar");
                    break;
                } else {
                    ArrayFiguras[borrar] = null;
                    System.out.println("Posición borrada");
                    Figura.numFiguras--;
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
