package arrays;

import java.util.Random;

public class EjercicioV {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] vectorDeDatos = generarVectorAleatorio(15, 1, 10);
        System.out.println("Valores del Array:");
        for (int vectorDeDato : vectorDeDatos) {
            System.out.print(vectorDeDato + " ");
        }
        System.out.println("\nEl número mayor es: " + buscarNumeroMayor(vectorDeDatos));
    }

    private static int[] generarVectorAleatorio(int tamano, int min, int max) {
        if (tamano <= 0 || min > max) {
            throw new IllegalArgumentException("Tamaño incorrecto o número mínimo es mayor al máximo.");
        }
        int[] vectorDeDatos = new int[tamano];
        for (int i = 0; i < vectorDeDatos.length; i++) {
            vectorDeDatos[i] = RANDOM.nextInt(max - min + 1) + min;
        }
        return vectorDeDatos;
    }

    private static int buscarNumeroMayor(int[] vectorDeDatos) {
        int max = vectorDeDatos[0];
        for (int vectorDeDato : vectorDeDatos) {
            max = (max < vectorDeDato) ? vectorDeDato : max;
        }
        return max;
    }
}
