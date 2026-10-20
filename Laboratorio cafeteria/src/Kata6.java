import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalClientes = 0;
        int contadorHoras = 0;
        int horaPico = -1;
        int maxClientes = -1; // en -1 el primer registro siempre se vuelve el pico, incluso con 0 clientes

        System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
        int hora = sc.nextInt();

        while (hora != -1) {
            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida");
            } else {
                int clientes;
                do {
                    System.out.print("Ingresa el número de clientes en esa hora: ");
                    clientes = sc.nextInt();
                    if (clientes < 0) {
                        System.out.println("Número de clientes inválido");
                    }
                } while (clientes < 0);

                totalClientes += clientes;
                contadorHoras++;

                if (clientes > maxClientes) {
                    maxClientes = clientes;
                    horaPico = hora;
                }
            }

            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            hora = sc.nextInt();
        }

        if (contadorHoras == 0) {
            System.out.println("No se ingresaron datos");
        } else {
            // El (double) evita que la división entre enteros se corte sin decimales
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("--- Reporte de Clientes ---");
            System.out.println("Total de clientes: " + totalClientes);
            System.out.println("Promedio por hora: " + String.format("%.2f", promedio));
            System.out.println("Hora con más clientes: " + horaPico + " (" + maxClientes + " clientes)");
        }

        sc.close();
    }
}