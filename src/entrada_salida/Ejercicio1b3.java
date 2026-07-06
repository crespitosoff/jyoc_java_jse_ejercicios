package entrada_salida;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1b3 {
    private static final double MEDIA_OBJETIVO = 5.0;
    private static final double NOTA_MAXIMA = 10.0;

    public static void main(String[] args) {
        // Usamos Locale.US para asegurar que el decimal sea punto (.) y no coma (,)
        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Ingrese la nota del primer examen: ");
            
            if (!sc.hasNextDouble()) {
                System.err.println("Entrada no válida.");
                return;
            }

            double nota1 = sc.nextDouble();
            
            // Lógica: (n1 + n2) / 2 = Media -> n1 + n2 = Media * 2 -> n2 = (Media * 2) - n1
            double notaNecesaria = (MEDIA_OBJETIVO * 2) - nota1;

            // Ajustamos el resultado a la realidad académica
            double resultadoFinal = Math.max(0, Math.min(NOTA_MAXIMA, notaNecesaria));

            System.out.printf("Nota necesaria para media de %.1f: %.2f%n", MEDIA_OBJETIVO, resultadoFinal);
            
            if (notaNecesaria > NOTA_MAXIMA) {
                System.out.println("Aviso: Es matemáticamente imposible alcanzar la media deseada.");
            }
        }
    }
}
