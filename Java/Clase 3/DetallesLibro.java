import java.util.Scanner;

public class DetallesLibro {
    public static void main(String[] args) {
        
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // 1. Pedir nombre del libro
        System.out.print("Ingrese el nombre del libro: ");
        String nombreLibro = scanner.nextLine();
        
        // 2. Pedir autor del libro
        System.out.print("Ingrese el nombre del autor: ");
        String nombreAutor = scanner.nextLine();
        
        // 3. Mostrar información en consola
        System.out.println(nombreLibro + " fue escrito por " + nombreAutor);
        
        // Cerrar scanner
        scanner.close();
    }
}