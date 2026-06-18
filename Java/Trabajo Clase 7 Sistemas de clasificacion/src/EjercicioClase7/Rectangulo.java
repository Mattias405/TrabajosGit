import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double base, altura, area, perimetro;

        System.out.print("Ingrese la base: ");
        base = entrada.nextDouble();

        System.out.print("Ingrese la altura: ");
        altura = entrada.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
