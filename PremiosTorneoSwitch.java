import java.util.Scanner;

public class PremiosTorneoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el puesto
        System.out.print("Ingrese el puesto obtenido (número entero): ");
        int puesto = scanner.nextInt();

        // Evaluar el puesto con switch
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
                break;
        }

        scanner.close();
    }
}
