import java.util.Scanner;

public class DiasDelMesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del mes
        System.out.print("Ingrese el nombre del mes: ");
        String mes = scanner.nextLine().toLowerCase(); // Pasamos a minúscula para facilitar la comparación

        // Determinar los días del mes usando switch
        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("El mes de " + mes + " tiene 31 días.");
                break;

            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("El mes de " + mes + " tiene 30 días.");
                break;

            case "febrero":
                System.out.println("El mes de febrero tiene 28 días (29 si es año bisiesto).");
                break;

            default:
                System.out.println("Mes no válido. Verifique la escritura.");
                break;
        }

        scanner.close();
    }
}
