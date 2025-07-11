import java.util.Scanner;

public class EvaluacionAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir las 3 notas
        System.out.print("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Evaluar con un único if
        if (promedio >= 7) {
            System.out.println("Aprobado con un promedio de: " + promedio);
        } else {
            System.out.println("Reprobado con un promedio de: " + promedio);
        }

        scanner.close();
    }
}
