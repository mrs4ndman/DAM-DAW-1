package practicasClase;

public class AmbitoVariables {
    static int variableGlobal = 10; // Accesible para todas los métodos de la clase
    public static void main(String[] args) {
        int variableDelMain = 10;
        System.out.println(" variableGLobal: " + variableGlobal);
        System.out.println(" variableDelMain: " + variableDelMain);
        otroMetodo();

    }
    static void otroMetodo(){
        int variableDeOtroMetodo = 90;
        System.out.println(" variableGlobal: " + variableGlobal);
        System.out.println(" variableDeOtroMetodo: " + variableDeOtroMetodo);
        /* Aquí se pueden usar variableGlobal y variableDeOtroMetodo, pero no 
         * variableDelMain */
        // System.out.println(" variableDelMain: " + variableDelMain);
    }
}
