package retoJava;

import java.util.Scanner;

public class retoRomboEsquinaAr_I {
    public static void main(String[] args) {
        // Inicializamos nuestra instancia del Scanner
        Scanner numInput = new Scanner(System.in);

        // Declaramos todas las variables necesarias
        long forwardsIterator, backwardsIterator, spaceIterator, forwards, backwards, userNum, spacerCount;

        // Recogemos el input del usuario
        System.out.println("Dime un número y te genero el rombo");
        userNum = numInput.nextLong();

        // Seteamos el contador de espacios
        spacerCount = userNum;
        // Bucle A -> parte de arriba
        for (forwardsIterator = 1; forwardsIterator < (userNum + 1); forwardsIterator++) {
            // Espacios previos
            for (spaceIterator = (spacerCount - forwardsIterator); spaceIterator > 0; spaceIterator--) {
                System.out.print(" ");
            }
            // Cuenta hacia adelante
            for (forwards = 0; forwards < forwardsIterator; forwards++) {
                System.out.print(forwards + 1);
            }
            // Cuenta hacia atrás
            // for (backwards = (forwardsIterator - 1); backwards > 0; backwards--) {
            //     System.out.print(backwards);
            // }
            // Siguiente línea
            System.out.println("");
        }
        // Bucle B -> parte de abajo
        // for (backwardsIterator = (userNum - 1); backwardsIterator > 0; backwardsIterator--) {
        //     // Espacios previos
        //     for (spaceIterator = (spacerCount - backwardsIterator); spaceIterator > 0; spaceIterator--) {
        //         System.out.print(" ");
        //     }
        //     // Cuenta hacia adelante
        //     for (forwards = 1; forwards < (backwardsIterator + 1); forwards++) {
        //         System.out.print(forwards);
        //     }
        //     // Cuenta hacia atrás
        //     for (backwards = (backwardsIterator); backwards > 1; backwards--) {
        //         System.out.print(backwards - 1);
        //     }
        //     // Siguiente línea
        //     System.out.println("");
        // }
        // Cerramos el leak de memoria jejeje
        numInput.close();
    }
}
