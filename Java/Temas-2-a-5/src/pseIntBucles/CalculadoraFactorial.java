package pseIntBucles;

import java.util.Scanner;

public class CalculadoraFactorial {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        long i, factInput, factResultado;


        System.out.println("Dime un número y te digo su factorial");
        factInput = numInput.nextLong();

        factResultado = 1;

        for (i = (factInput); i > 0; i--) {
            factResultado = factResultado * i;
            numInput.close();
        }
        numInput.close();


        System.out.println(factResultado);
    }    
}
