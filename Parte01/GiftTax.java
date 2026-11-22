import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1. Entrada: lectura del valor del regalo como decimal para evitar truncamientos
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());

        // 2. Proceso y salida: evaluación secuencial de tramos progresivos (de menor a mayor)
        // Cada 'else if' descarta el tramo anterior y aplica: base + (exceso * porcentaje)
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value < 25000) {
            double tax = 100 + (value - 5000) * 0.08;
            System.out.println("Tax: " + tax);
        } else if (value < 55000) {
            double tax = 1700 + (value - 25000) * 0.10;
            System.out.println("Tax: " + tax);
        } else if (value < 200000) {
            double tax = 4700 + (value - 55000) * 0.12;
            System.out.println("Tax: " + tax);
        } else if (value < 1000000) {
            double tax = 22100 + (value - 200000) * 0.15;
            System.out.println("Tax: " + tax);
        } else {
            double tax = 142100 + (value - 1000000) * 0.17;
            System.out.println("Tax: " + tax);
        }
    }
}
