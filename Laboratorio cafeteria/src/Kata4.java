import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el día (1=Lunes, 7=Domingo): ");
        int dia = sc.nextInt();
        System.out.print("Ingresa la hora (0-23): ");
        int hora = sc.nextInt();

        if (dia < 1 || dia > 7) {
            System.out.println("Error: día inválido");
        } else if (hora < 0 || hora > 23) {
            System.out.println("Error: hora inválida");
        } else {
            boolean abierta = false;
            String horario = "";

            switch (dia) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    // Lunes a viernes: de 6:00 AM a 8:00 PM (20 en formato 0-23)
                    abierta = hora >= 6 && hora < 20;
                    horario = "Horario de lunes a viernes: 6:00 AM - 8:00 PM";
                    break;
                case 6:
                    // Sábado: de 7:00 AM a 2:00 PM (14 en formato 0-23)
                    abierta = hora >= 7 && hora < 14;
                    horario = "Horario de sábado: 7:00 AM - 2:00 PM";
                    break;
                case 7:
                    // Domingo: cerrado, abierta se queda en false
                    horario = "Horario de domingo: cerrado todo el día";
                    break;
            }

            if (abierta) {
                System.out.println("La cafetería está abierta.");
            } else {
                System.out.println("La cafetería está cerrada.");
            }
            System.out.println(horario);
        }

        sc.close();
    }
}