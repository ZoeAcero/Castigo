import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        int[] numbers = readNumbers();
        double average = calculateAverage(numbers);
        int minimum = calculateMinimum(numbers);
        int maximum = calculateMaximum(numbers);

        System.out.println("Average: " + average);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }

    public static int[] readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter 0 to stop):");

        int[] numbers = new int[0];
        int input;
        do {
            input = scanner.nextInt();
            if (input != 0) {
                numbers = addElement(numbers, input);
            }
        } while (input != 0);

        scanner.close();
        return numbers;
    }

    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    public static int calculateMinimum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        return minimum;
    }

    public static int calculateMaximum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }

    public static int[] addElement(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = element;
        return newArray;
    }
}

