import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isPowerOfTwo(number);
        
    }
}