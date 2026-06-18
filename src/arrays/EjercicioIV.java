package arrays;

import java.util.Random;

public class EjercicioIV {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] vectorDeDatos = generarVectorAleatorio(15, 1, 10);
        System.out.println("Valores del Array:");
        for (int vectorDeDato : vectorDeDatos) {
            System.out.print(vectorDeDato + " ");
        }
    }

    private static int[] generarVectorAleatorio(int tamano, int min, int max) {
        if (tamano <= 0 || min > max){
            throw new IllegalArgumentException("Tamaño incorrecto o número mínimo es mayor al máximo.");
        }
        int[] vectorDeDatos = new int[tamano];
        for (int i = 0; i < vectorDeDatos.length; i++) {
            vectorDeDatos[i] = RANDOM.nextInt(max - min + 1) + min;
        }
        return vectorDeDatos;
    }
}
