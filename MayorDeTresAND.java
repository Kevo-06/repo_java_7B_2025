import java.util.Scanner;

public class MayorDeTresAND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los 3 números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        // Determinar cuál es el mayor usando AND
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es: " + num3);
        } else {
            System.out.println("Hay al menos dos números iguales y máximos.");
        }

        scanner.close();
    }
}
