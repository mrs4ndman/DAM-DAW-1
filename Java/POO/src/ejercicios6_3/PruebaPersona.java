package ejercicios6_3;

import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Creador de personas ↓");
        System.out.println("Introduzca los datos");

        System.out.println("Dame el nombre");
        String nombre = userInput.nextLine();
        System.out.println("Dame el DNI");
        String dni = userInput.nextLine();
        System.out.println("Dame la edad");
        int edad = Integer.parseInt(userInput.nextLine());
        System.out.println("Dame el sexo");
        char sexo = userInput.next().charAt(0);
        System.out.println("Dame el peso");
        float peso = userInput.nextFloat();
        System.out.println("Dame la altura");
        float altura = userInput.nextFloat();

        Persona p1 = new Persona(nombre, dni, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, dni, edad, sexo);
        Persona p3 = new Persona();

        p2.setPeso(50);
        p2.setAltura((float)175.3);
        p3.setSexo('H');
        p3.setAltura(4);
        p3.setEdad(4);
        p3.setNombre("Pepe Pepón");
        p3.setPeso(4);
        String p1mayor = p1.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad";
        String p2mayor = p2.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad";
        String p3mayor = p3.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad";

        System.out.println("Persona 1 → " + interpretarIMC(p1, p1.calcularIMC()));
        System.out.println("Persona 2 → " + interpretarIMC(p2, p2.calcularIMC()));
        System.out.println("Persona 3 → " + interpretarIMC(p3, p3.calcularIMC()));
        System.out.println("Persona 1 → " + p1mayor);
        System.out.println("Persona 2 → " + p2mayor);
        System.out.println("Persona 3 → " + p3mayor);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        userInput.close();
    }
    public static String interpretarIMC(Persona persona, int resultado) {
        if (persona.calcularIMC() == -1) {
            return "Por debajo del IMC recomendable";
        } else if (persona.calcularIMC() == 0) {
            return "En un IMC sano";
        } else {
            return "IMC de sobrepeso";
        }
    }
}
