import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("--- Menú de la Cafetería ---");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Té ($3.000)");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    total += 4000;
                    System.out.println("Producto agregado: Café ($4.000)");
                    break;
                case 2:
                    total += 3500;
                    System.out.println("Producto agregado: Muffin ($3.500)");
                    break;
                case 3:
                    total += 7500;
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                    break;
                case 4:
                    total += 5000;
                    System.out.println("Producto agregado: Jugo ($5.000)");
                    break;
                case 5:
                    total += 3000;
                    System.out.println("Producto agregado: Té ($3.000)");
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        // %,d pone el separador de miles; el replace asegura que sea punto en cualquier computador
        System.out.println("Total del pedido: $" + String.format("%,d", total).replace(',', '.'));

        sc.close();
    }
}