import java.util.Scanner;

public class EvaluacionesAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de notas
        System.out.print("Ingrese la primera nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("Ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("Ingrese la tercera nota: ");
        int nota3 = scanner.nextInt();

        // Cálculo del promedio
        double promedio = (nota1 + nota2 + nota3) / 3.0;

        // Determinar aprobado o reprobado con un único if
        if (promedio >= 7)
            System.out.println("Aprobado");
        else
            System.out.println("Reprobado");

        // --- Parte A: Suma de pares utilizando IF ---
        int sumaParesConIf = 0;
        if (nota1 % 2 == 0) sumaParesConIf += nota1;
        if (nota2 % 2 == 0) sumaParesConIf += nota2;
        if (nota3 % 2 == 0) sumaParesConIf += nota3;

        System.out.println("Suma de valores pares (usando if): " + sumaParesConIf);

        // --- Parte B: Suma de pares SIN usar IF ---
        // Se usa una expresión lógica que vale 0 si es impar, o la nota si es par
        int sumaParesSinIf =
            (nota1 % 2 == 0 ? nota1 : 0) +
            (nota2 % 2 == 0 ? nota2 : 0) +
            (nota3 % 2 == 0 ? nota3 : 0);

        System.out.println("Suma de valores pares (sin usar if): " + sumaParesSinIf);

        scanner.close();
    }
}
