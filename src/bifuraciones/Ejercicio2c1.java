package bifuraciones;

import java.util.Scanner;

// 2.c.1. Pedir por teclado tres números y mostrarlos ordenados de mayor a menor
public class Ejercicio2c1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un primer número:");
        int a = teclado.nextInt();
        System.out.println("Ingrese un segundo número:");
        int b = teclado.nextInt();
        System.out.println("Ingrese un tercer número:");
        int c = teclado.nextInt();
        teclado.close();

        // Usamos una variable temporal para intercambiar los valores
        int temp;

        // Si a es menor que b, los intercambiamos. Ahora 'a' tiene el mayor de los dos.
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        // Si a es menor que c, los intercambiamos. Ahora 'a' tiene el mayor de los tres.
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }

        // Finalmente, si b es menor que c, los intercambiamos.
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Los números ordenados de mayor a menor son:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
