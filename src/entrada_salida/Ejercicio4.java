package entrada_salida;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un primer número:");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese un segundo número:");
        int numero2 = teclado.nextInt();
        int resultado = numero1 + numero2;
        System.out.println(numero1 + " mas " + numero2 + " son " + resultado);
    }
}
