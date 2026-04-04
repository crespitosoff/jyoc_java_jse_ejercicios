package bifuraciones;

import java.util.Scanner;
// 2.b.1. Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado.
// Se permiten números de hasta 5 cifras.
public class Ejercicio2b1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while(true){
            System.out.println("Ingrese un número entero de máximo 5 cifras:");
            int numero = teclado.nextInt();

            if (numero > -100000 && numero < 100000){
                numero = Math.abs(numero); // Manejar negativos

                while (numero >= 10){
                    numero /= 10;
                }

                System.out.println("La primera cifra es: " + numero);
                break;
            }

            System.out.println("Intente de nuevo");

        }


//        while (true){
//            System.out.println("Ingrese un número entero de máximo 5 cifras:");
//            int numero = teclado.nextInt();
//            if (numero > -100000 && numero < 100000){
//                String cadenaString = Integer.toString(numero);
//
//                int[] digitosCadenaString = new int[cadenaString.length()];
//
//                // Convierte el caracter en su valor numérico
//                digitosCadenaString[0] = Character.getNumericValue(cadenaString.charAt(0));
//
//                System.out.println("La primera cifra es: " + digitosCadenaString[0]);
//                break;
//            }
//            System.out.println("Intente de nuevo");
//        }

        teclado.close();
    }
}
