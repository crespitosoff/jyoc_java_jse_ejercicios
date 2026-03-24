package entrada_salida;

public class Ejercicio9 {
    public static void main(String[] args) {
        // números al azar entre 10 y 20
        for (int i = 0; i < 2; i++) {
            int numero = (int) (Math.random() * 11) + 10;
            System.out.println(numero);
        }
    }
}
