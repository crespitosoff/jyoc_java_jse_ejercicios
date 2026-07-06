package bucles;

import java.util.Scanner;

public class Ejercicio3b2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int base = leerEnteroPositivo(sc, "Ingrese la base: ");
            int exponente = leerEnteroPositivo(sc, "Ingrese el exponente: ");
            long resultado = calcularPotenciaYMostrarPasos(base, exponente);
            System.out.println(", el resultado es: " + resultado);
        }
    }

    private static int leerEnteroPositivo(Scanner sc, String mensaje) {
        int numero = -1;
        while (numero < 0) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero < 0) System.out.println("Debe ser un número positivo.");
            } else {
                System.out.println("Entrada inválida.");
                sc.next(); // Limpiar buffer
            }
        }
        return numero;
    }

    private static long calcularPotenciaYMostrarPasos(int base, int exponente) {
        if (exponente == 0) {
            System.out.print(base + "^0");
            return 1;
        }

        long acumulador = 1;
        StringBuilder pasos = new StringBuilder();

        for (int i = 0; i < exponente; i++) {
            acumulador *= base;
            pasos.append(base);
            if (i < exponente - 1) pasos.append("*");
        }

        System.out.print(pasos.toString());
        return acumulador;
    }
}