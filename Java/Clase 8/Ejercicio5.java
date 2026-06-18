import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, nota3, suma;

        System.out.print("Ingrese las 3 calificaciones separadas por espacios: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1 + nota2 + nota3;

        System.out.println("La suma de las tres calificaciones es: " + suma);

        
    }
}