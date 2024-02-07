import java.util.Scanner;

public class VectorProduct {
    public static void main(String[] args) {
        int N = readDimension();
        int[] vector1 = readVector(N);
        int[] vector2 = readVector(N);
        int product = calculateProduct(vector1, vector2);

        System.out.println("El producto escalar es: " + product);
    }

    public static int readDimension() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de los vectores:");
        int dimension = scanner.nextInt();
        scanner.close();
        return dimension;
    }

    public static int[] readVector(int dimension) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los elementos del vector separados por espacios:");
        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextInt();
        }
        scanner.close();
        return vector;
    }

    public static int calculateProduct(int[] vector1, int[] vector2) {
        int product = 0;
        for (int i = 0; i < vector1.length; i++) {
            product += vector1[i] * vector2[i];
        }
        return product;
    }
}
