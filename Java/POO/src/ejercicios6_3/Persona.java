package ejercicios6_3;

public class Persona {
    final char H = 'H';
    final char M = 'M';
    private String nombre = "", dni = "";
    private int edad = 0;
    private char sexo = M;
    private float peso = 0, altura = 0;

    // Getters
    // public char getSexo() { return sexo; }
    // public float getPeso() { return peso; }
    // /** Se da en centímetros, se tiene que dividir entre 100 para operar **/
    // public float getAltura() { return altura; }
    // public String getNombre() { return nombre; }
    // public String getDni() { return dni; }
    // public int getEdad() { return edad; }

    // Setters
    public void setEdad(int edad) { this.edad = edad; }
    public void setSexo(char sexo) { this.sexo = sexo; }
    public void setPeso(float peso) { this.peso = peso; }
    /** Se da en centímetros, se tiene que dividir entre 100 para operar **/
    public void setAltura(float altura) { this.altura = altura; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    // public void setDni(String dni) { this.dni = dni; }

    // CONSTRUCTORES
    /** Constructor: Por defecto, sin parámetros **/
    public Persona() {}

    /** Constructor: Por defecto, menos DNI y nombre **/
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        generarDNI();
    }

    /** Constructor: Todos los atributos menos peso y altura **/
    public Persona(String nombre, String dni, int edad, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(sexo);
        generarDNI();
    }

    /** Constructor: Todos los atributos **/
    public Persona(String nombre, String dni, int edad, char sexo, float peso,
                   float altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(sexo);
        generarDNI();
    }

    // MÉTODOS
    /**
     * Calcula el IMC, devuelve:
     * -1 → Por debajo de 20.
     * 0 → Entre 20 y 25.
     * +1 → Por encima de 25.
     */
    public int calcularIMC() {
        final int POR_DEBAJO = -1;
        final int IDEAL = 0;
        final int SOBREPESO = 1;
        float formula = ((this.peso) / (float)Math.pow((this.altura / 100), 2));

        if (formula < 20) {
            return POR_DEBAJO;
        } else if (formula >= 20 && formula <= 25) {
            return IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    /** Devuelve verdadero si la persona es mayor de edad (18 o más) **/
    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    /** Fija el valor de sexo a M si es incorrecto el valor **/
    private void comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return;
        } else {
            setSexo('M');
        }
    }
    /**
     * Método toString para imprimir todos los valores del objeto.
     * Devuelve una string*
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad +
            ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + "]";
    }

    /** Generador DNI: 8 letras + Cifra aleatoria. Se invoca al crear el objeto **/
    private void generarDNI() {
        if (this.dni == "") {
            for (int i = 0; i < 7; i++) {
                this.dni += ((int)(Math.random() * 9));
            }
            String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            char letter = abc.charAt((int)(Math.random() * 26));
            this.dni += letter;
            System.out.println("DNI → " + this.dni);
            return;
        } else if (dni.matches("[0-9]{8}[A-Z]")) {
            System.out.println("Ya tiene un DNI");
            System.out.println(this.dni);
            return;
        } else {
            this.dni = "";
        }
    }
}
