package bucles;

import java.util.Scanner;

// 3.b.1. Programa que pide por teclado 5 números, y en el caso en el que el primero introducido sea igual al
// último, nos muestra la media de ambos. En caso contrario, no se mostrará nada.
public class Ejercicio3b1 {
    public static void main(String[] args) {
        final int TOTAL_NUMEROS = 5;
        try (Scanner sc = new Scanner(System.in)) {
            int[] numeros = new int[TOTAL_NUMEROS];
            
            for (int i = 0; i < TOTAL_NUMEROS; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                if (!sc.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero.");
                    return;
                }
                numeros[i] = sc.nextInt();
            }

            int primero = numeros[0];
            int ultimo = numeros[TOTAL_NUMEROS - 1];

            if (primero == ultimo) {
                double promedio = (primero + ultimo) / 2.0;
                System.out.printf("El primer número (%d) es igual al último (%d). Promedio: %.2f%n", primero, ultimo, promedio);
            }
        }
    }
}
