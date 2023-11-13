package ejerciciosArrays;

import java.util.Scanner;

public class DatosAlumnos {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Dime el número de alumnos ↓");
        int numero_alumnos = userInput.nextInt();

        // Arrays de almacenamiento
        String[] nombresAlumnos = new String[numero_alumnos];
        int[] edadesAlumnos = new int[numero_alumnos];

        // Variables de entrada
        String entrada_nombre;
        int entrada_edad;
        int contador_corte = 0;
        // Recogemos los datos por cada alumnos
        for (int i = 0; i < numero_alumnos; i++) {
            System.out.println("Dime el nombre del alumno nº " + (i + 1));
            entrada_nombre = userInput.next();
            if (entrada_nombre.equals("*")) {
                break;
            }
            contador_corte++;
            nombresAlumnos[i] = entrada_nombre;
            System.out.println("Dime la edad del alumno nº " + (i + 1));
            entrada_edad = userInput.nextInt();
            edadesAlumnos[i] = entrada_edad;
        }
        if (contador_corte != (numero_alumnos - 1)) {
            numero_alumnos = contador_corte;
        }
        int aux;
        System.out.println("Si hay alumnos mayores de 19 años, se mostrarán a continuación");
        // Ordenamos los 2 arrays en sincronía
        for (int j = 0; j < numero_alumnos; j++) {
            for (int k = 0; k < (numero_alumnos - j - 1); k++) {
                if (edadesAlumnos[k] > edadesAlumnos[k + 1]) {
                    aux = edadesAlumnos[k];
                    edadesAlumnos[k] = edadesAlumnos[k + 1];
                    edadesAlumnos[k + 1] = aux;
                    String aux_string = nombresAlumnos[k];
                    nombresAlumnos[k] = nombresAlumnos[k + 1];
                    nombresAlumnos[k + 1] = aux_string;
                }
            }
        }
        for (int j = 0; j < numero_alumnos; j++) {
            if (edadesAlumnos[j] > 18) {
                System.out.println("Alumno: " + nombresAlumnos[j] + " - Edad: " + edadesAlumnos[j]);
            }
        }
        System.out.println("¿Cuantos alumnos mayores quieres comprobar?");
        int cantidad_alumnos_mayores = userInput.nextInt();
        for (int l = 0; l < cantidad_alumnos_mayores; l++) {
            System.out.println("Alumno: " + nombresAlumnos[((numero_alumnos - 1) - l)]);
            System.out.println("Edad: " + edadesAlumnos[((numero_alumnos - 1) - l)]);
        }

        userInput.close();
    }
}
