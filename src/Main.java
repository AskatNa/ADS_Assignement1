import java.util.Scanner;

public class Main {
    public static void isPowerOfTwo(int n) {
        if (n <= 0) {
            System.out.println("Can`t be negative");
        } else if (n == 1) {
            System.out.println("Power of two");
        } else if (n % 2 == 0) {
            System.out.println("Power of two");
        } else {
            System.out.println("Not the power of two");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isPowerOfTwo(number);

    }
}
