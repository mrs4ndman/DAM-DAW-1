package practicasClase;

import java.util.Scanner;

public class PrimerScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables de entrada / input del usuario
        int numerito;
        double numDecimal;
        String pepito;

        System.out.println("Hola mundo");

        System.out.print("Dame un número: ");

        // Inicializamos el Scanner heredado para recoger un int
        numerito = sc.nextInt();

        // Escribimos lo recogido por la instancia del scanner en pantalla
        System.out.println(numerito);


        System.out.print("Dame un número con decimales: ");

        numDecimal = sc.nextDouble();

        // Escribimos lo recogido por la instancia del scanner en pantalla
        System.out.println(numDecimal);

        System.out.print("Dame una serie de palabras: ");
        sc.nextLine();

        pepito = sc.nextLine();

        // Escribimos lo recogido por la instancia del scanner en pantalla
        System.out.println(pepito);


        // Cerramos el Scanner heredado
        sc.close();
    }
}
