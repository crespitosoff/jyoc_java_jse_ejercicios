package entrada_salida;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = teclado.nextInt();
        System.out.println("el número es " + numero);
    }
}
