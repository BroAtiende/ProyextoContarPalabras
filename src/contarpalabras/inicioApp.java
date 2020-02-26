package contarpalabras;

import java.util.*;

public class inicioApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("");
        System.out.print("Introduce una frase agradable sujeto: ");
        String frasecitaxd = sc.nextLine();
        int contadorpalabras = 1;
        int contadorcaracteres = 0;
        char[] Arraycadena = frasecitaxd.toCharArray();
        int[] cuantasVeces = new int[Character.MAX_VALUE];

        mostrarResultado(frasecitaxd, contarPalabras(frasecitaxd, contadorpalabras), contadorcaracteres, cuantasVeces, Arraycadena);
    }

    static int contarPalabras(String frasecitaxd, int contadorpalabras) {

        for (int i = 0; i < frasecitaxd.length(); i++) {
            if (frasecitaxd.charAt(i) == ' ') {
                contadorpalabras++;
            }
        }
        return contadorpalabras;
    }

    static void mostrarResultado(String frasecitaxd, int contadorpalabras, int contadorcaracteres, int[] cuantasVeces, char[] Arraycadena) {
        System.out.println("");
        System.out.println("LA FRASE \"" + frasecitaxd + "\" CONTIENE....");
        for (int i = 0; i < frasecitaxd.length(); i++) {
            char caracter = Arraycadena[i];

            if (frasecitaxd.charAt(i) != ' ') {
                if (Arraycadena[i] == caracter) {
                    cuantasVeces[caracter]++;
                }
                if (cuantasVeces[caracter] == 1) {
                    System.out.println("El caracter " + caracter + " se introduce por primera vez");
                } else {
                    System.out.println("El caracter " + caracter + " se introduce " + cuantasVeces[caracter] + " veces");
                }
                contadorcaracteres++;
            }
        }
        System.out.println("");
        System.out.println("En resumen..");
        if (contadorpalabras > 1) {
            System.out.println("La frase contiene " + contadorpalabras + " palabras");
        } else {
            System.out.println("La frase contiene 1 palabra");
        }
        System.out.println("Con una cantidad de " + contadorcaracteres + " caracteres");

    }
}
