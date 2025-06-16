import java.util.Random;

public class NumerosAzarWhile {
    public static void main(String[] args) {
        Random random = new Random(); // Para generar números aleatorios

        int contador = 0;
        int suma = 0;

        System.out.println("Números aleatorios generados:");

        while (contador < 10) {
            int numero = random.nextInt(100) + 1; // Números entre 1 y 100
            System.out.println("Número " + (contador + 1) + ": " + numero);
            suma += numero;
            contador++;
        }

        double promedio = suma / 10.0;

        System.out.println("\nSuma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
