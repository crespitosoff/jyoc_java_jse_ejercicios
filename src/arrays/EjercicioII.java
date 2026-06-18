package arrays;

public class EjercicioII {
    public static void main(String[] args) {
        int[] vectorDeDatos = {8, 2, 5, 4, 9, 1, 0, 8, 9, 3};

        for (int i = 0; i < vectorDeDatos.length; i++) {
            if (vectorDeDatos[i] % 2 == 0) {
                System.out.println(vectorDeDatos[i]);
            }

        }
    }
}
