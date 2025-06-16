import java.util.Random;

public class MaxMinDoWhile {
    public static void main(String[] args) {
        Random random = new Random();

        int contador = 0;
        int maximo = Integer.MIN_VALUE;  // Inicializo al valor mínimo posible
        int minimo = Integer.MAX_VALUE;  // Inicializo al valor máximo posible

        System.out.println("Números aleatorios generados:");

        do {
            int numero = random.nextInt(100) + 1; // Números entre 1 y 100
            System.out.println("Número " + (contador + 1) + ": " + numero);

            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }

            contador++;
        } while (contador < 10);

        System.out.println("\nNúmero máximo: " + maximo);
        System.out.println("Número mínimo: " + minimo);
    }
}
