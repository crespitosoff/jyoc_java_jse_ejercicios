package entrada_salida;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un primer número:");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese un segundo número:");
        int numero2 = teclado.nextInt();
        System.out.println("los números son " + numero1 + " e " + numero2);
    }
}
