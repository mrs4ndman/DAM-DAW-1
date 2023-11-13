package ejerciciosFunciones;

import javax.swing.JOptionPane;

public class NumeroInvertido {
    public static void main(String[] args) {
        String textbox = JOptionPane.showInputDialog("Escribe un número a invertir");
        int numeroNormal = Integer.parseInt(textbox);

        int numero_ya_invertido = numeroInvertido(numeroNormal);
        JOptionPane.showMessageDialog(null, numero_ya_invertido);
        
    }
    public static int numeroInvertido(int numeroNormal) {
        int numeroFinal = 0;
        if (numeroNormal == 0) {
            return 0;
        } else if (numeroNormal < 10){
            return numeroNormal;
        }
        while ( numeroNormal > 0) {
            int cifra = numeroNormal % 10;
            numeroNormal /= 10;
            numeroFinal = numeroFinal * 10 + cifra;
        }
        return numeroFinal;
    }
}
