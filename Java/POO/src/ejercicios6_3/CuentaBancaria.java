package ejercicios6_3;

public class CuentaBancaria {
    private long num_cuenta;
    private String nif_o_nie;
    private String nombre;
    private String apellido;
    private double cantidad_dinero;
    /** Creación de cuenta bancaria con 0 de dinero y los datos del titular **/
    public CuentaBancaria(long num_cuenta, String nif_o_nie, String nombre,
                          String apellido) {
        this.num_cuenta = generarNumero();
        this.nif_o_nie = nif_o_nie;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantidad_dinero = 0;
    }
    /** Creación de cuenta bancaria con los datos del titular y la cantidad de dinero **/
    public CuentaBancaria(long num_cuenta, String nif_o_nie, String nombre,
                          String apellido, double cantidad_dinero) {
        this.num_cuenta = num_cuenta;
        this.nif_o_nie = nif_o_nie;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantidad_dinero = cantidad_dinero;
    }
    /** Crea un long entre 1000000 y 99999999 **/
    private long generarNumero() {
        long pepe = (int)(Math.random() * 89999999);
        // int num_len = Long.toString(pepe).length();
        long num_final = pepe + 10000000;
        return num_final;
    }

    /** Método toString para ver todos los datos por consola **/
    @Override
    public String toString() {
        System.out.printf("Cuenta %d. Saldo: %f\n Titular: %s - %s %s", this.num_cuenta,
                          this.cantidad_dinero, this.nif_o_nie, this.nombre,
                          this.apellido);
        return "";
    }
    public void reembolsarDinero() {}
}
