package entrada_salida;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la edad:");
        int edad = teclado.nextInt();
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}
