import java.util.Scanner;

public class MinMaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");

        while (true) {
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("El mínimo es: " + min);
        System.out.println("El máximo es: " + max);

        scanner.close();
    }
}
