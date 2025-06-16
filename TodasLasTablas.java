public class TodasLasTablas {
    public static void main(String[] args) {

        // Ciclo externo para recorrer las tablas del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");

            // Ciclo interno para mostrar los productos del 1 al 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // Línea en blanco entre tablas
        }
    }
}
