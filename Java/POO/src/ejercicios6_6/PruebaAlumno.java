// Código programa
package ejercicios6_6;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAlumno {
    private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        String select = " ";
        while (!(select.equals("salir"))) {
            System.out.println(
                "Elige una de las siguientes opciones ↓ ( Escribe 1, 2, 3, 4, 5 o Salir)");
            System.out.println("1. Crear alumno");
            System.out.println("2. Mostrar datos de alumno");
            System.out.println("3. Calcular nota media");
            System.out.println("4. Mostrar número de aprobados");
            System.out.println("5. Mostrar número de suspensos");
            System.out.println("Salir → Termina el programa");
            System.out.println();
            String eleccion = userInput.nextLine();
            if (eleccion.equalsIgnoreCase("Salir")) {
                return;
            }
            switch (eleccion) {
            case "1":
                System.out.println("Dime el nombre del alumno ↓");
                String nombreAlumno = userInput.nextLine();

                System.out.println("Dime los apellidos del alumno ↓");
                String apellidoAlumno = userInput.nextLine();

                System.out.println("Dime su nota final ↓");
                float notaAlumno = userInput.nextFloat();
                userInput.nextLine();

                Alumno nuevo =
                    new Alumno(nombreAlumno, apellidoAlumno, notaAlumno);

                listaAlumnos.add(nuevo);
                // Subimos la cuenta
                Alumno.NumAlumnos++;
                System.out.println();
                System.out.println();
                break;
            case "2":
                System.out.println(
                    "Dime el nombre del alumno para el que quieres los datos");
                String a_buscar = userInput.nextLine();
                for (Alumno i : listaAlumnos) {
                    if (i.getNombre().equals(a_buscar)) {
                        System.out.println(i.toString());
                    }
                }
                System.out.println();
                System.out.println();
                break;
            case "3":
                // Imprimimos la cuenta
                System.out.println("Número de alumnos → " +
                                   Alumno.getNumAlumnos());
                float sumaNotas = 0;
                for (Alumno j : listaAlumnos) {
                    sumaNotas += j.getNotaFinal();
                }
                // System.out.println("Suma notas → " + sumaNotas);
                System.out.println("Nota media de los alumnos → " +
                                   (float)(sumaNotas / Alumno.NumAlumnos));
                break;
            case "4":
                int mas_que_5 = 0;
                for (Alumno k : listaAlumnos) {
                    if (k.getNotaFinal() >= 5) {
                        mas_que_5++;
                    }
                }
                System.out.println(
                    "Número de alumnos aprobados (nota mayor o igual a 5) → " +
                    mas_que_5);
                break;
            case "5":
                int menos_que_5 = 0;
                for (Alumno l : listaAlumnos) {
                    if (l.getNotaFinal() < 5) {
                        menos_que_5++;
                    }
                }
                System.out.println(
                    "Número de alumnos suspensos (nota menor que 5) → " +
                    menos_que_5);
                break;
            default:
                System.out.println("Opción no válida");
                System.out.println();
                System.out.println();
                break;
            }
        }

        // Ejemplo de 0 a 10
        int numeroAleatorio = (int) (Math.random()) * 10;
    }
}
