package entrada_salida;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre = teclado.nextLine();
        System.out.println("buenas tardes, Sr " + nombre);
    }
}
