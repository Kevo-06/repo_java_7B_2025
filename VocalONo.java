import java.util.Scanner;

public class VocalONo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un carácter
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().toLowerCase().charAt(0); // Convertir a minúscula para simplificar

        // Verificar si es vocal usando OR (||)
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("El carácter '" + caracter + "' es una vocal.");
        } else {
            System.out.println("El carácter '" + caracter + "' no es una vocal.");
        }

        scanner.close();
    }
}
