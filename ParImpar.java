import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
