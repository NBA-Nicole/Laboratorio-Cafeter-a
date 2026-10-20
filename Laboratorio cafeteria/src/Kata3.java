import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subtotal = 0;
        int precio;

        // do-while: pide el precio al menos una vez y repite hasta que escriban 0
        do {
            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = sc.nextInt();
            subtotal = subtotal + precio; // sumar un 0 no cambia nada
        } while (precio != 0);

        double iva = subtotal * 0.19;
        double totalConIva = subtotal + iva;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + String.format("%.0f", iva));

        if (totalConIva > 50000) {
            // El descuento va sobre el total con IVA (no sobre el subtotal)
            double descuento = totalConIva * 0.10;
            double totalFinal = totalConIva - descuento;

            System.out.println("Total con IVA: $" + String.format("%.0f", totalConIva));
            System.out.println("Descuento (10%): $" + String.format("%.0f", descuento));
            System.out.println("Total a pagar: $" + String.format("%.0f", totalFinal));
        } else {
            System.out.println("Total: $" + String.format("%.0f", totalConIva));
        }

        sc.close();
    }
}