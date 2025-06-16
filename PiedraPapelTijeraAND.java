import java.util.Scanner;

public class PiedraPapelTijeraAND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Juego: Piedra (0), Papel (1), Tijera (2)");

        // Ingreso de jugadas
        System.out.print("Jugador 1, ingrese su jugada: ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2, ingrese su jugada: ");
        int jugador2 = scanner.nextInt();

        // Validar entradas
        if (jugador1 >= 0 && jugador1 <= 2 && jugador2 >= 0 && jugador2 <= 2) {

            // Empate
            if (jugador1 == jugador2) {
                System.out.println("Empate.");
            }

            // Jugador 1 gana usando && para todas las condiciones ganadoras
            else if ((jugador1 == 0 && jugador2 == 2) && (jugador1 != jugador2) ||
                     (jugador1 == 1 && jugador2 == 0) && (jugador1 != jugador2) ||
                     (jugador1 == 2 && jugador2 == 1) && (jugador1 != jugador2)) {
                System.out.println("Jugador 1 gana.");
            }

            // Si no es empate ni gana el jugador 1, entonces gana el jugador 2
            else {
                System.out.println("Jugador 2 gana.");
            }

        } else {
            System.out.println("Entrada inválida. Solo se permiten los valores 0, 1 o 2.");
        }

        scanner.close();
    }
}
