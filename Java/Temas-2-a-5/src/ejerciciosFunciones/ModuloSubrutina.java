package ejerciciosFunciones;

import java.util.Scanner;

public class ModuloSubrutina {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        long userInput = numInput.nextLong();
        ModuleIterator(userInput);

        numInput.close();
    }
    public static void ModuleIterator(long N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Módulo ejecutándose");
        }
    }
}
