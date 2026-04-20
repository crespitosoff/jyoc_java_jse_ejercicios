package bifuraciones;

import java.util.Scanner;

// 2.c.2. Pedir por teclado un número de 4 cifras y decir si es capicúa.
public class Ejercicio2c2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un número de 4 cifras: ");

            if (!sc.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero.");
                return;
            }

            int numero = sc.nextInt();

            if (esNumeroDeCuatroCifras(numero)) {
                if (esCapicuaDeCuatroCifras(numero)) {
                    System.out.println("El número " + numero + " es capicúa.");
                } else {
                    System.out.println("El número " + numero + " no es capicúa.");
                }
            } else {
                System.out.println("Error: El número debe tener exactamente 4 cifras (1000 a 9999).");
            }
        }
    }

    /**
     * Verifica si un número tiene exactamente 4 dígitos.
     */
    private static boolean esNumeroDeCuatroCifras(int numero) {
        return numero >= 1000 && numero <= 9999;
    }

    /**
     * Determina si un número de 4 cifras es capicúa comparando sus extremos.
     */
    private static boolean esCapicuaDeCuatroCifras(int numero) {
        int millar = numero / 1000;
        int centena = (numero / 100) % 10;
        int decena = (numero / 10) % 10;
        int unidad = numero % 10;

        // En un número de 4 cifras: el 1º debe ser igual al 4º, y el 2º al 3º.
        return (millar == unidad) && (centena == decena);
    }
}
