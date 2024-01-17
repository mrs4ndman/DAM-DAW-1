package ejercicios6_4;

import java.util.Scanner;

public class PruebaEcuacion {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        char respuesta = ' ';
        do {
            System.out.println("Dime el valor para a");
            int a = userInput.nextInt();
            System.out.println("Dime el valor para a");
            int b = userInput.nextInt();
            System.out.println("Dime el valor para a");
            int c = userInput.nextInt();

            Ecuacion2Grado ecuacionUsuario = new Ecuacion2Grado(a, b, c);

            int soluciones = ecuacionUsuario.numSoluciones();
            System.out.println("La ecuación tiene " + soluciones + " soluciones");
            if (soluciones == 0) {
                System.out.println("No existen raíces");
            } else if (soluciones == 1) {
                System.out.println("La única raíz de la ecuación es " +
                                   ecuacionUsuario.solucion1());
            } else {
                System.out.println("Las raíces son " + ecuacionUsuario.solucion1() +
                                   " y " + ecuacionUsuario.solucion2());
            }

            System.out.println("¿Quieres resolver otra ecuación?");
            respuesta = userInput.next().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');

        userInput.close();
    }
}
