import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Entrada: solicitud y lectura del año introducido por el usuario
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        // 2. Proceso y salida: descarte de años no bisiestos (no múltiplos de 4 o seculares no múltiplos de 400)
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("The year is not a leap year.");
        } else {
            System.out.println("The year is a leap year.");
        }
    }
}
