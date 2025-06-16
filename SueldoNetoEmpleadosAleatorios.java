public class SueldoNetoEmpleadosAleatorios {
    public static void main(String[] args) {

        int empleadosProcesados = 0;

        while (empleadosProcesados < 10) {
            // Generar categoría válida con while y Math.random()
            char categoria;
            while (true) {
                double randomCat = Math.random(); // valor entre 0 y 1
                if (randomCat < 1.0/3) {
                    categoria = 'A';
                } else if (randomCat < 2.0/3) {
                    categoria = 'B';
                } else {
                    categoria = 'C';
                }
                // Solo salgo del ciclo si la categoría es válida (siempre lo es en esta lógica)
                if (categoria == 'A' || categoria == 'B' || categoria == 'C') {
                    break;
                }
            }

            // Generar antigüedad aleatoria entre 0 y 20 años (int)
            int antiguedad = (int)(Math.random() * 21); // 0 a 20 inclusive

            // Generar sueldo bruto aleatorio entre 20000 y 100000
            double sueldoBruto = 20000 + Math.random() * (100000 - 20000);

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
                case 'A': plus = 1000; break;
                case 'B': plus = 2000; break;
                case 'C': plus = 3000; break;
            }

            // Calcular sueldo neto
            double sueldoNeto = sueldoBruto + aumento + plus;

            // Mostrar resultados del empleado
            System.out.println("Empleado " + (empleadosProcesados + 1));
            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.printf("Sueldo bruto: $%.2f\n", sueldoBruto);
            System.out.printf("Aumento: $%.2f\n", aumento);
            System.out.println("Plus: $" + plus);
            System.out.printf("Sueldo neto: $%.2f\n", sueldoNeto);
            System.out.println("-----------------------------------------");

            empleadosProcesados++;
        }
    }
}
