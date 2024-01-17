package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ListaEnterosOrdenada {
    public static void main(String[] args) {
        ArrayList<Integer> lista_numeros = new ArrayList<Integer>();
        int op;
        int userInput = -1, swap = 0;
        do {
            op = menu();
            switch (op) {
            case 1:
                // int iter = 0;
                userInput = Integer.parseInt(
                    JOptionPane.showInputDialog("Dime el número a meter"));
                if (lista_numeros.isEmpty() ||
                    userInput > lista_numeros.get(lista_numeros.size() - 1)) {
                    lista_numeros.add(userInput);
                } else {
                    while (swap < lista_numeros.size()) {
                        if (userInput > lista_numeros.get(lista_numeros.size() - (swap + 1))) {
                            lista_numeros.add(swap, userInput);
                            swap++;
                        } else lista_numeros.add(swap, userInput);
                    }
                }
                // lista_numeros.add(userInput);
                // Collections.sort(lista_numeros);
                break;
            case 2:
                for (int i = 0; i < lista_numeros.size(); i++) {
                    System.out.print(lista_numeros.get(i) + " ← ");
                }
                break;
            default:
                for (int i = 0; i < lista_numeros.size(); i++) {
                    System.out.print(lista_numeros.get(i) + " ");
                    System.out.println();
                }
                break;
            }
        } while (op != 3 || userInput != 0);
    }
    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.printf("Introduce una opción de la lista: \r\n"
                              + "1. Introducir número en la lista\r\n"
                              + "2. Imprimir estado actual de la lista\r\n"
                              + "3 o más. Imprimir la lista y terminar\r\n");
            opcion = Integer.parseInt(teclado.nextLine());
        } while (opcion < 1 || opcion > 5);
        teclado.close();
        // teclado.close();
        return opcion;
    }
}
