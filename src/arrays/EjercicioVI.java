package arrays;

import java.util.Random;

public class EjercicioVI {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int tamanoRandom = generarNumeroAleatorio(1, 10);
        int[] vectorDeDatos = generarVectorAleatorio(tamanoRandom, 1, 10);
        System.out.println("Valores del Array:");
        for (int vectorDeDato : vectorDeDatos) {
            System.out.print(vectorDeDato + " ");
        }
    }

    private static int generarNumeroAleatorio(int min, int max) {
        validarBordes(min, max);
        return RANDOM.nextInt(max - min + 1) + min;
    }

    private static int[] generarVectorAleatorio(int tamanoRandom, int min, int max) {
        validarTamano(tamanoRandom);
        validarBordes(min, max);
        int[] vectorDeDatos = new int[tamanoRandom];
        for (int i = 0; i < vectorDeDatos.length; i++) {
            vectorDeDatos[i] = generarNumeroAleatorio(min, max);
        }
        return vectorDeDatos;
    }

    private static void validarTamano(int tamanoRandom) {
        if (tamanoRandom <= 0) {
            throw new IllegalArgumentException("Error: Tamaño incorrecto.");
        }
    }

    private static void validarBordes(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Error: Número mínimo es mayor al máximo, el mayor debe ser el máximo.");
        }
    }
}
