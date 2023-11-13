package pseIntBucles;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double num;
		double root_checker;
		int i, /* userInput, */ prime_max;
		prime_max = 2;
		System.out.println("Dime un número:");
		num = input.nextInt();

		while (num <= 0) {
			System.out.println("Introduce un número:");
			num = input.nextInt();
		}

		i = 1;
		prime_max = 2;
		root_checker = Math.sqrt(num);

		while (i++ < root_checker) {
			if (num % i == 0) {
				prime_max = 3;
			}
			if (num == 2) {
				prime_max = 2;
			}
		}

		if (prime_max > 2) {
			System.out.println("No es primo");
		} else {
			System.out.println("El número es primo");
		}
		input.close();
	
	}
}
