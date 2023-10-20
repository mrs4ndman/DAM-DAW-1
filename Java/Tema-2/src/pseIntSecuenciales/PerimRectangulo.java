package pseIntSecuenciales;

import java.util.Scanner;

public class PerimRectangulo {
    public static void main(String[] args) {
        int altura, base, perimetro, area;
        Scanner inputter = new Scanner(System.in);

        System.out.println("Dime la longitud de la altura del rectángulo:");
        altura = inputter.nextInt();
    
        System.out.println("Dime la longitud de la base del rectángulo:");
        base = inputter.nextInt();

        perimetro = ( base * 2 ) + ( altura * 2 );
        area = base * altura;

        System.out.println("El perímetro vale " + perimetro);
        System.out.println("El área vale " + area);

        inputter.close();
    }
}
