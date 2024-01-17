package ejercicios6_4;

import java.util.Scanner;

public class PruebaFecha {
    private static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        // Datos obj 1
        System.out.println("Dime los datos para la primera fecha");
        System.out.println("Día ↓");
        int d1 = Integer.parseInt(userInput.nextLine());
        System.out.println("Mes ↓");
        int m1 = Integer.parseInt(userInput.nextLine());
        System.out.println("Año ↓");
        int a1 = Integer.parseInt(userInput.nextLine());

        // Datos obj 2
        System.out.println("Dime los datos para la segunda fecha");
        String fecha_usuario = userInput.next();
        userInput.nextLine();

        // Creamos los objetos
        Fecha f1 = new Fecha(d1, m1, a1);
        Fecha f2 = new Fecha(fecha_usuario);

        // Imprimimos los objetos
        System.out.println(f1.toString());
        System.out.println(f2.toString());

        // Comparamos
        System.out.println("Resultado de primera comparación → " +
                           f2.comparar(f1));

        // Preguntamos las cantidades a sumar a una fecha
        System.out.println("¿Cuantos días sumas?");
        int dias_sumar = Integer.parseInt(userInput.nextLine());
        System.out.println("¿Cuantos meses sumas?");
        int meses_sumar = Integer.parseInt(userInput.nextLine());
        System.out.println("¿Cuantos años sumas?");
        int anios_sumar = Integer.parseInt(userInput.nextLine());

        // Sumamos las cantidades
        f1.addDays(dias_sumar);
        f1.addMonths(meses_sumar);
        f1.addYears(anios_sumar);

        // Volvemos a comparar
        System.out.println("Resultado de segunda comparación → " +
                           f2.comparar(f1));
    }
}
