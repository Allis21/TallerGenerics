import java.util.HashMap;
import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();

        System.out.println("Ingresa el texto:");
        String texto = scanner.nextLine();

        String[] palabras = texto.toLowerCase().split("\\W+");

        for (String palabra : palabras) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }

        frecuenciaPalabras.forEach((palabra, frecuencia) ->
                System.out.println("Palabra: '" + palabra + "' - Frecuencia: " + frecuencia));

        scanner.close();
    }
}
