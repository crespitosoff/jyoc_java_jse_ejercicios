package arrays;

public class EjercicioIII {
    public static void main(String[] args) {
        int[] vectorDeDatos = {8, 2, 5, 4, 9, 1, 0, 8, 9, 3};
        for (int i = 1; i < vectorDeDatos.length; i = i + 2) {
            System.out.println(vectorDeDatos[i]);
        }
    }
}