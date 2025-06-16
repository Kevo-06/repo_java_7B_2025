import java.util.Scanner;

public class DocenaANDyOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el número al usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Verificar si está fuera de rango (usando OR)
        if (numero < 1 || numero > 36) {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
        // Primera docena (usando AND)
        else if (numero >= 1 && numero <= 12) {
            System.out.println("El número " + numero + " pertenece a la primera docena.");
        }
        // Segunda docena (usando AND)
        else if (numero >= 13 && numero <= 24) {
            System.out.println("El número " + numero + " pertenece a la segunda docena.");
        }
        // Tercera docena (usando AND)
        else if (numero >= 25 && numero <= 36) {
            System.out.println("El número " + numero + " pertenece a la tercera docena.");
        }

        scanner.close();
    }
}
