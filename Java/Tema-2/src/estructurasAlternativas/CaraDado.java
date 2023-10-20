package estructurasAlternativas;

import java.util.Scanner;

public class CaraDado {
    public static void main(String[] args) {
        Scanner dadoInput = new Scanner(System.in);

        int caraDada; 
        String caraDevuelta;

        System.out.println("Dime la cara del dado y te digo la opuesta");
        caraDada = dadoInput.nextInt();

        if (caraDada == 1) {
            caraDevuelta = "seis";
            System.out.println("La cara opuesta es el" + caraDevuelta);
        } else if (caraDada == 2) {
            caraDevuelta = "cinco";
            System.out.println("La cara opuesta es el" + caraDevuelta);
        } else if (caraDada == 3) {
            caraDevuelta = "cuatro";
            System.out.println("La cara opuesta es el" + caraDevuelta);
        } else if (caraDada == 4) {
            caraDevuelta = "tres";
            System.out.println("La cara opuesta es el" + caraDevuelta);
        } else if (caraDada == 5) {
            caraDevuelta = "dos";
            System.out.println("La cara opuesta es el" + caraDevuelta);
        } else if (caraDada == 6) {
            caraDevuelta = "uno";
            System.out.println("La cara opuesta es el" + caraDevuelta);
        }
        // SWITCH STATEMENT IMPL
        // switch (caraDada) {
        //     case 1:
        //     caraDevuelta = "seis";
        //     System.out.println("La cara opuesta es el" + caraDevuelta);
        //     break;
        //     case 2:
        //     caraDevuelta = "cinco";
        //     System.out.println("La cara opuesta es el" + caraDevuelta);
        //     break;
        //     case 3:
        //     caraDevuelta = "cuatro";
        //     System.out.println("La cara opuesta es el" + caraDevuelta);
        //     break;
        //     case 4:
        //     caraDevuelta = "tres";
        //     System.out.println("La cara opuesta es el" + caraDevuelta);
        //     break;
        //     case 5:
        //     caraDevuelta = "dos";
        //     System.out.println("La cara opuesta es el" + caraDevuelta);
        //     break;
        //     case 6:
        //     caraDevuelta = "uno";
        //     System.out.println("La cara opuesta es el" + caraDevuelta);
        //     break;
        // }

        dadoInput.close();
    }
}
