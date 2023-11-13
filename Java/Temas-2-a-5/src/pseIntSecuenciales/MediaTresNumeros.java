package pseIntSecuenciales;

import java.util.Scanner;

public class MediaTresNumeros {
    public static void main(String[] args) {
        double Numero1, Numero2, Numero3, Media;

        Scanner InputMedia = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero: ");
        Numero1 = InputMedia.nextDouble();

        System.out.println("Introduzca el segundo numero: ");
        Numero2 = InputMedia.nextDouble();

        System.out.println("Introduzca el tercer numero: ");
        Numero3 = InputMedia.nextDouble();

        Media = (Numero1 + Numero2 + Numero3) / 3;

        System.out.println("La media es " + Media);

        InputMedia.close();
    }
}
