package practica1;

public class EmpleadoApp {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Jose Alonso", 1200);
        System.out.println(emp1);
        // emp1.subirSueldo();

        Ejecutivo ejec = new Ejecutivo("Juan Cabrera", 2000, 300);
        System.out.println();

        ejec.asignarPresupuesto(1500);
        ejec.subirSueldo(10);
        Ejecutivo ejec1 = new Ejecutivo();
        System.out.println(ejec.toString());

        System.out.println("Número de trabajadores creados: " +
                           Empleado.NumTrabajadores());
        System.out.println(ejec1.toString());
    }
}
