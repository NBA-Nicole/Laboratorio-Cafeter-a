import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la bebida: ");
        String nombre = sc.nextLine(); // nextLine para que acepte nombres con espacios

        System.out.print("Ingresa la temperatura: ");
        double temperatura = sc.nextDouble();

        String clasificacion;

        if (temperatura > 60) {
            clasificacion = "Caliente";
        } else if (temperatura >= 30) {
            // Si llego aqui ya se que es <= 60, solo falta revisar el límite de abajo
            clasificacion = "Templada";
        } else {
            clasificacion = "Fría";
        }

        System.out.println(nombre + ": " + clasificacion);

        sc.close();
    }
}