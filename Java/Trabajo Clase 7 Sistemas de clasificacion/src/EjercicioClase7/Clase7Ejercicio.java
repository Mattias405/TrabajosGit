package EjercicioClase7;

import java.util.Scanner;

public class Clase7Ejercicio {

    public static void main(String[] args) {
        // Creamos el Scanner para leer los datos que el usuario escriba en la consola
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una nota del 0 al 10: ");
        
        // Validamos que el usuario ingrese un número entero
        if (scanner.hasNextInt()) {
            int nota = scanner.nextInt();
            
       
            if (nota == 9 || nota == 10) {
                System.out.println("A");
            } else if (nota >= 8 && nota < 9) {
                System.out.println("B");
            } else if (nota >= 7 && nota < 8) {
                System.out.println("C");
            } else if (nota >= 6 && nota < 7) {
                System.out.println("D");
            } else if (nota >= 0 && nota < 6) {
                System.out.println("F");
            } else {
                System.out.println("El valor ingresado es incorrecto");
            }
        } else {
            System.out.println("Por favor, ingrese un número válido.");
        }
        
        scanner.close();
    }
}