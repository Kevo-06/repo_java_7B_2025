import java.util.Scanner;

public class NivelEducativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de curso
        System.out.print("Ingrese el número de curso (por ejemplo: 0, 1, 5, 7, etc.): ");
        int curso = scanner.nextInt();

        // Evaluar el curso e indicar el nivel educativo
        if (curso == 0) {
            System.out.println("Jardín de infantes");
        } else if (curso >= 1 && curso <= 6) {
            System.out.println("Primaria");
        } else if (curso >= 7 && curso <= 12) {
            System.out.println("Secundaria");
        } else {
            System.out.println("Curso no reconocido");
        }

        scanner.close();
    }
}
