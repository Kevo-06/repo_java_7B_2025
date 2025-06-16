import java.util.Scanner;

public class PremiosTorneo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el puesto en el torneo
        System.out.print("Ingrese el puesto que obtuvo en el torneo: ");
        int puesto = scanner.nextInt();

        // Determinar el premio según el puesto
        switch (puesto) {
            case 1:
                System.out.println("El primero obtiene la medalla de oro.");
                break;
            case 2:
                System.out.println("El segundo obtiene la medalla de plata.");
                break;
            case 3:
                System.out.println("El tercero obtiene la medalla de bronce.");
                break;
            default:
                System.out.println("Siga participando.");
        }

        scanner.close();
    }
}
