package ejerciciosBasicos.ejercicio6;

public class PruebaRueda {
    public static void main(String[] args) {
        // Declaramos los objetos de las 4 ruedas
        Rueda rueda1, rueda2, rueda3, rueda4;

        // Usamos el constructor por defecto de la clase
        rueda1 = new Rueda();
        rueda2 = new Rueda();
        rueda3 = new Rueda();
        rueda4 = new Rueda();

        // Usamos los setters para colocar los parámetros deseados
        rueda1.setDiametro(1.5);
        rueda1.setGrosor(0.3);
        rueda2.setDiametro(1.2);
        rueda2.setGrosor(0.2);
        rueda3.setDiametro(0.5);
        rueda3.setGrosor(0.3);
        rueda4.setDiametro(1.5);
        rueda4.setGrosor(0.9);

        // Usamos el método final para ver los efectos de las condiciones if
        rueda1.comprobarDimensiones();
        rueda2.comprobarDimensiones();
        rueda3.comprobarDimensiones();
        rueda4.comprobarDimensiones();
    }
}
