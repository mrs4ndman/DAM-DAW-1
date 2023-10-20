package estructurasAlternativas;

import java.util.Scanner;

public class SeleccionRara {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);

        float notaUsuario, edadUsuario;
        String generoUsuario;

        System.out.println("Dime tu nota");
        notaUsuario = dataInput.nextFloat();

        System.out.println("Dime tu edad");
        edadUsuario = dataInput.nextFloat();

        System.out.println("Dime tu género");
        generoUsuario = dataInput.next();

    if ( (notaUsuario >= 5) && (edadUsuario >= 18) && (generoUsuario.equals("M")) && generoUsuario.equals("F"))

        dataInput.close();
    }
}
