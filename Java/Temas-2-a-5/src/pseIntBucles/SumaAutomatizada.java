package pseIntBucles;

import java.util.Scanner;

public class SumaAutomatizada {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        long numUsuario, lastNumber, cuentaMedia, sumaNumeros, mediaNumeros;

        System.out.println("Ve dicéndome números");
        numUsuario = numInput.nextLong();

        sumaNumeros = 0;
        cuentaMedia = 0;
        mediaNumeros = 0;
        lastNumber = 0;

        while (numUsuario != 0) {
            System.out.println("Ve dicéndome números");
            numUsuario = numInput.nextLong();
            ++cuentaMedia;
            sumaNumeros = sumaNumeros + numUsuario;
            mediaNumeros = (sumaNumeros / cuentaMedia);
            lastNumber = numUsuario;
        }
        cuentaMedia -= 1;

        if (sumaNumeros != 0 || cuentaMedia != 0 || lastNumber != 0) {
            System.out.println("La suma de todos los números es " + sumaNumeros);
            System.out.println("La media es de " + mediaNumeros);
        } else {
            System.out.println("Me diste 0, se acabó");
            System.out.println("La suma de todos los números es " + sumaNumeros);
            System.out.println("La media es de " + mediaNumeros);
        }

        numInput.close();
    }
}
