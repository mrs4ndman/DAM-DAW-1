package estructurasAlternativas;

import java.util.Scanner;

public class ViajeEstudios {
    public static void main(String[] args) {
        Scanner studentInput = new Scanner(System.in);

        long numAlumnos, costeBus, costePorAlumno, costeFinal;

        System.out.println("Dime el número de alumnos que van al viaje");
        numAlumnos = studentInput.nextLong();

        if (numAlumnos >= 100) {
            costePorAlumno = 65;
            costeFinal = costePorAlumno * numAlumnos;
            System.out.println("El coste por alumno son " + costePorAlumno + " euros, y el pago a la compañía de autobuses es de " + costeFinal + " euros.");
        }
        if (numAlumnos <= 99 && numAlumnos >= 50) {
            costePorAlumno = 70;
            costeFinal = costePorAlumno * numAlumnos;
            System.out.println("El coste por alumno son " + costePorAlumno + " euros, y el pago a la compañía de autobuses es de " + costeFinal + " euros.");
        }
        if (numAlumnos <= 49 && numAlumnos >= 30) {
            costePorAlumno = 95;
            costeFinal = costePorAlumno * numAlumnos;
            System.out.println("El coste por alumno son " + costePorAlumno + " euros, y el pago a la compañía de autobuses es de " + costeFinal + " euros.");
        }
        if (numAlumnos <= 29 && numAlumnos > 0) {
            costeBus = 4000;
            costePorAlumno = costeBus / numAlumnos;
            System.out.println("El coste por alumno son " + costePorAlumno + " euros, y el pago a la compañía de autobuses es de " + costeBus + " euros.");
        } else {
            System.out.println("Número de alumnos inválido");
        }

        studentInput.close();
    }
}
