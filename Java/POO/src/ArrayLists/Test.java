
package ArrayLists;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner("""
        35
        Colombia Australia-NuevaZelanda Australia-NuevaZelanda Colombia
        Australia-NuevaZelanda Australia-NuevaZelanda Colombia
        Australia-NuevaZelanda Colombia Australia-NuevaZelanda
        Australia-NuevaZelanda Australia-NuevaZelanda Colombia Colombia
        Colombia Colombia Australia-NuevaZelanda Australia-NuevaZelanda
        Australia-NuevaZelanda Australia-NuevaZelanda Australia-NuevaZelanda
        Australia-NuevaZelanda Australia-NuevaZelanda Australia-NuevaZelanda
        Australia-NuevaZelanda Colombia Australia-NuevaZelanda
        Australia-NuevaZelanda Australia-NuevaZelanda Colombia Colombia
        Australia-NuevaZelanda Colombia Colombia Australia-NuevaZelanda
        5
        Brasil Brasil Bolivia Bolivia Argentina
        0""");
    // private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int nVotos;
        while ((nVotos = Integer.parseInt(scanner.nextLine())) != 0 &&
               scanner.hasNextLine()) {
            if (nVotos == 0)
                return;
            String[] entrada = new String[nVotos];
            for (int i = 0; i < nVotos; i++) {
                entrada[i] = scanner.next();
            }
            Map<String, Integer> hm = new HashMap<String, Integer>();
            for (String x : entrada) {
                if (!hm.containsKey(x)) {
                    hm.put(x, 1);
                } else {
                    hm.put(x, hm.get(x) + 1);
                }
            }

            Entry<String, Integer> maxEntry = null;
            Entry<String, Integer> secondEntry = null;

            for (Entry<String, Integer> entry : hm.entrySet()) {
                if (maxEntry == null ||
                    entry.getValue() > maxEntry.getValue()) {
                    maxEntry = entry;
                    if (secondEntry == null ||
                        maxEntry.getValue() == secondEntry.getValue()) {
                        secondEntry = entry;
                    }
                }
            }
            if (maxEntry.getValue() == secondEntry.getValue()) {
                System.out.println("EMPATE");
            } else {
                System.out.println(maxEntry.getKey());
            }
            scanner.nextLine();
        }
    }
}
