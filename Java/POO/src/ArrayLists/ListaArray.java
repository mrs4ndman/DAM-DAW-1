package ArrayLists;

import ejerciciosBasicos.ejercicio8.Motor;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ListaArray {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Motor> lista = new ArrayList<Motor>();
        Scanner userInput = new Scanner(System.in);
        Motor m1;
        int op ;//;
        int tipo_bomba;
        String tipo_fluido, tipo_combustible;

        do {
            op = menu();
            switch (op) {
            case 1:
                tipo_bomba = Integer.parseInt(
                    JOptionPane.showInputDialog("Dame el tipo de bomba"));
                tipo_fluido = JOptionPane.showInputDialog("Dame el tipo de fluido");
                tipo_combustible =
                    JOptionPane.showInputDialog("Dame el tipo de combustible");
                m1 = new Motor(tipo_bomba, tipo_fluido, tipo_combustible);
                lista.add(m1);
                break;
            case 2:
                do {
                    tipo_bomba = Integer.parseInt(JOptionPane.showInputDialog(
                        "Dime el tipo de bomba que quieres buscar"));
                } while (tipo_bomba < 1 || tipo_bomba > 5);

                break;
            case 3:
                break;
            case 4:
                for (Motor m : lista) {
                    System.out.println("Tipo de motor → " + m.getTipoBomba());
                    System.out.println("Tipo de fluido → " + m.getTipoFluido());
                    System.out.println("Tipo de combustible → " + m.getCombustible());
                    Thread.sleep(1000);
                }
                break;
            case 5:
                break;
            }
        } while (op != 5);

        userInput.close();
    }
    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.printf(
                "Introduce una opción de la lista: \r\n"
                +
                "1. Guardar motor en la lista (pedir posición por donde se guardará) \r\n"
                + "2. Mostrar un motor de la lista\r\n"
                + "3. Borrar un motor de la lista\r\n"
                + "4. Mostrar todos los motores de la lista\r\n"
                + "5. Salir\r\n");
            opcion = Integer.parseInt(teclado.nextLine());
        } while (opcion < 1 || opcion > 5);
        teclado.close();
        return opcion;
    }
}
