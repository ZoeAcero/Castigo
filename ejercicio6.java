import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de N: ");
        int N = scanner.nextInt();

        int[] primes = getFirstNPrimes(N);

        System.out.println("Los primeros " + N + " números primos son:");
        for (int prime : primes) {
            System.out.println(prime);
        }

        scanner.close();
    }

    public static int[] getFirstNPrimes(int N) {
        int[] primes = new int[N];
        int count = 0;
        int number = 2;

        while (count < N) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }

        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
