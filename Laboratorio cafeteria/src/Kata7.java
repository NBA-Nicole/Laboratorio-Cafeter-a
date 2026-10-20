import java.util.Scanner;

public class Kata7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalCompra = 0;
        String respuesta;

        do {
            System.out.print("Ingresa el precio del producto: ");
            double precio = sc.nextDouble();
            System.out.print("Ingresa la cantidad: ");
            int cantidad = sc.nextInt();

            // Porcentaje de descuento según la cantidad
            int porcentajeDescuento;
            if (cantidad >= 11) {
                porcentajeDescuento = 15;
            } else if (cantidad >= 6) {
                porcentajeDescuento = 10;
            } else if (cantidad >= 3) {
                porcentajeDescuento = 5;
            } else {
                porcentajeDescuento = 0;
            }

            // El descuento va sobre el subtotal, antes del IVA
            double subtotal = precio * cantidad;
            double descuento = subtotal * porcentajeDescuento / 100;
            double subtotalConDescuento = subtotal - descuento;
            double iva = subtotalConDescuento * 0.19;
            double totalProducto = subtotalConDescuento + iva;

            System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
            System.out.println("Descuento (" + porcentajeDescuento + "%): $" + String.format("%.2f", descuento));
            System.out.println("IVA (19%): $" + String.format("%.2f", iva));
            System.out.println("Total: $" + String.format("%.2f", totalProducto));

            totalCompra += totalProducto;

            System.out.print("¿Agregar otro producto? (S/N): ");
            respuesta = sc.next();
        } while (respuesta.equals("S") || respuesta.equals("s"));

        System.out.println("Total de la compra: $" + String.format("%.2f", totalCompra));

        sc.close();
    }
}