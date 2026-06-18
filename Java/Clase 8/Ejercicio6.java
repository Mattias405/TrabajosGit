import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float guillermo, luis, juan, total;

        System.out.print("Ingrese el dinero de Guillermo: ");
        guillermo = entrada.nextFloat();

        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;

        total = guillermo + luis + juan;

        System.out.println("Entre los tres tienen: $" + total);

    
    }
}