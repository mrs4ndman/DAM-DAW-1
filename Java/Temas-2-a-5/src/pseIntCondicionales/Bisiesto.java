package pseIntCondicionales;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner inputter = new Scanner(System.in);

        long inputYear;
        System.out.println("Dime el año y te digo si es bisiesto o no");
        inputYear = inputter.nextLong();

        if ( ( ( inputYear % 100 != 0 ) && (inputYear % 4 == 0 ) ) || ( (inputYear % 100 == 0) && (inputYear % 400 == 0  ) ) ) {
            System.out.println("Bisiesto");
        } else {
            System.out.println("No bisiesto");
        }

        inputter.close();
    }
}
