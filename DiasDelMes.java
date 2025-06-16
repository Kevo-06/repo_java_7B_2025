import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un mes
        System.out.print("Ingrese el nombre del mes: ");
        String mes = scanner.nextLine().toLowerCase(); // Convertimos a minúsculas para comparar mejor

        int dias;

        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                System.out.println("El mes de " + mes + " tiene " + dias + " días.");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                System.out.println("El mes de " + mes + " tiene " + dias + " días.");
                break;
            case "febrero":
                dias = 28;
                System.out.println("El mes de " + mes + " tiene " + dias + " días.");
                break;
            default:
                System.out.println("El nombre del mes ingresado no es válido.");
        }

        scanner.close();
    }
}
