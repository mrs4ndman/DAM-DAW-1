package ejercicios6_3;
public class Test {

    public static void main(String[] args) {
        // String dni = "12345678i";
        String dni = "";
        generarDNI(dni);
    }
    public static void generarDNI(String dni) {
        if (dni == "") {
            for (int i = 0; i < 7; i++) {
                dni += ((int)(Math.random() * 9));
            }
            String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            char letter = abc.charAt((int)(Math.random() * 26));
            dni += letter;
            System.out.println("DNI → " + dni);

        } else if (dni.matches("[0-9]{8}[A-Z]")) {
            System.out.println("Ya tiene un DNI");
            return;
        } else {
            System.out.println("Ya hay algo en el campo");
        }
    }
}
