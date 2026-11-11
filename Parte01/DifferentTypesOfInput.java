import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. String
        System.out.println("Give a string:");
        String text = scan.nextLine();

        // 2. Integer
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());

        // 3. Double
        System.out.println("Give a double:");
        double floatingNumber = Double.valueOf(scan.nextLine());

        // 4. Boolean
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());

        // 5. Salida de resultados
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floatingNumber);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
