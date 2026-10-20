import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el total de la cuenta: ");
        int total = sc.nextInt();
        System.out.print("Ingresa el porcentaje de propina: ");
        int porcentaje = sc.nextInt();

        if (total <= 0) {
            System.out.println("Error: total inválido");
        } else if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Error: porcentaje inválido");
        } else {

            int propina = total * porcentaje / 100;
            int totalAPagar = total + propina;

            System.out.println("Propina: $" + propina);
            System.out.println("Total a pagar: $" + totalAPagar);

            // Entre 5 y 30 (incluidos) no se muestra nada extra
            if (porcentaje > 30) {
                System.out.println("¡Propina generosa!");
            } else if (porcentaje < 5) {
                System.out.println("Propina muy baja");
            }
        }

        sc.close();
    }
}