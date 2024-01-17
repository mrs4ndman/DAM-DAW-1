package ejercicios6_3;

import java.util.Scanner;

public class PruebaRectangulo {
    private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Dime la base y la altura del primer rectángulo");
        System.out.println("Base");
        int b1 = Integer.parseInt(userInput.next());
        System.out.println("Altura");
        int a1 = Integer.parseInt(userInput.next());
        Rectangulo r1 = new Rectangulo(b1, a1);

        System.out.println("Dime la base y la altura del segundo rectángulo");
        System.out.println("Base");
        int b2 = Integer.parseInt(userInput.next());
        System.out.println("Altura");
        int a2 = Integer.parseInt(userInput.next());
        Rectangulo r2 = new Rectangulo(b2, a2);

        System.out.println("Área y perímetro del primer rectángulo");
        System.out.println("Área");
        System.out.println(r1.calcularAreaFigura());
        System.out.println("Perímetro");
        System.out.println(r1.calcularPerimetro());
        System.out.println("Área y perímetro del segundo rectángulo");
        System.out.println("Área");
        System.out.println(r2.calcularAreaFigura());
        System.out.println("Perímetro");
        System.out.println(r2.calcularPerimetro());

        if (r1.getAltura() > r2.getAltura()) {
            System.out.println("El primer rectángulo es más alto");
        } else if (r1.getAltura() < r2.getAltura()) {
            System.out.println("El primer rectángulo es más alto");
        } else
            System.out.println("Tienen la misma altura");
    }
}
