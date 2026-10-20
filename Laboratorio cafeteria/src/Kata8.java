import java.util.Scanner;

public class Kata8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de empleados: ");
        int numEmpleados = sc.nextInt();
        sc.nextLine(); // limpio el salto de línea que deja nextInt antes de leer el nombre

        if (numEmpleados == 0) {
            System.out.println("No se ingresaron empleados");
        } else {
            int totalHoras = 0;
            int masDe40 = 0;
            int menosDe20 = 0;
            String nombresMasDe40 = "";
            int nombresAgregados = 0;

            for (int i = 1; i <= numEmpleados; i++) {
                System.out.print("Empleado " + i + ": ");
                String nombre = sc.nextLine();

                int horas;
                do {
                    System.out.print("Horas trabajadas: ");
                    horas = sc.nextInt();
                    if (horas < 0) {
                        System.out.println("Error: las horas no pueden ser negativas");
                    }
                } while (horas < 0);
                sc.nextLine(); // otra vez limpiamos el salto de línea

                totalHoras += horas;

                if (horas > 40) {
                    masDe40++;
                    // La coma va antes del nombre, y solo si ya había uno en la lista
                    if (nombresAgregados > 0) {
                        nombresMasDe40 += ", ";
                    }
                    nombresMasDe40 += nombre;
                    nombresAgregados++;
                }
                if (horas < 20) {
                    menosDe20++;
                }
            }

            double promedio = (double) totalHoras / numEmpleados;
            int sueldoTotal = totalHoras * 12000;

            System.out.println("--- Reporte de Turnos ---");
            System.out.println("Total de horas: " + totalHoras);
            System.out.println("Promedio de horas: " + String.format("%.2f", promedio));
            if (masDe40 > 0) {
                System.out.println("Empleados con más de 40 horas: " + masDe40 + " (" + nombresMasDe40 + ")");
            } else {
                System.out.println("Empleados con más de 40 horas: 0");
            }
            System.out.println("Empleados con menos de 20 horas: " + menosDe20);
            System.out.println("Sueldo total: $" + String.format("%,d", sueldoTotal).replace(',', '.'));
        }

        sc.close();
    }
}