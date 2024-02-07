import java.util.Random;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int dimension = readDimension();
        int[][] matrix = generateSymmetricMatrix(dimension);
        printMatrix(matrix);
    }

    public static int readDimension() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz cuadrada:");
        int dimension = scanner.nextInt();
        scanner.close();
        return dimension;
    }

    public static int[][] generateSymmetricMatrix(int dimension) {
        int[][] matrix = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int randomNumber = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
                matrix[i][j] = randomNumber;
                matrix[j][i] = randomNumber;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}