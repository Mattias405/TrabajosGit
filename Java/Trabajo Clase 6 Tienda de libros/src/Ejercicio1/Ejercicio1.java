package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombreLibro;
        int idLibro;
        double precioLibro;
        boolean envioGratuito;

        System.out.println("Ingrese el nombre del libro:");
        nombreLibro = entrada.nextLine();

        System.out.println("Ingrese el ID del libro:");
        idLibro = entrada.nextInt();

        System.out.println("Ingrese el precio del libro:");
        precioLibro = entrada.nextDouble();

        System.out.println("¿El envío es gratuito? (true/false):");
        envioGratuito = entrada.nextBoolean();

        System.out.println("Nombre: " + nombreLibro);
        System.out.println("ID: " + idLibro);
        System.out.println("Precio: " + precioLibro);
        System.out.println("¿Envío Gratuito?: " + envioGratuito);

    }
}