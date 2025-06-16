import java.util.Scanner;

public class SueldoNetoEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer categoría
        System.out.print("Ingrese la categoría (A, B, C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        // Leer antigüedad
        System.out.print("Ingrese la antigüedad en años: ");
        int antiguedad = scanner.nextInt();

        // Leer sueldo bruto
        System.out.print("Ingrese el sueldo bruto: ");
        double sueldoBruto = scanner.nextDouble();

        // Calcular aumento según antigüedad
        double aumento = 0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = 0.05 * sueldoBruto;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = 0.10 * sueldoBruto;
        } else if (antiguedad > 10) {
            aumento = 0.30 * sueldoBruto;
        }

        // Calcular plus según categoría
        double plus = 0;
        switch (categoria) {
            case 'A':
                plus = 1000;
                break;
            case 'B':
                plus = 2000;
                break;
            case 'C':
                plus = 3000;
                break;
            default:
                System.out.println("Categoría no válida. Asignando plus 0.");
        }

        // Calcular sueldo neto
        double sueldoNeto = sueldoBruto + aumento + plus;

        // Mostrar resultados
        System.out.println("\nSueldo bruto: $" + sueldoBruto);
        System.out.println("Aumento por antigüedad: $" + aumento);
        System.out.println("Plus por categoría: $" + plus);
        System.out.println("Sueldo neto total: $" + sueldoNeto);

        scanner.close();
    }
}
