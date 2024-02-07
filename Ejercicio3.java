public class Main {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        int[] multiplesOf5 = getMultiplesOf5(begin, end);
        int sum = sumArrayValues(multiplesOf5);

        System.out.println("La suma de todos los múltiplos de 5 es: " + sum);
        System.out.println("Hay " + multiplesOf5.length + " múltiplos de 5.");
        System.out.println("Los múltiplos de 5 son:");

        for (int i = 0; i < multiplesOf5.length; i++) {
            System.out.println(multiplesOf5[i]);
        }
    }

    public static int[] getMultiplesOf5(int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }

        int[] multiples = new int[count];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiples[index] = i;
                index++;
            }
        }

        return multiples;
    }

    public static int sumArrayValues(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
