import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2, mayor;

        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();

        mayor = (num1 > num2) ? num1 : num2;

        System.out.println("El numero mayor es: " + mayor);
    }
}