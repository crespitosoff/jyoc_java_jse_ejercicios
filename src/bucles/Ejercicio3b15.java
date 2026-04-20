package bucles;

import java.util.StringJoiner;

//3.b.15.Se llama sucesión triangular a la sucesión de números con esta forma: “1, 3, 6, 10, 15, 21, 28…».”.
//Empieza por un valor x=1, luego a x le suma 2, luego le suma 3, luego le suma 4 … Hacer un
//programa que muéstrelos primeros 10 números de la sucesión triangular
public class Ejercicio3b15 {
    public static void main(String[] args) {
        final int LIMITE = 10;
        StringJoiner resultado = new StringJoiner(", ");

        for (int n = 1; n <= LIMITE; n++) {
            // Aplicamos la fórmula directa: T(n) = (n * (n + 1)) / 2
            int triangular = (n * (n + 1)) / 2;
            resultado.add(String.valueOf(triangular));
        }

        System.out.println(resultado.toString());
    }
}