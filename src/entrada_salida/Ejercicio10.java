package entrada_salida;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese edad");
        int edad = teclado.nextInt();

        int anios = edad - 18;

        System.out.println("El señor " + nombre + " hace " + anios + " años que es mayor de edad");
    }
}
