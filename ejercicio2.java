public class Main {
    public static void main(String[] args) {
        char mayorChar = (char) (Math.pow(2, 15) - 1);
        short mayorShort = (short) (Math.pow(2, 15) - 1);
        int mayorInt = (int) (Math.pow(2, 31) - 1);

        System.out.println("El mayor número entero representable por un char es: " + mayorChar);
        System.out.println("El mayor número entero representable por un short es: " + mayorShort);
        System.out.println("El mayor número entero representable por un int es: " + mayorInt);
    }
}
