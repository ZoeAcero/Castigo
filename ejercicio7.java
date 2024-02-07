import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int number = scanner.nextInt();

        int[] primeFactors = getPrimeFactors(number);

        System.out.print(number + " = ");
        for (int i = 0; i < primeFactors.length; i++) {
            System.out.print(primeFactors[i]);
            if (i < primeFactors.length - 1) {
                System.out.print(" * ");
            }
        }

        scanner.close();
    }

    public static int[] getPrimeFactors(int number) {
        List<Integer> primeFactorsList = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactorsList.add(i);
                number /= i;
            }
        }

        int[] primeFactors = new int[primeFactorsList.size()];
        for (int i = 0; i < primeFactorsList.size(); i++) {
            primeFactors[i] = primeFactorsList.get(i);
        }

        return primeFactors;
    }
}
