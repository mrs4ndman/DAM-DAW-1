package ejercicios6_3;

public class PruebaBancaria {
    public static void main(String[] args) throws InterruptedException {
        CuentaBancaria pepe = new CuentaBancaria(1000000, "12345678X", "Pepe", "Pepón");
        System.out.println(pepe.toString());
    }
}
